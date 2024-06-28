package cmpnyTask_Pkg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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

public class Rental_Application 
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
	 
	 @Test(priority=0)
	 public void All_Appln_btn_test() throws InterruptedException
	 
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 Thread.sleep(4000);
		 
		 WebDriverWait waitr = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement rentalAppln_btn = waitr.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='Rental Applications']")));
		 rentalAppln_btn.click();
		 Thread.sleep(4000);
		 
		 WebDriverWait waitaa = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement allAppln_btn = waitaa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[1]/div/h6")));
		 allAppln_btn.click();
		 Thread.sleep(4000);
		 
		 hamburgbtn.click();
		 Thread.sleep(8000);
		 
		 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
		 search.sendKeys("Joe Clean",Keys.ENTER);
		 Thread.sleep(4000);
	 
		 
	/*	 WebElement ReqCreReport = waitsb.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[2]/ul/div[1]/div/li/p/a")));
		 waitsb.until(ExpectedConditions.elementToBeClickable(ReqCreReport));
		 ReqCreReport.click();
		 Thread.sleep(5000);
	 */
		 WebDriverWait waitvc = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement ViewCreReport = waitvc.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[5]/td[2]/ul/div[1]/div/li/p/a")));
		 waitvc.until(ExpectedConditions.elementToBeClickable(ViewCreReport));
		 ViewCreReport.click();
		 Thread.sleep(6000);
		 WebDriverWait waitdvc = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement ViewCreReport_D = waitdvc.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Download Credit Report']")));
		 waitdvc.until(ExpectedConditions.elementToBeClickable(ViewCreReport));
		 ViewCreReport_D.click();
		 try
	     {
	    	 TimeUnit.SECONDS.sleep(12);
	     }                                 
		 catch                             
	     (InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
		

		 WebDriverWait waitv = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement View_btn = waitv.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='View']")));
		 View_btn.click();
		 Thread.sleep(4000);
		
		 WebDriverWait waitvcr = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Viewcr_btn = waitvcr.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View Credit Report']")));
		 Viewcr_btn.click();
		 Thread.sleep(3000);
		 
		 WebDriverWait waitd = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement download_btn = waitd.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Download Application']")));
		 download_btn.click();
		 try
	     {
	    	 TimeUnit.SECONDS.sleep(12);
	     }                                 
		 catch                             
	     (InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
		 
		 WebDriverWait waitvcrr = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Viewcrr_btn = waitvcrr.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Download Credit Report']")));
		 Viewcrr_btn.click();
		 Thread.sleep(3000);
		 //waitvcrr.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Download Credit Report']")));
		 try
	     {
	    	 TimeUnit.SECONDS.sleep(4);
	     }                                 
		 catch                             
	     (InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
		
		 WebDriverWait waitcb = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Edit_btn = waitcb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='printableDivApp']/div/div[2]/div[7]/div/button")));
		 Edit_btn.click();
		 Thread.sleep(8000);
		 WebDriverWait waite = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Update = waite.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='applicantCurrAddrReasonForMove']")));
		 Update.click();
		 Update.sendKeys(Keys.CONTROL+"a");
		 Update.sendKeys(Keys.DELETE);
		 Update.sendKeys("Job change");
		 Update.sendKeys(Keys.TAB);
		 
		 Thread.sleep(3000);
		 WebDriverWait waitec = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Saveupdate_btn = waitec.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-action='save']")));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Saveupdate_btn);
		 Saveupdate_btn.click();
		 Thread.sleep(6000);
	 
	 }

	 @Test(priority=1)
	 public void All_ApplnN_btn_test() throws InterruptedException
	 
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 Thread.sleep(4000);
		 
		 WebDriverWait waitr = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement rentalAppln_btn = waitr.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='Rental Applications']")));
		 rentalAppln_btn.click();
		 Thread.sleep(4000);
		 
		 WebDriverWait waitaa = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement allAppln_btn = waitaa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[1]/div/h6")));
		 allAppln_btn.click();
		 Thread.sleep(4000);
		 
		 hamburgbtn.click();
		 Thread.sleep(8000);
		 
		 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
		 search.sendKeys("Joe Clean",Keys.ENTER);
		 Thread.sleep(4000);
		 
		 WebDriverWait waitv = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Review_btn = waitv.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[9]/div/button[1]")));
		 Review_btn.click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		 Thread.sleep(2000);
		 
		 Review_btn.click();
		 
		 driver.findElement(By.xpath("//button[text()='OK']")).click();
	 }
	/* 
	 @Test(priority=0)
	 public void BtnActions_test() throws InterruptedException
	 
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 Thread.sleep(4000);
		 
		 WebDriverWait waitr = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement rentalAppln_btn = waitr.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='Rental Applications']")));
		 rentalAppln_btn.click();
		 Thread.sleep(4000);
		 
		 WebDriverWait waitrf = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement ReadyForReview_btn = waitrf.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[6]/div/h6")));
		// ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ReadyForReview_btn);
		 ReadyForReview_btn.click();
		 Thread.sleep(4000);
		 
		 hamburgbtn.click();
		 Thread.sleep(8000);
		 
		 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
		 search.sendKeys("Joe Clean",Keys.ENTER);
		 Thread.sleep(4000);
		 
		 WebDriverWait waitre = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Reject_btn = waitre.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Reject']")));
		 Reject_btn.click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		 Thread.sleep(2000);
		 
		 Reject_btn.click();
		 
		 driver.findElement(By.id("comment")).sendKeys("Application Rejected");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='OK']")).click();
		 
	 }
	*/ 
	 /*
	 @Test(priority=1)
	 public void BtnActionsRejectedmenu_test() throws InterruptedException
	 
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 Thread.sleep(4000);
		 
		 WebDriverWait waitr = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement rentalAppln_btn = waitr.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='Rental Applications']")));
		 rentalAppln_btn.click();
		 Thread.sleep(4000);
		/* 
		 WebDriverWait waitrf = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement RejectedMenu = waitrf.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[@class='MuiTypography-root MuiTypography-h6 css-nm9qzb' and text()='Rejected']")));
		 RejectedMenu.click();
		 Thread.sleep(4000);
		
		 
		 WebDriverWait waitaa = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement allAppln_btn = waitaa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[1]/div/h6")));
		 allAppln_btn.click();
		 Thread.sleep(4000);
		 
		 hamburgbtn.click();
		 Thread.sleep(8000);
		 
		 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
		 search.sendKeys("Joe Clean",Keys.ENTER);
		 Thread.sleep(4000);
		 
		 WebDriverWait waitre = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement CallBack_btn = waitre.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Call Back']")));
		 CallBack_btn.click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		 Thread.sleep(2000);
		 
		 CallBack_btn.click();
		 
		 driver.findElement(By.id("comment")).sendKeys("Call Back the Application ");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='OK']")).click();
		
	 } 
	 */
	 @Test(priority=1)
	 public void Btnmenu_test() throws InterruptedException
	 
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("admin");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 Thread.sleep(4000);
		 
		 WebDriverWait waitr = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement rentalAppln_btn = waitr.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='Rental Applications']")));
		 rentalAppln_btn.click();
		 Thread.sleep(4000);
	
		 WebDriverWait waitaa = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement allAppln_btn = waitaa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[1]/div/h6")));
		 allAppln_btn.click();
		 Thread.sleep(4000);
		 
		 hamburgbtn.click();
		 Thread.sleep(8000);
		 
		 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
		 search.sendKeys("Joe Clean",Keys.ENTER);
		 Thread.sleep(4000);
		 
		 WebDriverWait waitre = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement Approve_btn = waitre.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Approve']")));
		 Approve_btn.click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		 Thread.sleep(2000);
		 
		 Approve_btn.click();
		 
		 driver.findElement(By.id("comment")).sendKeys("Approved ");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='OK']")).click();
		
	 } 
	 
	 
	 }
