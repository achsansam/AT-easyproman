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

public class ModifyAppln_MergeAppln 
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
	 public void MergeAppln_btn_test() throws InterruptedException
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
		 search.sendKeys("60 Caradon Hill #A1, #C32 Valley Lane, Round Rock, California, 90001",Keys.ENTER);
		 Thread.sleep(4000);
		 
		 WebDriverWait waitma = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement MergeAppln_btn =  waitma.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Merge Application']")));
		 MergeAppln_btn.click();
		 Thread.sleep(8000);
		 
		 driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		 Thread.sleep(8000);
		 
		 WebDriverWait waitsb1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement search1 =  waitsb1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
		 search1.click();
		 Thread.sleep(4000);
		 search1.sendKeys(Keys.CONTROL+"a");
		 search1.sendKeys(Keys.DELETE);
		 search1.sendKeys("60 Caradon Hill #A1, 90, Valley Lane, Round Rock, California, 90003",Keys.ENTER);
		 Thread.sleep(5000);
		 
		 WebDriverWait waitma1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement MergeAppln_btn1 =  waitma1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[8]/div/button[1]")));
		 MergeAppln_btn1.click();
		 Thread.sleep(6000);
		
		 driver.findElement(By.xpath("//input[@name='originalApplicant' and @value='{\"applicantType\":\"CoApplicant\",\"memberEmail\":\"new\",\"userId\":\"new\"}']")).click();
		 Thread.sleep(5000);
		// driver.findElement(By.xpath("//span[contains(@class, 'MuiRadio-root')]//input[@name='selectedApplicant' and contains(@value, 'Joash John')]")).click();
		 driver.findElement(By.xpath("//input[@name='selectedApplicant' and @type='radio' and contains(@value, '\"applicantName\":\"Cathi Smith\"')]")).click();
		// Thread.sleep(5000);
		 Thread.sleep(5000);
		 
		 WebDriverWait waitm = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Merge_btn =  waitm.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Merge']")));
		 Merge_btn.click();
		 Thread.sleep(6000);
		
	 }
}
