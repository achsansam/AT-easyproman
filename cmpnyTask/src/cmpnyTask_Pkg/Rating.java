package cmpnyTask_Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Rating 
{

	WebDriver driver;
	
	 @BeforeMethod
	 public void setup() throws InterruptedException
	 {
		 driver =new ChromeDriver();
	 	 // wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login ");
		  driver.manage().window().maximize();  
	 }
	  
	  @Test
		 public void Rating_list() throws InterruptedException
		 {
		  
		     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
			 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
			 driver.findElement(By.id("-password-login")).sendKeys("123456789");
			 driver.findElement(By.xpath("//button[text()='Login']")).click();
			 
			 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
			 hamburgbtn.click();
			 
			 WebDriverWait waitlu = new WebDriverWait(driver,Duration.ofSeconds(40));
			 WebElement Users = waitlu.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='MuiListItemText-root css-1tsvksn']/h6[text()='Users']")));
			 Users.click();
			 Thread.sleep(3000);
			 
			 WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement RatingList = waitp.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemText-root css-1tsvksn']/h6[text()='Ratings List']")));
			 RatingList.click();
			 Thread.sleep(3000);
		 }
	  
	  
	 
	 
	
}
