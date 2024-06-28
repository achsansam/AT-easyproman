package cmpnyTask_Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Staffs_AddStaff 
{

	 WebDriver driver;
	 WebDriverWait wait;
	 
/*	 @BeforeClass 
 	public void setup()
 	{
 		driver =new ChromeDriver();
 		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
 	}
	*/
	 
	 
	@BeforeMethod
      public void setup()
	 {
	 	  driver =new ChromeDriver();
	 	  wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	 	 driver.get("https://www.dev.easyproman.us/admin/login");
		  driver.manage().window().maximize(); 
	 }
	

	 @Test
	 public void staffs_page_test() throws InterruptedException
	  {   
	 
		// driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login");
		// driver.manage().window().maximize(); 
		 
	 WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(30));
	 waitl.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
	 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("achsa95");
	 driver.findElement(By.id("-password-login")).sendKeys("sel#2024");
	 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
	 
	 WebElement hamburgbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
	 hamburgbtn.click();
	 
	 WebElement staffsbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[2]/div[2]/h6")));
	 staffsbtn.click();
	 
	 Thread.sleep(10000);//10 secs sleep
	 
	 WebElement search =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
	 search.sendKeys("sonu",Keys.ENTER);
	
	 Thread.sleep(10000);//10 secs sleep
	
	 WebElement EnDis_btn =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[7]/div/switch/div/label/span[1]")));

	 
	 	if (EnDis_btn.isEnabled())
	 	  {
		    EnDis_btn.click();
	   	  }
	 	else
	 	{
	 		EnDis_btn.click();
	 	}
	 	
	 	
	 WebElement csv_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/div/div[2]/a")));
	 csv_btn.click();
	 
	  }
	 
	
	 @Test
	 public void AddStaff_cancelbtn_test()
	 {
		 WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(30));
		 waitl.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("achsa95");
		 driver.findElement(By.id("-password-login")).sendKeys("sel#2024");
		 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
		 
		 WebElement hamburgbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 WebElement staffsbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[2]/div[2]/h6")));
		 staffsbtn.click();
		 
		 WebElement add_staff_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/div/div[2]/button")));
		 add_staff_btn.click();
		 
		 driver.findElement(By.id("firstName")).sendKeys("Kevin");
		 driver.findElement(By.id("lastName")).sendKeys("Peterson");
		 driver.findElement(By.id("username")).sendKeys("Kevin89");
		 driver.findElement(By.id("email")).sendKeys("achsansam95+mbc@gmail.com");
		 driver.findElement(By.id("phone")).sendKeys("9956238990");
		 
		WebElement user_role = driver.findElement(By.xpath("//*[@id='roles']"));
		 user_role.click();
		 driver.findElement(By.xpath("//li[contains(@class, 'MuiMenuItem-root') and contains(@class, 'MuiMenuItem-gutters') and @data-value=\"admin\"]")).click();
		// driver.findElement(By.xpath("//*[@role='option' and text()='Owner']")).click();
		 driver.findElement(By.xpath("//li[contains(@class, 'MuiMenuItem-root') and contains(@class, 'MuiMenuItem-gutters') and @data-value=\"admin\"]")).sendKeys(Keys.TAB);
		
		
		 driver.findElement(By.id("password")).sendKeys("Kevi#24c");
		 driver.findElement(By.id("confirmPassword")).sendKeys("Kevi#24c");
		 
		 WebElement cancel_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'MuiButton-root') and contains(@class, 'MuiButton-text') and contains(@class, 'MuiButton-textError')]")));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",cancel_btn);
		 cancel_btn.click();
		 
	 }
	
	 @Test
	 public void AddStaff_savebtn_test() throws InterruptedException
	 {
		 WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(30));
		 waitl.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("achsa95");
		 driver.findElement(By.id("-password-login")).sendKeys("sel#2024");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
		 
		 WebElement hamburgbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 WebElement staffsbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[2]/div[2]/h6")));
		 staffsbtn.click();
		 
		 WebElement add_staff_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/div/div[2]/button")));
		 add_staff_btn.click();
		 
		 driver.findElement(By.id("firstName")).sendKeys("Kevin");
		 driver.findElement(By.id("lastName")).sendKeys("Peterson");
		 driver.findElement(By.id("username")).sendKeys("Kevin892");
		 driver.findElement(By.id("email")).sendKeys("achsansam95+bcc@gmail.com");
		 driver.findElement(By.id("phone")).sendKeys("9956238989");
		 
		WebElement user_role = driver.findElement(By.xpath("//*[@id='roles']"));
		user_role.click();
		WebElement option1 = driver.findElement(By.xpath("//li[contains(@class, 'MuiMenuItem-root') and contains(@class, 'MuiMenuItem-gutters') and @data-value='staff']"));
		option1.click();
		WebElement option2 = driver.findElement(By.xpath("//li[contains(@class, 'MuiMenuItem-root') and contains(@class, 'MuiMenuItem-gutters') and @data-value='admin']"));
		option2.click();
		Thread.sleep(3000);
		option2.sendKeys(Keys.TAB);
		
	
		 driver.findElement(By.id("password")).sendKeys("Kevi#24c");
		 driver.findElement(By.id("confirmPassword")).sendKeys("Kevi#24c");
		 
		 WebElement save_btn = driver.findElement(By.xpath("//button[text()='Save']"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_btn);
		 save_btn.click();
		 
		 
	 }
	
	
}
