package cmpnyTask_Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UL_AddUser 
{

	
	 WebDriver driver;
	 WebDriverWait wait;
	 
/*	 @BeforeClass 
 	public void setup()
 	{
 		driver =new ChromeDriver();
 		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
 	}
	*/
	 
	 
	@BeforeMethod
      public void setup()
	 {
	 	  driver =new ChromeDriver();
	 	  wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  driver.get("https://www.dev.easyproman.us/admin/login");
		  driver.manage().window().maximize(); 
	 }
	

	 @Test
	 public void ul_page_test() throws InterruptedException
	  {   
	 
		// driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login");
		// driver.manage().window().maximize(); 
		 
	 WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(30));
	 waitl.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("akshayc362");
	 driver.findElement(By.id("-password-login")).sendKeys("123456789");
	 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
	 
	 WebElement hamburgbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
	 hamburgbtn.click();
	 
	 WebElement usersbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[2]/div[2]/h6")));
	 usersbtn.click();
	 
	 WebElement userlistbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[3]/div/div/ul/a[1]/div/h6")));
	 userlistbtn.click();
	 

		 Thread.sleep(10000);//10 secs sleep
	
	 
	
	 //Search Button
	   WebElement sort_by =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
	   sort_by.sendKeys("Ammuzz",Keys.ENTER);
	   
	   
	  
			 Thread.sleep(10000);//10 secs sleep
		
	   
	/* WebElement EnDis_btn =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")));

		 
		 	if (EnDis_btn.isEnabled())
		 	  {
			    EnDis_btn.click();
		   	  }
		 	else
		 	{
		 		EnDis_btn.click();
		 	}
	  */
	  
	 WebElement csv_dbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/div/div[2]/a")));
	 csv_dbtn.click();
	 
	 driver.findElement(By.xpath("//button[text()='Add User']")).click();
	 driver.findElement(By.xpath("//button[contains(@class,'MuiButton-text') and contains(@class,'MuiButton-textError') and contains(@class,'MuiButton-colorError') and text()='Cancel']")).click();
	 
	 driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[6]/div/button")).click();
	 driver.findElement(By.xpath("//button[contains(@class,'MuiButton-text') and contains(@class,'MuiButton-textError') and contains(@class,'MuiButton-colorError') and contains(text(),'Cancel')]")).click();
	 
	 
	  }
	 
	
	
	 @Test
	 public void AddUserBtn_cancel_test() throws InterruptedException
	 {
		
		 WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(30));
		 waitl.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("akshayc362");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
		 
		 WebElement hamburgbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 WebElement usersbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[2]/div[2]/h6")));
		 usersbtn.click();
		 
		 WebElement userlistbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[3]/div/div/ul/a[1]/div/h6")));
		 userlistbtn.click();
		  
		 
	 WebElement add_user_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/div/div[2]/button")));
	 add_user_btn.click();
	
	 driver.findElement(By.id("firstName")).sendKeys("Alan");
	 driver.findElement(By.id("lastName")).sendKeys("Jacob");
	 driver.findElement(By.id("email")).sendKeys("achsansam95+ol0@gmail.com");
	 driver.findElement(By.id("phone")).sendKeys("8766238987");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='roles']")).click();
	 driver.findElement(By.xpath("//*[@role='option' and text()='Owner']")).click();
	 driver.findElement(By.xpath("//*[@role='option' and text()='Owner']")).click();
	 driver.findElement(By.xpath("//*[@role='option' and text()='Owner']")).sendKeys(Keys.TAB);
	/*  Actions act = new Actions(driver);
	  act.sendKeys(Keys.ARROW_DOWN).build().perform();
	  act.sendKeys(Keys.ARROW_DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
	*/
	
	 WebDriverWait wait_btn = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement cancelbtn = wait_btn.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@class,'MuiButton-textError')]")));
	 cancelbtn.click();
	
	  }
	
	 @Test
	 public void AddUserBtn_save_test() throws InterruptedException
	 {
		
		 WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(30));
		 waitl.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("akshayc362");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
		 
		 WebElement hamburgbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 WebElement usersbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[2]/div[2]/h6")));
		 usersbtn.click();
		 
		 WebElement userlistbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[3]/div/div/ul/a[1]/div/h6")));
		 userlistbtn.click();
		  
		 
	 WebElement add_user_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/div/div[2]/button")));
	 add_user_btn.click();
	
	 driver.findElement(By.id("firstName")).sendKeys("Felix");
	 driver.findElement(By.id("lastName")).sendKeys("Billie");
	 driver.findElement(By.id("email")).sendKeys("achsansam95+bfc@gmail.com");
	 driver.findElement(By.id("phone")).sendKeys("5676238987");
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='roles']")).click();
	 driver.findElement(By.xpath("//*[@role='option' and text()='Owner']")).click();
	 driver.findElement(By.xpath("//*[@role='option' and text()='Owner']")).click();
	 driver.findElement(By.xpath("//*[@role='option' and text()='Owner']")).sendKeys(Keys.TAB);
	 
	 
	 WebElement save_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
	 save_btn.click();
	 }
	
}

