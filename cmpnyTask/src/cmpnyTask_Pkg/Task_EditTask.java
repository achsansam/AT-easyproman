package cmpnyTask_Pkg;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_EditTask {
	WebDriver driver;
	 WebDriverWait wait;
	 
	 @BeforeMethod
    public void setup()
	 {
	 	  driver =new ChromeDriver();
	 	  wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  //driver.get("https://www.dev.easyproman.us/admin/login");
		   driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login");
		  driver.manage().window().maximize(); 
	 }
	 
	 @Test
	 public void EditTask_test() throws InterruptedException, IOException, Exception
	 {
		 
		 
		 WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(30));
		 waitl.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='open drawer']")));
		 hamburgbtn.click();
		
		 WebDriverWait waitt = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Task_btn = waitt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemText-root css-1tsvksn']/h6[text()='Tasks']")));
		 Task_btn.click();
		 
		 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
		 search.sendKeys("TAS00002",Keys.ENTER);
		 Thread.sleep(7000);
		 
		 driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]/a")).click();
		 
		 WebElement comment_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Comment']")));
		 
		 //driver.findElement(By.xpath("//input[@placeholder='Add Comment']")).sendKeys("Do it immediately");
		 driver.findElement(By.xpath("//input[@placeholder='Add Comment']")).sendKeys("Do it immediately");
		 
		 Actions act = new Actions(driver);
		 act.moveToElement(comment_btn).click().perform();
		/*
		 if(comment_btn.isDisplayed() && comment_btn.isEnabled())
		 {
			 comment_btn.click(); 
		 }
		*/
		 //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",comment_btn);
	 }

}
