package cmpnyTask_Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Dashboard 
{

	 WebDriver driver;
	 @BeforeTest 
 	public void setup()
 	{
 		driver =new ChromeDriver();
 	}
	 
	@BeforeMethod()
    public void url()
	{
		 driver.get("https://www.dev.easyproman.us/admin/login");
		 driver.manage().window().maximize(); 
	 }
	
	 @Test
	 public void dashboardtest()
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("akshayc362");
	 driver.findElement(By.id("-password-login")).sendKeys("123456789");
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
	 

	 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele = waith.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/header/div/button")));
	 ele.click();
	 
	 WebDriverWait waitu = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele1 = waitu.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[1]/div[2]/h6")));
	 ele1.click();
	 
	 WebDriverWait waitlu = new WebDriverWait(driver,Duration.ofSeconds(40));
	 WebElement ele2 = waitlu.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[2]/div[2]/h6")));
	 ele2.click();
	
	 WebDriverWait waitrl = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele3 = waitrl.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[3]/div/div/ul/a[2]/div/h6")));
	 ele3.click();
	 
	 WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(0));
	 WebElement ele4 = waits.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[2]/div[2]/h6")));
	 ele4.click();
	 
	 WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele5 = waitp.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[3]")));
	 ele5.click();
	 
	 WebDriverWait waitt = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele6 = waitt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[4]/div[2]/h6")));
	 ele6.click();
	 
	 WebDriverWait waitra = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele7 = waitra.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[3]/div[2]/h6")));
	 ele7.click();
	 
	 WebDriverWait waitap = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele8 = waitap.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[1]/div/h6")));
	 ele8.click();
	 
	 WebDriverWait waitad = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele9 = waitad.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[2]/div/h6")));
	 ele9.click();
	 
	 WebDriverWait waitr = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele10 = waitr.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[3]/div/h6")));
	 ele10.click();
	 
	 
	 WebDriverWait waitip = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele11 = waitip.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[4]/div/h6")));
	 ele11.click();
	 
	 WebDriverWait waitsd = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele12 = waitsd.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[5]/div/h6")));
	 ele12.click();
	 
	 WebDriverWait waitrr = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele13 = waitrr.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[6]/div/h6")));
	 ele13.click();
	 
	 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement ele14 = waitsb.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[7]/div/h6")));
	 ele14.click();
	 
	 
	  }

	
}
