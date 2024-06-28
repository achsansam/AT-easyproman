package cmpnyTask_Pkg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginTask
{
	
	 WebDriver driver;
	/* @BeforeTest 
 	public void setup()
 	{
 		driver =new ChromeDriver();
 	}
	*/ 
	 @BeforeMethod()
	 public void setup()
	 {
		 driver =new ChromeDriver();
		 driver.get("https://www.dev.easyproman.us/admin/login");
		 driver.manage().window().maximize(); 
	 }
	 
	 
	 
	 
	 @Test
	  public void usn_emptytest()
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']"));
	 driver.findElement(By.id("-password-login")).sendKeys("12345678");
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	  }
	 
	 @Test
	  public void pswd_emptytest()
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("akshayc362");
	 driver.findElement(By.id("-password-login"));
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	  }
	 
	 @Test
	  public void btn_clicktest()
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']"));
	 driver.findElement(By.id("-password-login"));
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	  }
	 
	 @Test
	 public void admin_neglogin()
	  {
		 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("ammu");
	 driver.findElement(By.id("-password-login")).sendKeys("123456");
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	  }
	 
	 @Test
	  public void admin_poslogin()
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("akshayc362");
	 driver.findElement(By.id("-password-login")).sendKeys("123456789");
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	  }
	 

}

