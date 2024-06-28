package cmpnyTask_Pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.time.Month;
import java.time.YearMonth;
import java.util.List;
//import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_AddTask 
{
	 WebDriver driver;
	 WebDriverWait wait;
	 
	 @BeforeMethod
     public void setup()
	 {
	 	  driver =new ChromeDriver();
	 	  wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  //driver.get("https://www.dev.easyproman.us/admin/login");
		   driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login");
		  driver.manage().window().maximize(); 
	 }
	 
	 @Test
	 public void AddTask_test() throws InterruptedException, IOException, Exception
	 {
		
		 WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(30));
		 waitl.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='open drawer']")));
		 hamburgbtn.click();
		
		 WebDriverWait waitt = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Task_btn = waitt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemText-root css-1tsvksn']/h6[text()='Tasks']")));
		 Task_btn.click();

         WebDriverWait waitat = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement AddTask_btn = waitat.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Task']")));
		 AddTask_btn.click();
		
		 Thread.sleep(2000);
		 WebElement property_Address = wait.until(ExpectedConditions.elementToBeClickable(By.id("propertyAddress")));
		 property_Address.sendKeys("60 Caradon Hill #A1, #B Valley Lane, Round Rock, California, 90001");
		 property_Address.sendKeys(Keys.ARROW_DOWN);
	     property_Address.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("title")).sendKeys("test");  //Title
		 
		 WebElement Assign_to = wait.until(ExpectedConditions.elementToBeClickable(By.id("assignTo")));
		 Assign_to.sendKeys("Smith Peterson");
		 Assign_to.sendKeys(Keys.ARROW_DOWN);
		 Assign_to.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 
		 WebElement Reported_by = wait.until(ExpectedConditions.elementToBeClickable(By.id("reportedBy")));
		 Reported_by.sendKeys("Raymond Lin");
		 Reported_by.sendKeys(Keys.ARROW_DOWN);
		 Reported_by.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 
		 WebElement save_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_btn);
		
	 //Start Date 
		 String sYear = "2024";
	       String sMonth = "June";
	       String sDay = "20"; // Set the desired date to select

	     //calendar btn click
	       WebDriverWait waitsd1 = new WebDriverWait(driver, Duration.ofSeconds(40));
	       WebElement calendarButton1 = null;

	       for (int i = 0; i < 3; i++) {
	           try {
	               calendarButton1 = waitsd1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='Choose date']")));
	               waitsd1.until(ExpectedConditions.elementToBeClickable(calendarButton1));
	               ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", calendarButton1);
	               ((JavascriptExecutor) driver).executeScript("arguments[0].click();", calendarButton1);
	               break;
	           }
	           catch (StaleElementReferenceException e)
	           {
	               Thread.sleep(2000);
	           }
	           catch (Exception e)
	           {
	               e.printStackTrace();
	           }
	       }

	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiPickersCalendarHeader-label")));

	       WebElement YearBtn = driver.findElement(By.xpath("//button[@aria-label='calendar view is open, switch to year view']"));
	       YearBtn.click();

	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='MuiPickersYear-root css-j9zntq']")));

	       List<WebElement> allYears = driver.findElements(By.xpath("//button[contains(@class,'MuiPickersYear-yearButton') and (number(text()) >= 1900 and number(text()) <= 2099)]"));
	       int desiredYear = Integer.parseInt(sYear);

	       for (WebElement year : allYears)
	       {
	           if (Integer.parseInt(year.getText()) == desiredYear)
	           {
	               year.click();
	               break;
	           }
	       }
	       
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiPickersCalendarHeader-label")));

	       String calendarHeader = driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label")).getText();
	       String[] calendarHeaderParts = calendarHeader.split(" ");
	       String currentMonthText = calendarHeaderParts[0];
	       int currentYear = Integer.parseInt(calendarHeaderParts[1]);

	       YearMonth displayedYearMonth = YearMonth.of(currentYear, Month.valueOf(currentMonthText.toUpperCase()));
	       Month targetMonth = Month.valueOf(sMonth.toUpperCase());

	       // Navigate to the birth month
	       while (!displayedYearMonth.equals(YearMonth.of(desiredYear, targetMonth)))
	       {
	           if (displayedYearMonth.isBefore(YearMonth.of(desiredYear, targetMonth)))
	           {
	               driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
	               displayedYearMonth = displayedYearMonth.plusMonths(1);
	           }
	           else if (displayedYearMonth.isAfter(YearMonth.of(desiredYear, targetMonth)))
	           {
	               driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
	               displayedYearMonth = displayedYearMonth.minusMonths(1);
	           }
	           wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiPickersCalendarHeader-label")));
	       }

	       // Find all date buttons
	       List<WebElement> allDates1 = driver.findElements(By.xpath("//button[contains(@class, 'MuiPickersDay-root')]"));

	       // Loop through the dates and click on the target date
	       for (WebElement date : allDates1)
	       {
	           if (date.getText().equals(sDay))
	           {
	               date.click();
	               break;
	           }
	       }

	        //Due Date 
	       WebDriverWait wait_dm = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement calendar_dm = wait_dm.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Choose date']")));
		     calendar_dm.click();

		        // Wait for the calendar to be visible
		        WebDriverWait waitdm = new WebDriverWait(driver,Duration.ofSeconds(30));
		        waitdm.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiPickersCalendarHeader-label")));

		        // Loop to check if the current month is June 2024
		        while (true) 
		        {
		            WebElement currentMonthElement_dm = driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label"));
		            String currentMonth_dm = currentMonthElement_dm.getText();
		            if (currentMonth_dm.equals("September 2024")) 
		            {
		                break;
		            } 
		            else
		            {
		                // Click on the next month button
		                WebElement previous_monthButton = driver.findElement(By.xpath("//button[@title='Next month']"));
		                previous_monthButton.click();
		            }
		        }

		        // Find all date buttons
		        List<WebElement> allDates_d = driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-1gz1tty']"));

		        // Set the target date
		        int due_Date = 26;

		        // Loop through the dates and click on the target date (10th)
		        for (WebElement date_d : allDates_d) 
		        {
		            if (Integer.parseInt(date_d.getText()) == due_Date) 
		            {
		                date_d.click();
		                break;
		            }
		        }
			 
	        WebDriverWait waitdes = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement description = waitdes.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='description']")));
	        description.click();
	        description.sendKeys("Document verification"); //Description
	      
		 
		/* 
		 WebElement status_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='status']")));
		 //status_btn.sendKeys("New");
		 status_btn.click();
		 driver.findElement(By.xpath("//*[@role='option' and text()='New']")).click();
		 driver.findElement(By.xpath("//*[@role='option' and text()='New']")).sendKeys(Keys.TAB);
		*/ 
		 
		 WebDriverWait wait_rdd = new WebDriverWait(driver, Duration.ofSeconds(30));
		 try {
		     
		     WebElement status = wait_rdd.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='status']")));
		     
		     status.click();
		 
		     WebElement Option = wait_rdd.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@data-value='New']")));
		   
		     Option.click();
		 
		 } 
		 catch (NoSuchElementException e) 
		 {
		     System.out.println("Element not found: " + e.getMessage());
		 }

		 
		 //Attachment
	    
	     driver.findElement(By.xpath("//div[@class='MuiStack-root css-16iwlaa']/span[@aria-label='camera']")).click();
	    
	            TimeUnit.SECONDS.sleep(5); 
	    
	     ImageAttachment("D:\\PictureEPM\\rent_home.jpg"); 
	     
	     try {
	            TimeUnit.SECONDS.sleep(15); 
	        } 
	     catch (InterruptedException e) 
	           {
	            e.printStackTrace();
	           }
	     
	     save_btn.click();
	  
	}

	 public void ImageAttachment(String p) throws AWTException 
		{
			StringSelection strSelection = new StringSelection(p);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
			
			Robot robot = new Robot();
			
			robot.delay(3000);
		  //robot.keyPress(KeyEvent.VK_ENTER);
		  //robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(200);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}

}
