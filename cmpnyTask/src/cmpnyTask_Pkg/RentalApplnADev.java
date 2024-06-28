package cmpnyTask_Pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class RentalApplnADev 
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
		 /*
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
			 
			 WebDriverWait waitaa = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement allAppln_btn = waitaa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[1]/div/h6")));
			 allAppln_btn.click();
			 Thread.sleep(4000);
			 
			 WebDriverWait waitdd = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement dd = waitdd.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='column-hiding']")));
			 dd.click();
			 waitdd.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Status']"))).click();
			 Thread.sleep(2000);
			 
			 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
			 search.sendKeys("Approved",Keys.ENTER);
			 Thread.sleep(3000);
			 
			  
			 WebElement csv_dbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/div/div[2]/a")));
			 csv_dbtn.click();
			 
			 
			 
		 }
		/*
		 @Test(priority=2)
		 public void View_btn_test() throws InterruptedException
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
			 
			 WebDriverWait waitaa = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement allAppln_btn = waitaa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[1]/div/h6")));
			 allAppln_btn.click();
			 Thread.sleep(4000);
			 
			 WebDriverWait waitsub = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Submitted_btn = waitsub.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[5]/div/h6")));
			 Submitted_btn.click();
			 
			 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
			 search.sendKeys("Denni Paul",Keys.ENTER);
			 
			 hamburgbtn.click();
			 
			 WebDriverWait waitv = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement View_btn = waitv.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='View Application']")));
			 View_btn.click();
			
			 
			 WebDriverWait waitedit = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Edit_V_btn = waitedit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"printableDivApp\"]/div/div[2]/div[11]/div/button")));
			// ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Edit_V_btn);
			 waitedit.until(ExpectedConditions.visibilityOf(Edit_V_btn));
			 waitedit.until(ExpectedConditions.elementToBeClickable(Edit_V_btn));
			 Edit_V_btn.click();
			 Thread.sleep(8000);
			 
			 WebDriverWait waitedit_veh = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Vehiclemake = waitedit_veh.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='addVehicleDetail.[0].vehicleMake']")));
			 waitedit_veh.until(ExpectedConditions.elementToBeClickable(Vehiclemake));
			 Vehiclemake.sendKeys("Trek");
			 Vehiclemake.sendKeys(Keys.TAB);
			 Thread.sleep(3000);
			 WebDriverWait waitsave_v = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Saveupdate_btn = waitsave_v.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-action='save']")));
			 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Saveupdate_btn);
			 Saveupdate_btn.click();
			 
		 }
		 
		 
		 @Test(priority=3)
		 public void view_download_btn_test() throws InterruptedException
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
			 
			 WebDriverWait waitaa = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement allAppln_btn = waitaa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[1]/div/h6")));
			 allAppln_btn.click();
			 Thread.sleep(4000);
			 
			 WebDriverWait waitsub = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Submitted_btn = waitsub.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[5]/div/h6")));
			 Submitted_btn.click();
			 
			 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
			 search.sendKeys("Denni Paul",Keys.ENTER);
			 
			 hamburgbtn.click();
			 
			 WebDriverWait waitv = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement View_btn = waitv.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='View Application']")));
			 View_btn.click();
			 
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
			 
		 }
		 
		 @Test(priority=0)
		 public void Review_btn_test() throws InterruptedException
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
			 
			 WebDriverWait waitaa = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement allAppln_btn = waitaa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[1]/div/h6")));
			 allAppln_btn.click();
			 Thread.sleep(4000);
			 
			 WebDriverWait waitsub = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Submitted_btn = waitsub.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[5]/div/h6")));
			 Submitted_btn.click();
			 
			 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
			 search.sendKeys("Denni Paul",Keys.ENTER);
			 
			 hamburgbtn.click();
			 
			 WebDriverWait waitr = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Review_btn = waitr.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[9]/div/button[1]")));
			 Review_btn.click();
			 
			 driver.findElement(By.xpath("//button[text()='Cancel']")).click();
			 Thread.sleep(2000);
			 
			 Review_btn.click();
			 
			 driver.findElement(By.xpath("//button[text()='OK']")).click();
		 }
		 
		/* 
		 @Test(priority=0)
		 public void ReadyForReview_btn_test() throws InterruptedException
		 
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
			 
			 WebDriverWait waitrr = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement ReadyforReview_btn = waitrr.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[6]/div/h6")));
			 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ReadyforReview_btn);
			 waitrr.until(ExpectedConditions.elementToBeClickable(ReadyforReview_btn));
			 ReadyforReview_btn.click();
			 Thread.sleep(9000);
			 
			 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
			 search.sendKeys("Joe Jacob",Keys.ENTER);
			 Thread.sleep(4000);
			/* 
			WebElement ReqCreReport = waitsb.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[3]/td[2]/ul/div/div/li/p/a")));
			 waitsb.until(ExpectedConditions.elementToBeClickable(ReqCreReport));
			 ReqCreReport.click();
			 
			 
			 WebDriverWait waitvc = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement ViewCreReport = waitvc.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[2]/ul/div/div/li/p/a")));
			 waitvc.until(ExpectedConditions.elementToBeClickable(ViewCreReport));
			 Thread.sleep(3000);
			 ViewCreReport.click();
			 
			 WebDriverWait waitdvc = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement ViewCreReport_D = waitdvc.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Download Credit Report']")));
			 waitdvc.until(ExpectedConditions.elementToBeClickable(ViewCreReport));
			 ViewCreReport_D.click();
		 }
		 */
		 /*
		 
		 @Test(priority=0)
		 public void ReadyForReview_btn_test() throws InterruptedException
		 
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
			 Thread.sleep(4000);
			 
			 //  APPROVE Menu
			/* 
			 WebDriverWait waita = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Approve_btn =  waita.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='Approved']")));
			 Thread.sleep(3000);
			 Approve_btn.click();
			
			 
			 // REJECTED Menu
			 WebDriverWait waitrej = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Rejected_btn =  waitrej.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[4]/div/div/ul/a[3]/div/h6")));
			 Thread.sleep(3000);
			 Rejected_btn.click();
			 
	        hamburgbtn.click();
			 
			 WebDriverWait waitsb = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement search =  waitsb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
			 search.sendKeys("Denni Paul",Keys.ENTER);
			 Thread.sleep(4000);
			 
			 WebDriverWait waitcb = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement callBack_btn = waitcb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[9]/div/button[1]")));
			 callBack_btn.click();
			 
			 driver.findElement(By.id("comment")).sendKeys("Call back to verify documents");
			 driver.findElement(By.xpath("//button[text()='OK']")).click();
			 
			 
		 }
	*/
		 
}
