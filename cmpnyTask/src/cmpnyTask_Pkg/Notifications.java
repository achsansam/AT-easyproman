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

public class Notifications 
{
	 WebDriver driver;
	 @BeforeMethod()
	 public void setup()
	 {
		 driver =new ChromeDriver();
		 driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login");
		 driver.manage().window().maximize(); 
	 }
	 
	 @Test
	  public void Notification_test() throws InterruptedException
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
	 driver.findElement(By.id("-password-login")).sendKeys("123456789");
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	 
	 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
	 hamburgbtn.click();
	 
	 WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement Settings = waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div[2]/h6")));
	 Settings.click();
	 
	 WebDriverWait waitn = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement Notifications = waitn.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemText-root css-1tsvksn']/h6[text()='Notifications']")));
	 Notifications.click();
	 Thread.sleep(4000);
	 waitn.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[1]/div/div/span/input"))).click();
	 Thread.sleep(4000);
	  }
	 
	 @Test
	  public void Notification_btn_test() throws InterruptedException
	  {   
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
	 driver.findElement(By.id("-password-login")).sendKeys("123456789");
	 driver.findElement(By.xpath("//button[text()='Login']")).click();
	 
	 Thread.sleep(4000);
	 WebDriverWait waitn = new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement Notifications_btn = waitn.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/div[2]/button")));
	 Notifications_btn.click();
	 
	 Thread.sleep(4000);
	 WebElement View_all = waitn.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='View All']")));
	 View_all.click();
	 Thread.sleep(4000);
	 waitn.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[1]/div/div/span/input"))).click();
	 Thread.sleep(4000);
	  }
}
