package cmpnyTask_Pkg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rental_appln_owner 
{
  
	private WebDriver driver;
	private String email;
	//private String password;
	//private otp;

	
	@BeforeTest
	public void setup() 
	{
		
		driver = new ChromeDriver();
		driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/login");//("https://www.dev.easyproman.us/login");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	public void Rental_Appln_test() throws InterruptedException 
	{
		
		 WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement SendOtp_btn = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send OTP']")));
		 SendOtp_btn.click();
		
		 email = "achsansam95+pty5@gmail.com";
		// email = "achsansam95+t1@gmail.com";//"achsansam95+34@gmail.com";//Property Owner email-id
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement emailid = wait.until(ExpectedConditions.elementToBeClickable(By.id("email-verification")));
		 emailid.sendKeys(email);
		 
		 WebElement Sendotp_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send OTP']")));
		 Sendotp_btn.click();
		
	     try
	     {
	    	 TimeUnit.SECONDS.sleep(30);   // Enter OTP number manually 
	     }
	     catch (InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
		
	     
		 WebElement continue_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue']")));
		 continue_btn.click();	 
		 Thread.sleep(6000);
		 
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 WebDriverWait waitr = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement RentalAppln = waitr.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/owner/dashboard/rental-application-list' and .//h6[text()='Rental Applications']]")));
		 RentalAppln.click();
		 Thread.sleep(4000);
		 
		 hamburgbtn.click();
		 /*
		 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
		 search.sendKeys("Joe Clean",Keys.ENTER);
		 Thread.sleep(4000);
		 
		//  NOTES Button
		 /*
		 WebDriverWait waitn = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Notes_btn =  waitn.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[9]/div/button[4]")));
		 Notes_btn.click();
		 Thread.sleep(4000);
		 WebElement Comment_btn = waitn.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Comment']")));
		 Comment_btn.click();  //Comment is required.
		 Thread.sleep(4000);
		 WebDriverWait waitc = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Add_cmt =  waitc.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-1osx3qj']//input[@placeholder='Add Comment']")));
		 Add_cmt.sendKeys("Documents cleared",Keys.ENTER);
		 Comment_btn.click();
		*/ 
		 
		 //  APPROVE Button
		 /* 
		 WebDriverWait waita = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Approve_btn =  waita.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Approve']")));
		 Thread.sleep(3000);
		 Approve_btn.click();
		 driver.findElement(By.id("comment")).sendKeys("Approved");
		 driver.findElement(By.xpath("//button[text()='OK']")).click();
		*/
		/* 
		 //  REJECTED Button
		 WebDriverWait waitre = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Reject_btn =  waitre.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Reject']")));
		 Thread.sleep(3000);
		 Reject_btn.click();
		 driver.findElement(By.id("comment")).sendKeys("Not Satisfied");
		 driver.findElement(By.xpath("//button[text()='OK']")).click();
		 
		 
		 // SEND BACK Button
		 WebDriverWait waitre = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Reject_btn =  waitre.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send Back']")));
		 Thread.sleep(3000);
		 Reject_btn.click();
		 driver.findElement(By.id("comment")).sendKeys("send back application");
		 driver.findElement(By.xpath("//button[text()='OK']")).click(); 
		*/ 
	}
}
