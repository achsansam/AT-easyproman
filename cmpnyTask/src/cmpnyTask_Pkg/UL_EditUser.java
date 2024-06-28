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

public class UL_EditUser {
	

	 WebDriver driver;
	 WebDriverWait wait;
	 
	 @BeforeMethod()
     public void setup()
	 {
	 	  driver =new ChromeDriver();
	 	 // wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  driver.get("https://www.dev.easyproman.us/admin/login");
		  driver.manage().window().maximize(); 
	 }
	
	 
	 @Test
	 public void EditUser_btn() throws InterruptedException
	 {
	 
		 WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(30));
		 waitl.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username-login']")));
		 driver.findElement(By.xpath("//*[@id='username-login']")).sendKeys("akshayc362");
		 driver.findElement(By.id("-password-login")).sendKeys("123456789");
		 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div/div/div[2]/form/div/div[4]/div/button")).click();
		 
		 WebDriverWait waith = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement hamburgbtn = waith.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/header/div/button")));
		 hamburgbtn.click();
		 
		 WebDriverWait waitu = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement usersbtn = waitu.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[2]/div[2]/h6")));
		 usersbtn.click();
		 
		 WebDriverWait waitua = new WebDriverWait(driver,Duration.ofSeconds(30));
		 WebElement userlistbtn = waitua.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/nav/div/div/div[2]/div/div[1]/div[2]/div/div/div/div/ul/div[3]/div/div/ul/a[1]/div/h6")));
		 userlistbtn.click();
		 
		 
			 Thread.sleep(10000);//10 secs sleep
		 
		 
		 //Search Button
		   WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(30));
		   WebElement sort_by =  waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='start-adornment-email']")));
		   sort_by.sendKeys("Ken Jack",Keys.ENTER);
		   
		   
				 Thread.sleep(10000);//10 secs sleep
			
		   
		   driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[2]/div/div/table/tbody/tr[2]/td[6]/div/button")).click();//edit btn
		   
		   Thread.sleep(3000);
		   
		   //First Name edit
		   WebElement first_name =driver.findElement(By.id("firstName"));
		   Thread.sleep(3000);
		   first_name.sendKeys(Keys.CONTROL+"a");
		   first_name.sendKeys(Keys.DELETE);
		   first_name.sendKeys("Kingston");
			  
			  
		   //Last Name edit
		   WebElement last_name =driver.findElement(By.id("lastName"));
		   Thread.sleep(3000);
		   last_name.sendKeys(Keys.CONTROL+"a");
		   last_name.sendKeys(Keys.DELETE);
		    last_name.sendKeys("Paul");
		   
		   
		   //Email edit
		   WebElement email_id =driver.findElement(By.id("email"));
		   Thread.sleep(3000);
		   email_id.sendKeys(Keys.CONTROL+"a");
		   email_id.sendKeys(Keys.DELETE);
		   email_id.sendKeys("achsansam95+kp@gmail.com");
		  
		   
		   
		   //Phn edit
		   WebElement phn =driver.findElement(By.id("phone"));
		   Thread.sleep(3000);
		   phn.sendKeys(Keys.CONTROL+"a");
		   phn.sendKeys(Keys.DELETE);
		   phn.sendKeys("9086543543");
		   
		
		   driver.findElement(By.xpath("//button[text()='Save']")).click();
		  
		   
		   /*Email edit
		   WebElement email_id =driver.findElement(By.id("email"));
		   Thread.sleep(3000);
		   String existing_email = email_id.getAttribute("achsansam95+mmn@gmail.com");
		   for(int i=0; i<existing_email.length();i++)
		   {
			   email_id.sendKeys(Keys.BACK_SPACE);
			   
		   }
		   String new_emailid = "achsansam95+jnvc@gmail.com";
		   email_id.sendKeys(new_emailid);
		  */ 
		 
	 }
}
