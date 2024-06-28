package cmpnyTask_Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Properties_AddProperties {
	
	 WebDriver driver;
	 //WebDriverWait wait;
	 
	 @BeforeMethod
	 public void setup()
	 {
		 driver =new ChromeDriver();
	 	 // wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login");//https://www.dev.easyproman.us/admin/login
		  driver.manage().window().maximize(); 
	 }
	 
/*	 @Test(priority=2)
	 public void PropertiesPage_test() throws InterruptedException
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
		 
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Properties_btn = waitp.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[3]/div[2]/h6")));
		 Properties_btn.click();
		 
		 
				 Thread.sleep(6000);//3 secs sleep
			 
		  
		  
		  hamburgbtn.click();
		  
		  Thread.sleep(6000); 
		  
		  //LeaseOptn_ddbtn
		  /*   driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[1]/td[8]/div/div")).click();
		
		    
		    Actions act = new Actions(driver);
			 act.sendKeys(Keys.ARROW_DOWN).build().perform();
			 act.sendKeys(Keys.ARROW_DOWN).build().perform();
			 act.sendKeys(Keys.ENTER).build().perform();
			 Thread.sleep(2000);
		  
		  //Search_btn	 
		     WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement search =  waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
			 search.sendKeys("936 Kiehn Route, West Ned, Tennessee, Tennessee, 73015");	
			 search.sendKeys(Keys.ENTER);
			// search.sendKeys(Keys.ENTER);
			 Thread.sleep(6000);
			 Thread.sleep(5000);
			 WebElement csv_btn =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@download='customer-list.csv']")));
			 csv_btn.click();
			 
			Thread.sleep(5000);//5 secs sleep
		 
			 
			 driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeMedium  css-tmn8ii' and @aria-label='Edit']")).click();//edit_btn
			 driver.findElement(By.xpath("//button[contains(@class,'MuiButton-text') and contains(@class,'MuiButton-textError') and contains(@class,'MuiButton-colorError') and text()='Cancel']")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/div/div[2]/button")).click();//addProperty_btn
			 driver.findElement(By.xpath("//button[contains(@class,'MuiButton-text') and contains(@class,'MuiButton-textError') and contains(@class,'MuiButton-colorError') and contains(text(),'Cancel')]")).click();
			 
	 }
	*/
	 @Test(priority=1)
	  public void AddProperties_SaveBtn() throws InterruptedException
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
	 driver.findElement(By.id("-password-login")).sendKeys("123456789");
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	 
	 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
	 hamburgbtn.click();
	 
	 WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement Properties_btn = waitp.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[3]/div[2]/h6")));
	 Properties_btn.click();
	 
			 Thread.sleep(6000);//6 secs sleep
		
	 
	 WebElement Add_Properties_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/div/div[2]/button")));
	 Add_Properties_btn.click();
	 
	 driver.findElement(By.id("addressLine1")).sendKeys("60 Caradon Hill #A1");
	 driver.findElement(By.id("addressLine2")).sendKeys("90, Valley Lane");
	 driver.findElement(By.id("zipCode")).sendKeys("90003");
	 driver.findElement(By.id("city")).sendKeys("Round Rock");
	 
	 WebElement statedd_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='free-solo-with-text-demo']")));
	 statedd_btn.click();
	 statedd_btn.sendKeys("California");
	 statedd_btn.sendKeys(Keys.ARROW_DOWN);
	 statedd_btn.sendKeys(Keys.ENTER);
	 
	 
	 //driver.findElement(By.xpath("//input[@aria-activedescendant='free-solo-with-text-demo-option-40' and @value='South Dakota']")).click();
	
	 
	 driver.findElement(By.id("monthlyRent")).sendKeys("2999");
	 driver.findElement(By.id("securityDeposit")).sendKeys("2999");
	 
	
	 WebElement save_btn = driver.findElement(By.xpath("//button[text()='Save']"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_btn);
	
	 
	driver.findElement(By.xpath("//div[@class='MuiBox-root css-qox7lv']/button[text()='Add']")).click();
		
	//driver.findElement(By.xpath("//button[text()='Add New User']")).click();//Add New User btn click
	
	driver.findElement(By.xpath("//div[@class='MuiBox-root css-7y9z82']/h6[text()='Doly Ken']")).click();    //h6[contains(text(),'Jeffy Mary')]--dev
	driver.findElement(By.xpath("//button[contains(@class,'MuiButton-containedPrimary') and text()='Add']")).click();
	 
	driver.findElement(By.xpath("//*[@id='status']")).click();
	 Actions act = new Actions(driver);
	 act.sendKeys(Keys.ENTER).build().perform();
	 
	 save_btn.click();
	 
	
	  }
	  
	 }
