package cmpnyTask_Pkg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Properties_EditProperties 
{

	WebDriver driver;
	 //WebDriverWait wait;
	 
	 @BeforeMethod()
	 public void setup()
	 {
		  driver =new ChromeDriver();
		  driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login");
		  driver.manage().window().maximize(); 
	 }
	 
	 @Test
	 public void EditProperties_test() throws InterruptedException
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
		 
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 
		 WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Properties_btn = waitp.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[3]/div[2]/h6")));
		 Properties_btn.click();
		 
		 try
		 {
			 Thread.sleep(10000);//10 secs sleep
		 } catch
		 (InterruptedException e)
		 {
			e.printStackTrace(); 
		 }
		 
		 hamburgbtn.click();
		 
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//*[@id='start-adornment-email']")).sendKeys("2486 Ashton Lane, #A, Texas, Texas, 78741 ",Keys.ENTER);  //396 Petra Crest Suite 220, East Markus, Florida, 40438
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeMedium  css-tmn8ii' and @aria-label='Edit']")).click();
		Thread.sleep(2000);
		

		 driver.findElement(By.id("monthlyRent")).sendKeys("2999");
		 driver.findElement(By.id("securityDeposit")).sendKeys("2999");
		 
		
		 WebElement save_btn = driver.findElement(By.cssSelector("body > div.MuiDialog-root.MuiModal-root.css-k9ml7 > div.MuiDialog-container.MuiDialog-scrollPaper.css-16u656j > div > form > div > div.MuiDialogActions-root.MuiDialogActions-spacing.css-1h5xdp8 > div > div:nth-child(2) > div > button.MuiButtonBase-root.MuiButton-root.MuiButton-text.MuiButton-textError.MuiButton-sizeMedium.MuiButton-textSizeMedium.MuiButton-colorError.MuiButton-disableElevation.MuiButton-root.MuiButton-text.MuiButton-textError.MuiButton-sizeMedium.MuiButton-textSizeMedium.MuiButton-colorError.MuiButton-disableElevation.css-1j7yncj"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_btn);
		
		 
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-qox7lv']/button[text()='Add']")).click();
			
		//driver.findElement(By.xpath("//button[text()='Add New User']")).click();//Add New User btn click
		
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-7y9z82']/h6[text()='Raymond Lin']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'MuiButton-containedPrimary') and text()='Add']")).click();
		 
		driver.findElement(By.xpath("//*[@id='status']")).click();
		 Actions act = new Actions(driver);
		 act.sendKeys(Keys.ARROW_DOWN).build().perform();
		 act.sendKeys(Keys.ARROW_DOWN).build().perform();
		 act.sendKeys(Keys.ENTER).build().perform();
		 
		 save_btn.click();
		 
		 
	/*	 driver.findElement(By.xpath("//li[contains(text(),'Listing and Lease') and contains(@class='Mui-selected')]")).click();
		 driver.findElement(By.xpath("//*[@role='option' and text()='Owner']")).sendKeys(Keys.TAB);
		 WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Properties_btn = waitp.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/a[3]/div[2]/h6")));
		 Properties_btn.click();
		*/ 
		
      }
}
