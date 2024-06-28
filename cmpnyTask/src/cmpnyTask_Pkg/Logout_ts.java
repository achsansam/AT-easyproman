package cmpnyTask_Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.testng.Assert;

import java.time.Duration;
import java.time.Instant;

public class Logout_ts {

    WebDriver driver;
    String baseUrl = "https://release.dtsfjj7v38jol.amplifyapp.com/admin/login ";
    String username = "admin";
    String password = "password";

    @BeforeClass
    public void setUp() {
      //  System.setProperty("https://release.dtsfjj7v38jol.amplifyapp.com/admin/login ");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testAutoLogout() 
    {
        driver.get(baseUrl);
        
        WebElement usernameField = driver.findElement(By.xpath("//*[@id='username-login']")); 
        usernameField.sendKeys(username);
        
        WebElement passwordField = driver.findElement(By.id("-password-login")); 
        passwordField.sendKeys(password);
        
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']")); 
        loginButton.click();

        // Optional: Verify that the login was successful by checking an element on the landing page
        // WebElement elementAfterLogin = driver.findElement(By.id("post_login_element_locator"));
        // Assert.assertTrue(elementAfterLogin.isDisplayed(), "Login failed");

        // Record the time of login
        Instant loginTime = Instant.now();

        // Wait for the automatic logout to occur
        while (true) 
        {
            try 
            {
                // Check for the presence of an element that indicates the session has expired
                WebElement expiredElement = driver.findElement(By.xpath("//*[@id='root']/div/div/div/p")); //a[text()='Back To Dashboard']// Use the actual locator for the session expired message
                if (expiredElement.isDisplayed()) 
                {
                    break;
                }
            } 
            catch (Exception e)
            {
                // Element not found, which means the session hasn't expired yet
                // Sleep for a short duration before checking again
                try 
                {
                    Thread.sleep(5000); // Check every second
                } 
                catch (InterruptedException ie) 
                {
                    Thread.currentThread().interrupt();
                }
            }
        }

        // Record the time when the session expired
        Instant logoutTime = Instant.now();

        // Calculate the duration
        Duration duration = Duration.between(loginTime, logoutTime);
        System.out.println("Automatic Logout Timespan: " + duration.getSeconds() + " seconds");

        // Optional: Add an assertion if you have an expected timeout duration
        // Assert.assertEquals(duration.getSeconds(), EXPECTED_TIMEOUT_IN_SECONDS, "Timeout duration mismatch");
    }

    @AfterClass
    public void tearDown() 
    {
        if (driver != null) 
        {
            driver.quit();
        }
    }
}