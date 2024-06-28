package cmpnyTask_Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Profile_change_pwd 
{
	
	WebDriver driver;
	
	
	 @BeforeTest
	 public void setup()
	 {
		 driver =new ChromeDriver();
		 driver.get("https://www.dev.easyproman.us/admin/login");
		 driver.manage().window().maximize(); 
	 }
	
	 @Test(priority=1)
	 public void change_pwd_cancelbtn_test()
	 {
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("achsa95");
		 driver.findElement(By.id("-password-login")).sendKeys("sel#2024");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		 
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Settings = waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div[2]/h6")));
		 Settings.click();
		 
		 WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Profile = waitp.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[5]/div/div/ul/a[4]")));
		 Profile.click();
		
	/*	 WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement names = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/div[3]/button/div/h6")));
		 names.click();
		 
		WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(40));
		 WebElement view_profile_btn = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='profile-tabpanel-0']/nav/a/div[2]/span")));
		 view_profile_btn.click();
	*/
		 WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement new_pwd = wait4.until(ExpectedConditions.elementToBeClickable(By.id("password-password")));
		 new_pwd.sendKeys("Divine03$21");
		 
		 driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[1]/div[1]/div/div/button")).click();//eye toggle
		 
		 WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement confirm_pwd = wait5.until(ExpectedConditions.elementToBeClickable(By.id("password-confirm")));
		 confirm_pwd.sendKeys("Divine03$21");
		 
		 driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[2]/div/div/div/button")).click();
		 
		 WebDriverWait wait6 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement cancel_btn = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div/button[1]")));
		 cancel_btn.click();
		 
	 }
	
	 @Test(priority=2)
	 public void change_pwd_updateprofileBtn_test()
	 {
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("achsa95");
		 driver.findElement(By.id("-password-login")).sendKeys("sel#2024");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		 
	/*	 WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement names = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/div[3]/button/div/h6")));
		 names.click();
		 
		 WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(40));
		 WebElement view_profile_btn = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='profile-tabpanel-0']/nav/a/div[2]/span")));
		 view_profile_btn.click();
	*/
		 
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Settings = waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div[2]/h6")));
		 Settings.click();
		 
		 WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Profile = waitp.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[5]/div/div/ul/a[4]")));
		 Profile.click();
		 
		 WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement new_pwd = wait4.until(ExpectedConditions.elementToBeClickable(By.id("password-password")));
		 new_pwd.sendKeys("Divine03$21");
		 
		 WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement confirm_pwd = wait5.until(ExpectedConditions.elementToBeClickable(By.id("password-confirm")));
		 confirm_pwd.sendKeys("Divine03$21");
		 
		 driver.findElement(By.xpath("//button[text()='Update Profile']")).click();
		
	 }
	
	 @Test
	 public void Logout_test()
	 {
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("achsa95");
		 driver.findElement(By.id("-password-login")).sendKeys("sel#2024");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		 
		 WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement names = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/div[3]/button/div/h6")));
		 names.click();
		 
		 WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement logout_btn = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/div[3]/div/div/div/div/div/div[1]/div/div[2]/button")));
		 logout_btn.click();
	 }
	
	
}
