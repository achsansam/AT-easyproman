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

public class Owner_Login 
{
	
	private WebDriver driver;
	private String email;
	//private String password;
	//private otp;

	
	@BeforeTest
	public void setup() 
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.dev.easyproman.us/login");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	public void OwnerLogin() throws InterruptedException 
	{
		
		 WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement SendOtp_btn = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send OTP']")));
		 SendOtp_btn.click();
		
		 
		 email = "achsansam95+34@gmail.com";//Property Owner email-id
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
		 Thread.sleep(6000);
		 WebElement hamburgbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement properties = waitp.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[2]/div[2]/h6")));
		 properties.click();
		  
		 //Owner Logout
		 
		//driver.findElement(By.xpath("//*[@id='root']/div/div/header/div/div[3]/button/div")).click();
		//driver.findElement(By.xpath("//*[@id=\"profile-tabpanel-0\"]/nav/div/div[2]/span")).click();
		 
		 
	}
	
	
	

}
