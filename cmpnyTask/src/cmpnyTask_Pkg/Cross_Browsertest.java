package cmpnyTask_Pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browsertest {
	

public class cross_browser_test 
 {
	WebDriver driver;
	
	@Parameters ("browser")
	  @BeforeTest
	  public void setup(String browser)
	  {
		if(browser.equalsIgnoreCase("chrome"))
		{
		  driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			 driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		else
		{
			driver = new SafariDriver();
		}
	  }
	  
	  @Test
	  public void cbt_lgn()
	  {
		  driver.get("https://www.dev.easyproman.us/admin/login");
		  driver.manage().window().maximize(); 
	  }
	 

 }

}
