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
public class ModifyAppln_updateaddrs
{

	WebDriver driver;
    //WebDriverWait wait;
	 
	 @BeforeMethod
	 public void setup() throws InterruptedException
	 {
		 driver =new ChromeDriver();
	 	 // wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login ");
		  driver.manage().window().maximize();  
	 }
	@Test
	 public void UpdateAddress_btn_test() throws InterruptedException
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		 
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement ModifyApln = waitp.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemText-root css-1tsvksn']/h6[text()='Modify Applications']")));
		 ModifyApln.click();
		 
		 hamburgbtn.click();
		 Thread.sleep(8000);
		 
		 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
		 search.sendKeys("Hana D Felix",Keys.ENTER);
		 Thread.sleep(4000);
		 
		 WebDriverWait waitua = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement UpdateAdrs_btn =  waitua.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update Address']")));
		 UpdateAdrs_btn.click();
		 Thread.sleep(8000);
		 
		 driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		 Thread.sleep(8000);
		 UpdateAdrs_btn.click();
		 Thread.sleep(4000);
		 
		 WebElement adrs = waitua.until(ExpectedConditions.elementToBeClickable(By.id("propertyAddress")));
		 adrs.click();
		 Thread.sleep(4000);
		 adrs.sendKeys("60 Caradon Hill #A1, #B Valley Lane, Round Rock, California, 90001");
		 adrs.sendKeys(Keys.ARROW_DOWN);
		 adrs.sendKeys(Keys.ENTER);
		 
		 waitua.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']"))).click();
		 Thread.sleep(4000);
		 
		/* 
		 WebElement adrs = waitua.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='propertyAddress' and @value='60 Caradon Hill #A1, #B Valley Lane, Round Rock, California, 90001']")));
		 waitua.until(ExpectedConditions.visibilityOf(adrs));
		 waitua.until(ExpectedConditions.elementToBeClickable(adrs)).click();
		 Thread.sleep(4000);
		 
		/* WebElement ddbtn = driver.findElement(By.xpath("//button[@aria-label='Open']"));
		 ddbtn.click();
		 Thread.sleep(3000);
		 List<WebElement>AdrsOptns = driver.findElements(By.tagName("div"));
		 for (WebElement optn : AdrsOptns)
		 {
			 if(optn.getText().contains("60 Caradon Hill #A1, #B Valley Lane, Round Rock, California, 90001"))
			 {
				 optn.click();
			 }
		 }
		*/ 
		 
	 }
	
}
