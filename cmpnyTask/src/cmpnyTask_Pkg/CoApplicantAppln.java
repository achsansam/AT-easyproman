package cmpnyTask_Pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.time.Duration;
import java.time.Month;
import java.time.YearMonth;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CoApplicantAppln 
{



	 WebDriver driver;
	 String email;
	 
	 @BeforeTest
		public void setup() 
		{
			
			driver = new ChromeDriver();
			driver.get("https://release.dtsfjj7v38jol.amplifyapp.com/property-application-invite/undefined");
			driver.manage().window().maximize();
			
		}
	 
	 @Test(priority=1)
		public void AddPropertyDetails_Test() throws InterruptedException, ParseException, AWTException 
		{
		
			 WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement SendOtp_btn = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send OTP']")));
			 SendOtp_btn.click();
			
			 
			 email = "achsansam95+sd@gmail.com"; // applying for property
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement emailid = wait.until(ExpectedConditions.elementToBeClickable(By.id("email-verification")));
			 emailid.sendKeys(email);
			 
			 WebDriverWait waitsotp = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Sendotp_btn = waitsotp.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send OTP']")));
			 Sendotp_btn.click();
	
			 try
		     {
		    	 TimeUnit.SECONDS.sleep(40);
		     }
			 catch
		     (InterruptedException e)
		     {
		    	 e.printStackTrace();
		     }
			
		     
			 WebElement continue_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue']")));
			 continue_btn.click();	
			 Thread.sleep(3000);
			 
			
			// driver.findElement(By.xpath("//*[@id='listingFound']/label[1]/span[1]/input")).click();
			 //Application
			 
			// driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/button")).click(); 
			//span[contains(@class,'MuiRadio-root')]/input[@name='listingFound']
			 //same email id - Continue
		   /*  WebDriverWait waitradbtn = new WebDriverWait(driver,Duration.ofSeconds(50));
			 WebElement radio_btn_cnte = waitradbtn.until(ExpectedConditions.elementToBeClickable(By.name("listingFound")));
			 radio_btn_cnte.click();
			 
			  driver.findElement(By.xpath("//button[text()='Continue']")).click();
			 
			   // same email id - New Application
			 Thread.sleep(5000);
			   driver.findElement(By.xpath("//button[text()='New Application']")).click();
			
			//*[@id='listingFound']/label[1]/span[1]/input
			*/  
			
			 
			 
			  
   // 1- Add Property Details
			 
			 try
		     {
		    	 TimeUnit.SECONDS.sleep(20);
		     }
			 catch
		     (InterruptedException e)
		     {
		    	 e.printStackTrace();
		     }
			
		     
			 
			 WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement Property_adrs = waitp.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='propertyAddress']")));
			 Property_adrs.click();
			 Thread.sleep(5000);
			 Property_adrs.sendKeys("60 Caradon Hill #A1, 90, Valley Lane, Round Rock, California, 90003");
			 Thread.sleep(3000);
			 Property_adrs.sendKeys(Keys.ARROW_DOWN);
			 Property_adrs.sendKeys(Keys.ENTER);
		 
			
			 driver.findElement(By.xpath("//*[@id='leaseTerm']")).sendKeys("6");
			 
			 driver.findElement(By.xpath("//*[@id='leaseTermTenure' ]")).click();
			// Thread.sleep(4000);)
			WebDriverWait waitltt = new WebDriverWait(driver,Duration.ofSeconds(30));
			WebElement leaseTermTenure = waitltt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Months']")));
			leaseTermTenure.click();
			waitltt.until(ExpectedConditions.stalenessOf(leaseTermTenure));
			//waitltt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Years']"))).sendKeys(Keys.TAB);
			 Thread.sleep(3000);
			 
			 
			 //Move_in_Date -- datepicker
			 
		     WebDriverWait waitc = new WebDriverWait(driver,Duration.ofSeconds(30));
			  WebElement calendarButton = waitc.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Choose date']")));
		        calendarButton.click();

		        // Wait for the calendar to be visible
		        WebDriverWait waitd = new WebDriverWait(driver,Duration.ofSeconds(30));
		        waitd.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiPickersCalendarHeader-label")));

		        // Loop to check if the current month is June 2024
		        while (true) 
		        {
		            WebElement currentMonthElement = driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label"));
		            String currentMonth = currentMonthElement.getText();
		            if (currentMonth.equals("July 2024")) 
		            {
		                break;
		            } 
		            else
		            {
		                // Click on the next month button
		                WebElement nextMonthButton = driver.findElement(By.xpath("//button[@title='Next month']"));
		                nextMonthButton.click();
		            }
		        }

		        // Find all date buttons
		        List<WebElement> allDates = driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-1gz1tty']"));

		        // Set the target date
		        int targetDate = 20;

		        // Loop through the dates and click on the target date (10th)
		        for (WebElement date : allDates) 
		        {
		            if (Integer.parseInt(date.getText()) == targetDate) 
		            {
		                date.click();
		                break;
		            }
		        }
			 
			 
			 WebElement save_btn = driver.findElement(By.xpath("//button[text()='Save']"));
			 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_btn);
			 
			/* WebDriverWait waitm = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement MonthlyRent = waitm.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='monthlyRent']")));
			 Actions act = new Actions(driver);
			 act.moveToElement(MonthlyRent).perform();
			 MonthlyRent.click();
			 Thread.sleep(3000);
			 Assert.assertTrue(MonthlyRent.isDisplayed(),"Monthly rent is not displayed");
			 Thread.sleep(3000);
			*/ 
			 
			 
		    driver.findElement(By.xpath("//*[@id='securityDeposit']")).sendKeys("2999");
			
		    driver.findElement(By.xpath("//*[@id='listingFound']/label[4]/span[1]/input")).click();
		   
		  /*  
		    //Real Estate Agent / Representative Details
			driver.findElement(By.xpath("//*[@id='createAgentName']")).sendKeys("Clement");
			driver.findElement(By.xpath("//*[@id='createAgentPhone']")).sendKeys("9876054674");
			driver.findElement(By.xpath("//*[@id='createAgentEmail']")).sendKeys("achsansam95+prpty1@gmail.com");
			Thread.sleep(4000);
			 
			
			 save_btn.click();
			 Thread.sleep(3000);
			*/ 
			 WebDriverWait waitN = new WebDriverWait(driver,Duration.ofSeconds(40));
			 WebElement Next_btn = waitN.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
			 Next_btn.click();
			//driver.findElement(By.xpath("//button[text()='Next']")).click(); //next btn click
			//Thread.sleep(4000);
			 
