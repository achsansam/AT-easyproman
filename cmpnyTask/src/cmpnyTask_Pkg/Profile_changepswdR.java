package cmpnyTask_Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Profile_changepswdR 
{
	WebDriver driver;
	
	 @BeforeTest
	 public void setup()
	 {
		 driver =new ChromeDriver();
		 driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login");
		 driver.manage().window().maximize(); 
	 }
	 
	 @Test
	  public void change_pswd_test() throws InterruptedException
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("Smith892");
	 driver.findElement(By.id("-password-login")).sendKeys("Smi#24c");
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='open drawer']")));
	 hamburgbtn.click();
	 Thread.sleep(3000);
	 
	 WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement Settings = waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemText-root css-1tsvksn']/h6[text()='Settings']")));
	 Settings.click();
	 Thread.sleep(3000);
	 
	 WebElement profile = waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemText-root css-1tsvksn']/h6[text()='Profile']")));
	 profile.click();
	 Thread.sleep(3000);
	
	 driver.findElement(By.xpath("//input[@placeholder='Enter New Password']")).sendKeys("Smith#Aus67");
	 driver.findElement(By.xpath("//input[@placeholder='Enter Confirm Password']")).sendKeys("Smith#Aus67");
	 
	 WebElement update_prfl_btn = waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update Profile']")));
	 update_prfl_btn.click();
	 
	  }

}
