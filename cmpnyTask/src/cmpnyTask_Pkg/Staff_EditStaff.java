package cmpnyTask_Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Staff_EditStaff {
	
	 WebDriver driver;
	 WebDriverWait wait;
	 
	 @BeforeTest
	 public void setup()
	 {
		 
		 driver =new ChromeDriver();
		 wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 driver.get("https://www.dev.easyproman.us/admin/login");
		 driver.manage().window().maximize(); 
		   
	 }
	
	 @Test
	 public void EditStff_btn() throws InterruptedException
	 {
		 
		 WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(30));
		 waitl.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("akshayc362");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
		
		 WebElement hamburgbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 WebElement staffsbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[2]/div[2]/h6")));
		 staffsbtn.click();
		
			 Thread.sleep(10000);//10 secs sleep
		
		 
		 
		 WebElement search =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
		 search.sendKeys("Divine",Keys.ENTER);
		 Thread.sleep(10000);
	
		 
	     WebElement edit_btn =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[7]/div/button"))); 
		 edit_btn.click();
		 
		 
		  WebElement first_name =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
		  Thread.sleep(6000);	
		  first_name.sendKeys(Keys.CONTROL+"a");
		  first_name.sendKeys(Keys.DELETE);
		  first_name.sendKeys("Rayan");
		   
		  
		   WebElement last_name =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
		   Thread.sleep(6000);
		   last_name.sendKeys(Keys.CONTROL+"a");
		   last_name.sendKeys(Keys.DELETE);
		   last_name.sendKeys("Nick");
		   
		   
		   WebElement userid =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		   Thread.sleep(5000);
		   userid.sendKeys(Keys.CONTROL+"a");
		   userid.sendKeys(Keys.DELETE);
		   userid.sendKeys("Nick123");
		   
		   
		   WebElement email =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		   Thread.sleep(5000);
		   email.sendKeys(Keys.CONTROL+"a");
		   email.sendKeys(Keys.DELETE);
		   email.sendKeys("achsansam95+k@gmail.com");
		   
		   
		   WebElement phone =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
		   Thread.sleep(5000);
		   phone.sendKeys(Keys.CONTROL+"a");
		   phone.sendKeys(Keys.DELETE);
		   phone.sendKeys("8746534245");
		   
		   
		   WebElement user_role = driver.findElement(By.xpath("//*[@id='roles']"));
			user_role.click();
			WebElement option1 = driver.findElement(By.xpath("//li[contains(@class, 'MuiMenuItem-root') and contains(@class, 'MuiMenuItem-gutters') and @data-value='staff']"));
			option1.click();
			WebElement option2 = driver.findElement(By.xpath("//li[contains(@class, 'MuiMenuItem-root') and contains(@class, 'MuiMenuItem-gutters') and @data-value='admin']"));
			option2.click();
			Thread.sleep(3000);
			option2.sendKeys(Keys.TAB);
			
		 /*  
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("Windows.scrollTo(0,document.body.scrollHeight)");
		   
		   WebElement save_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div.MuiDialog-root.MuiModal-root.css-k9ml7 > div.MuiDialog-container.MuiDialog-scrollPaper.css-16u656j > div > form > div.MuiDialogActions-root.MuiDialogActions-spacing.css-1h5xdp8 > div > div:nth-child(2) > div > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-colorPrimary.MuiButton-disableElevation.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-colorPrimary.MuiButton-disableElevation.css-9moxqp")));
		   save_btn.click(); 
		 */
		   
		  WebElement save_btn = driver.findElement(By.xpath("//button[text()='Save']"));
		  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_btn);
		  save_btn.click();
		 
		 
	 }
	
	
	

}
