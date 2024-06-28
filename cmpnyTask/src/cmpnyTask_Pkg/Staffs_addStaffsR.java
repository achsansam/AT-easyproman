package cmpnyTask_Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Staffs_addStaffsR {

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
	 	 //driver.get("https://www.dev.easyproman.us/admin/login");
	 	   driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login");
		  driver.manage().window().maximize(); 
	 }
	

	 @Test
	 public void AddStaff_test() throws InterruptedException
	  {   
	 
		// driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login");
		// driver.manage().window().maximize(); 
		 
	 WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(30));
	 waitl.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
	 driver.findElement(By.id("-password-login")).sendKeys("123456789");
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	 
	 WebElement hamburgbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='open drawer']")));
	 hamburgbtn.click();
	 
	 WebElement staffsbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[2]/div[2]/h6")));
	 staffsbtn.click();
	 
	 Thread.sleep(10000);//10 secs sleep
	 
	 WebElement AddStaff_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/div/div[2]/button")));
	 AddStaff_btn.click();
	 
	 Thread.sleep(3000);
	 driver.findElement(By.id("firstName")).sendKeys("Smith");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("lastName")).sendKeys("Peterson");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("username")).sendKeys("Smith892");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("email")).sendKeys("achsansam95+bcc@gmail.com");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("phone")).sendKeys("9956238989");
	 Thread.sleep(3000);
	 
	//WebElement user_role = driver.findElement(By.xpath("//*[@id='roles']"));
	//user_role.click();
	//user_role.sendKeys(Keys.TAB);
	
	//WebElement option2 = driver.findElement(By.xpath("//li[contains(@class, 'MuiMenuItem-root') and contains(@class, 'MuiMenuItem-gutters') and @data-value='admin']"));
	//option2.click();
	Thread.sleep(3000);
	//option2.sendKeys(Keys.TAB);
	//WebElement option1 = driver.findElement(By.xpath("//li[contains(@class, 'MuiMenuItem-root') and contains(@class, 'MuiMenuItem-gutters') and @data-value='staff']"));
	//option1.click();
	//option1.sendKeys(Keys.TAB);
	
	WebElement pswd = driver.findElement(By.id("password"));
	pswd.click();
	pswd.sendKeys("Smi#24c");
	
	 driver.findElement(By.id("confirmPassword")).sendKeys("Smi#24c");
	 
	 WebElement save_btn = driver.findElement(By.xpath("//button[text()='Save']"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_btn);
	 save_btn.click();
	 
	 
	  }

}
