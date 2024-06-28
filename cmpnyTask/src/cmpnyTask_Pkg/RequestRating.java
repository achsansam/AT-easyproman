package cmpnyTask_Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RequestRating 
{
   
	 WebDriver driver;
	 //WebDriverWait wait;
		 
		 @BeforeMethod
		 public void setup() throws InterruptedException
		 {
			 driver =new ChromeDriver();
		 	 // wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			  driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login ");
			 // driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/review/d7c687b0-27de-11ef-8682-e1bab57f7e69");		  
			 // driver.manage().window().maximize(); 
			  
		 }
		 
		 @Test(priority=1)
		 public void AllAppln_Page_test() throws InterruptedException
		 {
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
			 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("achsa95");
			 driver.findElement(By.id("-password-login")).sendKeys("sel#2024");
			 driver.findElement(By.xpath("//button[text()='Login']")).click();
			
			 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
			 hamburgbtn.click();
			 
			 WebDriverWait waitr = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement rentalAppln_btn = waitr.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='Rental Applications']")));
			 rentalAppln_btn.click();
			 Thread.sleep(6000);
			 
			 WebDriverWait waita = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Approve_btn =  waita.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemText-root css-1tsvksn']/h6[text()='Approved']")));
			 Thread.sleep(3000);
			 Approve_btn.click();
			 
			 hamburgbtn.click();
			 
			 Thread.sleep(6000);
			 
			 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
			 search.sendKeys("Joe Jacob",Keys.ENTER);
			 Thread.sleep(4000);
			 
			 WebDriverWait waitrr = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement ReqR_btn = waitrr.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Request Rating']")));
			 ReqR_btn.click();
			 Thread.sleep(4000);
			 
			 WebDriverWait waitrrc = new WebDriverWait(driver,Duration.ofSeconds(30));
			 waitrrc.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation css-9moxqp' and @type='submit' and text()='Request Rating']")));
			// WebElement ReqRc_btn = 
			 //ReqRc_btn.click();	 
	}
	
		 @Test(priority=1)
		 public void requestRating_test() throws InterruptedException
		 {
			 driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/review/d7c687b0-27de-11ef-8682-e1bab57f7e69");
			 Thread.sleep(4000);
			 driver.manage().window().maximize(); 
			  
			 Thread.sleep(4000);
			 //1
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[1]/span/label[1]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[1]/span/label[2]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[1]/span/label[3]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[1]/span/label[4]")).click();
			 
			 //2
             driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[2]/span/label[1]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[2]/span/label[2]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[2]/span/label[3]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[2]/span/label[4]")).click();
			 
			 //3
             driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[3]/span/label[1]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[3]/span/label[2]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[3]/span/label[3]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[3]/span/label[4]")).click();
			 
			 //4
             driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[4]/span/label[1]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[4]/span/label[2]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[4]/span/label[3]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[4]/span/label[4]")).click();
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div[4]/span/label[5]")).click();
			 
			 Thread.sleep(4000);
			 
			 driver.findElement(By.xpath("//button[text()='Submit']")).click();
			 Thread.sleep(4000);
			 
			 driver.findElement(By.xpath("//button[text()='Previous']")).click();
			 Thread.sleep(4000);
			 
			 driver.findElement(By.xpath("//button[text()='Submit']")).click();
			 Thread.sleep(4000);
			 
			 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/form/div/div/div/button")).click();
			 Thread.sleep(4000);
			 
		 }
}