// Add Co applicant
			/* 
			 WebDriverWait waitNt = new WebDriverWait(driver,Duration.ofSeconds(40));
			 WebElement Next2_btn = waitNt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
			 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Next2_btn);
			 Next2_btn.click();
			 */
			 
			 try
		     {
		    	 TimeUnit.SECONDS.sleep(10);
		     }
			 catch
		     (InterruptedException e)
		     {
		    	 e.printStackTrace();
		     }
			
		     
			 
	// Tenant details
			 
			 Thread.sleep(9000);
			 
				driver.findElement(By.xpath("//*[@id='applicantFirstName']")).sendKeys("Irine");
				
				driver.findElement(By.xpath("//*[@id='applicantMiddleName']")).sendKeys("");
				
				driver.findElement(By.xpath("//*[@id='applicantLastName']")).sendKeys("George"); 
				
				driver.findElement(By.xpath("//*[@id='applicantFormerLastName']")).sendKeys(""); 
				
				driver.findElement(By.xpath("//*[@id='applicantEmail']")).isDisplayed();
				
				driver.findElement(By.xpath("//*[@id='applicantHomePhone']")).sendKeys("713-845-3996");
				
				driver.findElement(By.xpath("//*[@id='applicantWorkPhone']")).sendKeys("334-388-2841");
				
				driver.findElement(By.xpath("//*[@id='applicantMobilePager']")).sendKeys("713-388-2841");
				
				driver.findElement(By.xpath("//*[@id='applicantSocSecNo']")).sendKeys("509-555-5555");
				
				driver.findElement(By.xpath("//*[@id='applicantDriverLicenseNo']")).sendKeys("1420110012345");
				
				 WebElement state_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='free-solo-with-text-demo']")));
				 state_btn.click();
				 state_btn.sendKeys("North Dakota");
				 state_btn.sendKeys(Keys.ARROW_DOWN);
				 state_btn.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				 
				String birthYear = "2006";
		        String birthMonth = "June";
		        String birthDay = "6"; // Set the desired date to select

		      //calendar btn click 
		        WebDriverWait waitdob1 = new WebDriverWait(driver, Duration.ofSeconds(40));
		        WebElement calendarButton1 = null;

		        for (int i = 0; i < 3; i++) {
		            try {
		                calendarButton1 = waitdob1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='Choose date']")));
		                waitdob1.until(ExpectedConditions.elementToBeClickable(calendarButton1));
		                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", calendarButton1);
		                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", calendarButton1);
		                break;
		            } 
		            catch (StaleElementReferenceException e) 
		            {
		                Thread.sleep(2000);
		            } 
		            catch (Exception e) 
		            {
		                e.printStackTrace();
		            }
		        }

		        // Wait for the calendar to be visible
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiPickersCalendarHeader-label")));

		        // Step 1: Click the arrow button to open the year picker
		        WebElement birthYearBtn = driver.findElement(By.xpath("//button[@aria-label='calendar view is open, switch to year view']"));
		        birthYearBtn.click();

		        // Step 2: Wait for the year dropdown to load
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='MuiPickersYear-root css-j9zntq']")));

		        // Step 3: List all the years and click the desired year
		        List<WebElement> allYears = driver.findElements(By.xpath("//button[contains(@class,'MuiPickersYear-yearButton') and (number(text()) >= 1900 and number(text()) <= 2099)]"));
		        int desiredYear = Integer.parseInt(birthYear);

		        for (WebElement year : allYears) 
		        {
		            if (Integer.parseInt(year.getText()) == desiredYear)
		            {
		                year.click();
		                break;
		            }
		        }

		        // Wait for the calendar to display the correct year and month
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiPickersCalendarHeader-label")));

		        // Get the current displayed month and year from the calendar header
		        String calendarHeader = driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label")).getText();
		        String[] calendarHeaderParts = calendarHeader.split(" ");
		        String currentMonthText = calendarHeaderParts[0];
		        int currentYear = Integer.parseInt(calendarHeaderParts[1]);

		        YearMonth displayedYearMonth = YearMonth.of(currentYear, Month.valueOf(currentMonthText.toUpperCase()));
		        Month targetMonth = Month.valueOf(birthMonth.toUpperCase());

		        // Navigate to the birth month
		        while (!displayedYearMonth.equals(YearMonth.of(desiredYear, targetMonth))) 
		        {
		            if (displayedYearMonth.isBefore(YearMonth.of(desiredYear, targetMonth))) 
		            {
		                driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
		                displayedYearMonth = displayedYearMonth.plusMonths(1);
		            } 
		            else if (displayedYearMonth.isAfter(YearMonth.of(desiredYear, targetMonth)))
		            {
		                driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
		                displayedYearMonth = displayedYearMonth.minusMonths(1);
		            }
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiPickersCalendarHeader-label")));
		        }

		        // Find all date buttons
		        List<WebElement> allDates1 = driver.findElements(By.xpath("//button[contains(@class, 'MuiPickersDay-root')]"));

		        // Loop through the dates and click on the target date
		        for (WebElement date : allDates1) 
		        {
		            if (date.getText().equals(birthDay)) 
		            {
		                date.click();
		                break;
		            }
		        }
			 
				        Thread.sleep(4000);
				       
				        
				        WebElement save_tenantD_btn = driver.findElement(By.xpath("//*[@id='simple-tabpanel-2']/div/div/div/form/div/div[22]/div/button[2]"));
						((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_tenantD_btn);
						 
						
						 WebDriverWait wait_ms = new WebDriverWait(driver, Duration.ofSeconds(30));
						 try {
						     // Wait for the relationship element to be clickable
						     WebElement Marital_Status = wait_ms.until(ExpectedConditions.elementToBeClickable(By.id("applicantMaritalStatus")));
						     
						     // Click on the relationship element
						     Marital_Status.click();
						     
						     // Wait for the spouse option to be present
						     WebElement Marital_StatusOption = wait_ms.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@data-value='Single']")));
						     
						     // Click on the spouse option
						     Marital_StatusOption.click();
						     
						     // Perform additional actions if needed
						     
						 } 
						 catch (NoSuchElementException e) 
						 {
						     System.out.println("Element not found: " + e.getMessage());
						 }
						
					
					
						WebDriverWait wait_cc = new WebDriverWait(driver, Duration.ofSeconds(30));
						 try 
						 {
						     // Wait for the citizenship element to be clickable
						     WebElement citizenship = wait_cc.until(ExpectedConditions.elementToBeClickable(By.id("applicantCitizenship")));
						     
						     citizenship.click();
						     
						     // Wait for the spouse option to be present
						     WebElement Option = wait_cc.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@data-value='United States']")));
						     
						     // Click on the spouse option
						     Option.click();
						     
						     // Perform additional actions if needed
						     
						 } 
						 catch (NoSuchElementException e) 
						 {
						     System.out.println("Element not found: " + e.getMessage());
						 }

						 
						Thread.sleep(2000);
						driver.findElement(By.id("applicantEmergContactName")).sendKeys("Stephy");
						
						driver.findElement(By.id("applicantEmergContactAddress")).sendKeys("26351 Marilie Glens");
						
						driver.findElement(By.id("applicantEmergContactPhone")).sendKeys("(616) 339-9805"); 
						
						driver.findElement(By.id("applicantEmergContactEmail")).sendKeys("achsansam95+re@gmail.com"); 
						
						Thread.sleep(3000);
						
						//Id proof - upload
						
						WebDriverWait wait_img = new WebDriverWait(driver,Duration.ofSeconds(40));
						//wait_img.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='browse']")));)
						wait_img.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='browse']")));
						 driver.findElement(By.xpath("//span[text()='browse']")).click();
						    
				         TimeUnit.SECONDS.sleep(10); 
				    
				     PersonalId("D:\\PictureEPM\\images.jpg"); 
				     
				     try {
				            TimeUnit.SECONDS.sleep(9); 
				        } 
				     catch (InterruptedException e) 
				           {
				            e.printStackTrace();
				           }
						
						
				     
				     save_tenantD_btn.click();
				     Thread.sleep(3000);
				    
				     WebDriverWait waitNxt = new WebDriverWait(driver,Duration.ofSeconds(30));
					 WebElement Next_td_btn = waitNxt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-action='next']")));
					 Next_td_btn.click();
					 
	 // 3 -> 2-> Add Applicant's Current Address
					 
					 Thread.sleep(3000);
						
						driver.findElement(By.id("currentAddressDetails[0].applicantCurrStreetAddress")).sendKeys("411 Kuvalis Islands");
						
						driver.findElement(By.id("currentAddressDetails[0].applicantCurrStreetAddress2")).sendKeys("624");
						
						driver.findElement(By.id("currentAddressDetails[0].applicantCurrCity")).sendKeys("Tedburgh");
						
						 WebElement crnt_state = wait.until(ExpectedConditions.elementToBeClickable(By.id("free-solo-with-text-demo")));
						 crnt_state.click();
						 crnt_state.sendKeys("Maryland");
						 crnt_state.sendKeys(Keys.ARROW_DOWN);
						 crnt_state.sendKeys(Keys.ENTER);
						 crnt_state.sendKeys(Keys.TAB);
						Thread.sleep(3000);
						 
						driver.findElement(By.xpath("//*[@id='currentAddressDetails[0].applicantCurrZipcode']")).sendKeys("22645");
						
						driver.findElement(By.xpath("//*[@id='applicantCurrAddrLandlordName']")).sendKeys("Kingston");
						
					
						WebElement save_curntadd_btn = driver.findElement(By.xpath("//button[@data-action='save']"));
						((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_curntadd_btn);
						
						driver.findElement(By.xpath("//*[@id='applicantCurrAddrEmail']")).sendKeys("achsansam95+jo@gmail.com");
						
						driver.findElement(By.xpath("//*[@id='applicantCurrAddrPhone']")).sendKeys("281 709-7599");
						
						//Date moved in
						 WebDriverWait wait_dm = new WebDriverWait(driver,Duration.ofSeconds(30));
						 WebElement calendar_dm = wait_dm.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Choose date']")));
					     calendar_dm.click();

					        // Wait for the calendar to be visible
					        WebDriverWait waitdm = new WebDriverWait(driver,Duration.ofSeconds(30));
					        waitdm.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiPickersCalendarHeader-label")));

					        // Loop to check if the current month is June 2024
					        while (true) 
					        {
					            WebElement currentMonthElement_dm = driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label"));
					            String currentMonth_dm = currentMonthElement_dm.getText();
					            if (currentMonth_dm.equals("January 2024")) 
					            {
					                break;
					            } 
					            else
					            {
					                // Click on the next month button
					                WebElement previous_monthButton = driver.findElement(By.xpath("//button[@title='Previous month']"));
					                previous_monthButton.click();
					            }
					        }

					        // Find all date buttons
					        List<WebElement> allDates_dm = driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-1gz1tty']"));

					        // Set the target date
					        int curnt_in_Date = 1;

					        // Loop through the dates and click on the target date (10th)
					        for (WebElement date_dm : allDates_dm) 
					        {
					            if (Integer.parseInt(date_dm.getText()) == curnt_in_Date) 
					            {
					                date_dm.click();
					                break;
					            }
					        }
						 
		 driver.findElement(By.xpath("//*[@id='applicantCurrAddrRent']")).sendKeys("1500");
							 
							 driver.findElement(By.id("applicantCurrAddrReasonForMove")).sendKeys("Job Change");
							 
							 //Add New Previous Address
							 WebDriverWait wait_add= new WebDriverWait(driver,Duration.ofSeconds(30));
							 WebElement AddNewPrevious_btn = wait_add.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add New Previous Address']")));
							 Thread.sleep(3000);
							 AddNewPrevious_btn .click();
							 
							// WebElement save_curntadd_btn = driver.findElement(By.xpath("//button[@data-action='save']"));
								((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_curntadd_btn);
							 
							    driver.findElement(By.xpath("//*[@id='previousAddressDetails[0].applicantPreviousAddrStreetAddress']")).sendKeys("6554 Bogisich Mountains ");
								
								driver.findElement(By.id("previousAddressDetails[0].applicantPreviousStreetAddress2")).sendKeys("Apt. 906");
								
								driver.findElement(By.id("previousAddressDetails[0].applicantPreviousAddrCity")).sendKeys("North Sydnee");
								
								 WebElement previous_state = wait.until(ExpectedConditions.elementToBeClickable(By.name("previousAddressDetails[0].applicantPreviousAddrState")));
								 previous_state.click();
								 previous_state.sendKeys("Louisiana");
								 previous_state.sendKeys(Keys.ARROW_DOWN);
								 previous_state.sendKeys(Keys.ENTER);
								 previous_state.sendKeys(Keys.TAB);
								Thread.sleep(3000);
								 
								driver.findElement(By.xpath("//*[@id='previousAddressDetails[0].applicantPreviousAddrZipcode']")).sendKeys("84025");
								
							 
								 
									save_curntadd_btn.click();
							
									 WebDriverWait waitcNxt = new WebDriverWait(driver,Duration.ofSeconds(30));
									 WebElement Nextcurnt_btn = waitcNxt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-action='next']")));
									 Nextcurnt_btn.click();
							
						
					// 3->3-> Current Employer Details
								 
									 try
								     {
								    	 TimeUnit.SECONDS.sleep(30);
								     }
									 catch
								     (InterruptedException e)
								     {
								    	 e.printStackTrace();
								     }
									 
									 Thread.sleep(1000);
									 driver.findElement(By.xpath("//*[@id='applicantCurrentEmployerName']")).sendKeys("Jack");
										
									 driver.findElement(By.xpath("//*[@id='currentEmployerStreetAddr']")).sendKeys("4763 Rogahn Village");
										
									 driver.findElement(By.xpath("//*[@id='currentEmployerStreetAddrtwo']")).sendKeys("Manor");
									 
									 driver.findElement(By.xpath("//*[@id='currentEmployerCity']")).sendKeys("South Emoryport");
									 
										
									 WebElement emp_state = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='free-solo-with-text-demo']")));
									 emp_state.click();
									 emp_state.sendKeys("Alaska");
									 emp_state.sendKeys(Keys.ARROW_DOWN);
									 emp_state.sendKeys(Keys.ENTER);
									 emp_state.sendKeys(Keys.TAB);
									 Thread.sleep(3000);
									
									 driver.findElement(By.xpath("//*[@id='currentEmployerZipCode']")).sendKeys("26838");
									
									 WebDriverWait wait_emp = new WebDriverWait(driver,Duration.ofSeconds(30));
									 WebElement calendar_emp = wait_emp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Choose date']")));
								     calendar_emp.click();

								        // Wait for the calendar to be visible
								        WebDriverWait waitemp= new WebDriverWait(driver,Duration.ofSeconds(30));
								        waitemp.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiPickersCalendarHeader-label")));

								        // Loop to check if the current month is June 2024
								        while (true) 
								        {
								            WebElement currentMonthElement_emp = driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label"));
								            String currentMonth_emp = currentMonthElement_emp.getText();
								            if (currentMonth_emp.equals("January 2024")) 
								            {
								                break;
								            } 
								            else
								            {
								                // Click on the next month button
								                WebElement previous_monthButton = driver.findElement(By.xpath("//button[@title='Previous month']"));
								                previous_monthButton.click();
								            }
								        }

								        // Find all date buttons
								        List<WebElement> allDates_emp = driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-1gz1tty']"));

								        // Set the target date
								        int start_Date_emp = 5;

								        // Loop through the dates and click on the target date (10th)
								        for (WebElement date_emp : allDates_emp) 
								        {
								            if (Integer.parseInt(date_emp.getText()) == start_Date_emp) 
								            {
								                date_emp.click();
								                break;
								            }
								        }
									 
									 
								    driver.findElement(By.xpath("//*[@id='currentEmployerGrosMonthIncom']")).sendKeys("2200");
								        
								    WebElement save_emp_btn = driver.findElement(By.xpath("//button[@data-action='save']"));
									((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_emp_btn);
									 
								    driver.findElement(By.xpath("//*[@id='currentEmployerPosition']")).sendKeys("Technical Program Manager");
									 
								    WebDriverWait wait_offerl = new WebDriverWait(driver,Duration.ofSeconds(40));
								    //wait_img.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='browse']")));)
								    wait_offerl.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='browse']")));
									driver.findElement(By.xpath("//span[text()='browse']")).click();
										    
								         TimeUnit.SECONDS.sleep(3); 
								    
								     offerl("D:\\PictureEPM\\images.jpg"); 
								     
								     try {
								            TimeUnit.SECONDS.sleep(20); 
								        } 
								     catch (InterruptedException e) 
								           {
								            e.printStackTrace();
								           }
								     Thread.sleep(3000);
								   driver.findElement(By.xpath("//*[@id='currentsupervisorsName']")).sendKeys("Emin");
									 
								   driver.findElement(By.xpath("//*[@id='currentSupervisorsContactPhone']")).sendKeys("443.429.3450");
								     
								   driver.findElement(By.xpath("//*[@id='currentSupervisorsContactFax']")).sendKeys("(657) 851-8765");
										 
								   driver.findElement(By.xpath("//*[@id='currentSupervisorsContactEmail']")).sendKeys("achsansam95+emin@gmail.com");
								     
								   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_emp_btn);
								     
								   driver.findElement(By.xpath("//*[@id='currentEmploymentTypeYesNo']/label[2]/span[1]/input")).click();
								 
								   driver.findElement(By.xpath("//*[@id='describeApplicantOtherIncome']")).sendKeys("Nil");
								   
								   
								   save_emp_btn.click();
									
								   WebDriverWait waitempNxt = new WebDriverWait(driver,Duration.ofSeconds(30));
								   WebElement Nextemp_btn = waitempNxt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-action='next']")));
								   Nextemp_btn.click();
								   
								// 3-> 4-> Vehicle details
								   
								 
								   
								     WebDriverWait waitvehNxt = new WebDriverWait(driver,Duration.ofSeconds(30));
									 WebElement NextVeh_btn = waitvehNxt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-action='next']")));
									 NextVeh_btn.click();
									 
									 
				  // 3-> 5-> Add Pet Details
									 
									 try
								     {
								    	 TimeUnit.SECONDS.sleep(10);
								     }
									 catch
								     (InterruptedException e)
								     {
								    	 e.printStackTrace();
								     }
									 
									// driver.findElement(By.xpath("//input[@value='No']")).click();
									 //Thread.sleep(3000);
									 
									 WebDriverWait wait_pt = new WebDriverWait(driver,Duration.ofSeconds(30));
									 WebElement Next_pt_btn = wait_pt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-action='next']")));
									 Next_pt_btn.click();
									 
					//3-> 	//3-> 6-> Add Other Detail
									 
									 Thread.sleep(6000);
									 driver.findElement(By.xpath("//*[@id='waterBasedFurnitureStatus']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='anySmokeStatus']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='applicantMaintRenterInsStatus']/label[1]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='applicantParnterInMilitaryStatus']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='militaryPersonStaysToOneYrStatus']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='applicantBeenEvictedStatus']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='applicantBeenReqMoveOutByLandlrd']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='leaseOrRentalAgreement']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='filedForBankruptcy']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='lostPropertyInAForeclosure']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='beenConvictedOfACrime']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='hadAnyCreditProblems']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='isOccupantARegSexOffender']/label[2]/span[1]/input")).click();
									 
									 driver.findElement(By.xpath("//*[@id='criminalMattersAgainstAnyOccupant']/label[2]/span[1]/input")).click();
									 
									 WebDriverWait waitqa = new WebDriverWait(driver,Duration.ofSeconds(30));
									 WebElement saveqa_btn = waitqa.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-action='save']")));
									 saveqa_btn.click();
									 
									 WebDriverWait wait_qa = new WebDriverWait(driver,Duration.ofSeconds(30));
									 WebElement Next_qa_btn = wait_qa.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-action='next']")));
									 Next_qa_btn.click();
									 
					//3-> 7-> full details
									 
									 Thread.sleep(3000);
									 WebDriverWait wait_fd = new WebDriverWait(driver,Duration.ofSeconds(30));
									 WebElement edit_View_btn = wait_fd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='simple-tabpanel-8']/div/div/div/div[1]/div/div[4]/div/button")));
								     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",edit_View_btn);
								     edit_View_btn.click();	
								     
								     driver.findElement(By.xpath("//*[@id='simple-tabpanel-8']/div/div/div/div[1]/div/div[5]/div/button")).click();
								     Thread.sleep(3000);
								     
								     WebDriverWait wait_phe = new WebDriverWait(driver,Duration.ofSeconds(30));
								     WebElement name_e = wait_phe.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"applicantEmergContactName\"]")));
									 Thread.sleep(3000);
									 name_e.sendKeys(Keys.CONTROL+"a");
									 name_e.sendKeys(Keys.DELETE);
									 name_e.sendKeys("Stephine");
									 name_e.sendKeys(Keys.ENTER);
									 
									// WebDriverWait wait_savee = new WebDriverWait(driver,Duration.ofSeconds(30));
									 WebElement save_e_btn = driver.findElement(By.xpath("//button[@data-action='save']"));
								     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_e_btn);
								     save_e_btn.click();	
								     
								     Thread.sleep(5000);
								     
								     WebDriverWait wait_efd = new WebDriverWait(driver,Duration.ofSeconds(30));
								     WebElement nxt_edit_btn = wait_efd.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
								     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",nxt_edit_btn);
								     nxt_edit_btn.click();
								     
						//3->8-> Authorization 
								     
								     Thread.sleep(3000);
								     WebDriverWait wait_aut = new WebDriverWait(driver,Duration.ofSeconds(30));
								     WebElement save_au_btn = wait_aut.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-action='save']")));
								     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",save_au_btn);
								     
								     driver.findElement(By.name("appAuthConfrimInfo")).click();
								     
								     driver.findElement(By.name("appAuthRentalCriteria")).click();
								     
								     save_au_btn.click();
								     
								     Thread.sleep(2000);
								     
								     WebDriverWait wait_aut_nxt = new WebDriverWait(driver,Duration.ofSeconds(30));
								     WebElement nxt_aut_btn = wait_aut_nxt.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='simple-tabpanel-9']/div/div/div/form/div[2]/div/button[3]")));
								   //  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",nxt_aut_btn);
								     nxt_aut_btn.click();
								     
								     
						//3->9-> Agreement detail
								     
								     Thread.sleep(3000);
								     WebDriverWait wait_name = new WebDriverWait(driver,Duration.ofSeconds(30));
								     WebElement name = wait_name.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='agreementApplicantName']")));
								     name.sendKeys("Irine George");
								     
								    Thread.sleep(3000);
								     WebElement save_ad_btn = driver.findElement(By.xpath("//button[@data-action='save']"));
								     save_ad_btn.click();
								     Thread.sleep(2000);
								     
								     WebDriverWait wait_ad_nxt = new WebDriverWait(driver,Duration.ofSeconds(30));
								     WebElement nxt_ad_btn = wait_ad_nxt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-action='next']")));
								     nxt_ad_btn.click();
								    
								     
					//3->10-> Permission Details
								     
								     Thread.sleep(3000);
								     
								     driver.findElement(By.id("confirmPermissionInfo")).click();
								     
								     WebElement nxt_pd_btn = driver.findElement(By.xpath("//button[text()='Next']"));
								     nxt_pd_btn.click();
								     		 
								     
						//3->11-> Application fee
								     
								     
									 try
								     {
								    	 TimeUnit.SECONDS.sleep(15);
								     }
									 catch
								     (InterruptedException e)
								     {
								    	 e.printStackTrace();
								     }
													     
													  Thread.sleep(2000);
													//  driver.findElement(By.xpath(email)
													  
													  WebDriverWait wait_pre = new WebDriverWait(driver,Duration.ofSeconds(30));
													  WebElement pre = wait_pre.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-action='previous']")));
													  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",pre);
													  
													  
													  WebDriverWait wait_pay = new WebDriverWait(driver,Duration.ofSeconds(30));
													  WebElement Payment_btn = wait_pay.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Debit or Credit Card']")));
													  Payment_btn.click();
													  Thread.sleep(3000);
													 
													  
													  try
													     {
													    	 TimeUnit.SECONDS.sleep(40);
													     }
														 catch
													     (InterruptedException e)
													     {
													    	 e.printStackTrace();
													     }
													  
													  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",pre);
												  
													  
													  try
													     {
													    	 TimeUnit.SECONDS.sleep(150);
													     }
														 catch
													     (InterruptedException e)
													     {
													    	 e.printStackTrace();
													     }
													 
													  
													  WebDriverWait wait_c = new WebDriverWait(driver,Duration.ofSeconds(30));
													  wait_c.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='credit-card-number']"))).sendKeys(" 4032031981010803");
													  
													  wait_c.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='expiry-date']"))).sendKeys(" 01/2029");
													  
													  wait_c.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='credit-card-security']"))).sendKeys(" 629");
													  
													  Thread.sleep(2000);
													  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",pre);
													  
													  wait_c.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='billingAddress.givenName']"))).sendKeys("Irine");
													  
													  wait_c.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='billingAddress.familyName']"))).sendKeys("George");
													  
													  wait_c.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='billingAddress.postcode']"))).sendKeys("84025");
													  
													  wait_c.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='phone']"))).sendKeys("334-388-2841");
													  
													  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",pre);
													  
													  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("achsansam95+irine@gmail.com");
													  
													  WebDriverWait wait_payt = new WebDriverWait(driver,Duration.ofSeconds(30));
													  WebElement paymt_btn = wait_payt.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='submit-button']")));
													  paymt_btn.click();
											  			 
					        
				 
		}	
	 public void PersonalId(String pic) throws AWTException 
		{
			StringSelection strSelection = new StringSelection(pic);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
			
			Robot robot = new Robot();
			
			robot.delay(3000);
		  //robot.keyPress(KeyEvent.VK_ENTER);
		  //robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(200);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}
	 
	 public void offerl(String ltr) throws AWTException 
		{
			StringSelection strSelection = new StringSelection(ltr);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
			
			Robot robot = new Robot();
			
			robot.delay(3000);
		  //robot.keyPress(KeyEvent.VK_ENTER);
		  //robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(200);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}
	 
}
