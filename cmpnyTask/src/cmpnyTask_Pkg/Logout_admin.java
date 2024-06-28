package cmpnyTask_Pkg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logout_admin 
{

	 WebDriver driver;
	
	 @BeforeMethod()
	 public void setup()
	 {
		 driver =new ChromeDriver();
		 driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login ");
		 driver.manage().window().maximize(); 
	 }
	 @Test
	  public void admin_login_logout_test() throws InterruptedException
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
	 driver.findElement(By.id("-password-login")).sendKeys("123456789");
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	 //Owner Logout
	 try {
         TimeUnit.SECONDS.sleep(9); 
     } 
  catch (InterruptedException e) 
        {
         e.printStackTrace();
        }
		driver.findElement(By.xpath("//*[@id='root']/div/div/header/div/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='profile-tabpanel-0']/nav/div/div[2]/span")).click();
		Thread.sleep(4000);
	 
	  }
	 
	 
}
