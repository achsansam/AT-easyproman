package cmpnyTask_Pkg;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyApplication_Login 
{

	 WebDriver driver;
	 String email;
	 
	 @BeforeTest
		public void setup() 
		{
			
			driver = new ChromeDriver();
			driver.get("https://www.dev.easyproman.us/property-application");
			driver.manage().window().maximize();
			
		}
	 
	 @Test
		public void Application_LoginTest() throws InterruptedException 
		{
			
			 WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement SendOtp_btn = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send OTP']")));
			 SendOtp_btn.click();
			
			 
			 email = "achsansam95+divine@gmail.com";//Property Owner email-id
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement emailid = wait.until(ExpectedConditions.elementToBeClickable(By.id("email-verification")));
			 emailid.sendKeys(email);
			 
			 WebElement Sendotp_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send OTP']")));
			 Sendotp_btn.click();
	
			 try
		     {
		    	 TimeUnit.SECONDS.sleep(30);
		     }catch
		     (InterruptedException e)
		     {
		    	 e.printStackTrace();
		     }
			
		     
			 WebElement continue_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue']")));
			 continue_btn.click();	
		
		}
	 
}

	


