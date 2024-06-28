package cmpnyTask_Pkg;

import java.text.ParseException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ppty_Appln_TenantD 
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
	 
	 @Test(priority=1)
		public void AddProperty_TenantD_Test() throws InterruptedException, ParseException 
		{
			
			 WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement SendOtp_btn = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send OTP']")));
			 SendOtp_btn.click();
			
			 
			 email = "achsansam95+mm@gmail.com";// applying for property
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement emailid = wait.until(ExpectedConditions.elementToBeClickable(By.id("email-verification")));
			 emailid.sendKeys(email);
			 
			 WebDriverWait waitsotp = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Sendotp_btn = waitsotp.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send OTP']")));
			 Sendotp_btn.click();
	
			 try
		     {
		    	 TimeUnit.SECONDS.sleep(40);
		     }catch
		     (InterruptedException e)
		     {
		    	 e.printStackTrace();
		     }
			
		     
			 WebElement continue_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue']")));
			 continue_btn.click();	
			 Thread.sleep(3000);
			 Thread.sleep(2000);
			 
	// Add Tenant details
			 // Wait for the radio buttons container to be visible
		        WebElement radioGroup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("listingFound")));

		        // Locate the specific radio button by its XPath
		        WebElement radioButton = radioGroup.findElement(By.xpath("//input[@value='b48188c0-13ae-11ef-9cd6-f91fbd092ec9']"));

		        // Ensure the radio button is visible and clickable
		        wait.until(ExpectedConditions.visibilityOf(radioButton));
		        wait.until(ExpectedConditions.elementToBeClickable(radioButton));

		        // Scroll into view to ensure it's interactable
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioButton);

		        // Click the radio button
		        radioButton.click();

		        // Verify the radio button is selected
		        assert radioButton.isSelected();
			 
			 
			 
			 
		} 
			
}
