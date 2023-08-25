package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.relevantcodes.extentreports.LogStatus;
import Sherkhan_Core.WebConnector;
import Sherkhans_Util.testUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class sherkhan_website_launched_Test  extends WebConnector{

	WebConnector wc =new WebConnector();
    @Given("^ShareKhan website is open in the browser$")
	public void sharekhan_website_is_open_in_the_browser() throws Throwable 
	 {	
		try {
		//Extent Reports
		report.startTest("ShareKhan website is open in the browser");
		report.log(LogStatus.INFO, "Navigated to sharekhan.com");
		System.out.println("sharekhan_website_is_open_in_the_browser");
	     app_logs.debug("ShareKhan website is open in the browser");
		   }catch(Throwable t)
		        {
		    	 report.log(LogStatus.FAIL, "Sharekhan website Functionaltiy Failed");
				 testUtil.captureScreenshot("sherkhan_website_launched_Test");
				 report.attachScreenshot(testUtil.mailscreenshotpath);
				 Assert.assertTrue(false, t.getMessage());
		       }
	         }
	


	  
	  
	  @Then("^the website is launched successfully$")
	    public void the_website_is_launched_successfully() throws Throwable 
	    {
		  try {
		      report.startTest("the website is launched successfully");
		      report.log(LogStatus.INFO, "Navigated to sharekhan.com");
              Thread.sleep(2000);
	          System.out.println("the website is launched successfully");
	          app_logs.debug("the website is launched successfully");
		  }catch(Throwable t)
		    {
		     report.log(LogStatus.FAIL, "Sharekhan website Functionaltiy Failed");
              testUtil.captureScreenshot("sherkhan_website_launched_Test");
              report.attachScreenshot(testUtil.mailscreenshotpath);
		      Assert.assertTrue(false, t.getMessage());
		    }
	      }
	    
	    
	 
	    @When("^user clicks on main menu$")
	    public void user_clicks_on_main_menu() throws Throwable 
	    {
	    	try {
	 		   report.startTest("user clicks on main menu");
		       report.log(LogStatus.INFO, "user clicks on main menu");
               Thread.sleep(5000);
		      
              //Market
	    	  WebElement MarketButton=driver.findElement(By.xpath(object.getProperty("Market_Button")));
	    	  MarketButton.click();
	    	  System.out.println(MarketButton.getText());
	    	  report.log(LogStatus.INFO, "clicks on MarketButton button");
	    	  Thread.sleep(2000);
	          driver.navigate().back();
	    
	    	 //New To Market
	    	 Thread.sleep(5000);
		     WebElement NewToMarketButton=driver.findElement(By.xpath(object.getProperty("NewToMarket_Button")));
	    	 NewToMarketButton.click();
	    	 System.out.println(NewToMarketButton.getText());
	    	 report.log(LogStatus.INFO, "clicks on New ToMarketButton button");
	    	 Thread.sleep(2000);
	    	 driver.navigate().back();
	    	 
	    	 //Super Inverstor
	    	 Thread.sleep(5000);
		     WebElement SuperInverstorButton=driver.findElement(By.xpath(object.getProperty("SuperInverstor_Button")));
	    	 SuperInverstorButton.click();
	    	 System.out.println(SuperInverstorButton.getText());
	    	 Thread.sleep(2000);
	    	 report.log(LogStatus.INFO, "clicks on Super Inverstor Button");
	    	 driver.navigate().back();
	    	 
	    	 //Active Tender
	    	 Thread.sleep(5000);
             WebElement ActiveTenderButton=driver.findElement(By.xpath(object.getProperty("ActiveTender_Button")));
	    	 ActiveTenderButton.click();
	    	 System.out.println(ActiveTenderButton.getText());
	    	 Thread.sleep(2000);
		     report.log(LogStatus.INFO, "clicks on Active Tender Button");
             driver.navigate().back();
	    	 
             //Mutual Funds 
	    	 Thread.sleep(5000);
             WebElement MutualFundsButton=driver.findElement(By.xpath(object.getProperty("MutualFunds_Button")));
	    	 MutualFundsButton.click();
	    	 System.out.println(MutualFundsButton.getText());
	    	 Thread.sleep(2000);
		     report.log(LogStatus.INFO, "clicks on Mutual Funds Button");
             driver.navigate().back();
	    	
             //Research
	    	 Thread.sleep(8000);
             WebElement ResearchButton=driver.findElement(By.xpath(object.getProperty("Research_Button")));
	         ResearchButton.click();
             System.out.println(ResearchButton.getText());
             Thread.sleep(3000);
		     report.log(LogStatus.INFO, "clicks on Research Button");
             driver.navigate().back();
	    	 
             //Education First
	    	 Thread.sleep(5000);
             WebElement EducationFirstButton=driver.findElement(By.xpath(object.getProperty("EducationFirst_Button")));
	    	 EducationFirstButton.click();
	    	 System.out.println(EducationFirstButton.getText());
	    	 Thread.sleep(2000);
		     report.log(LogStatus.INFO, "clicks on Education First Button");
             driver.navigate().back();
	    	 
             //Product and Service
	    	 Thread.sleep(5000);
             WebElement ProductandServiceButton=driver.findElement(By.xpath(object.getProperty("ProductandService_Button")));
	    	 ProductandServiceButton.click();
	    	 System.out.println(ProductandServiceButton.getText());
	    	 Thread.sleep(2000);
		     report.log(LogStatus.INFO, "clicks on Product and Service Button");
             driver.navigate().back();
	    	 
	    	 //Login Button
	    	 Thread.sleep(5000);
             WebElement LoginButton =driver.findElement(By.xpath(object.getProperty("Login_Button")));
	    	 System.out.println("Login Button is Displayed : " +LoginButton.isEnabled());
		     report.log(LogStatus.INFO, "clicks on Login Button");

	    	}catch(Throwable t)
		    {
		    report.log(LogStatus.FAIL, "Sharekhan website Functionaltiy Failed");
            testUtil.captureScreenshot("sherkhan_website_launched_Test");
		    report.attachScreenshot(testUtil.mailscreenshotpath);
		    Assert.assertTrue(false, t.getMessage());
		    }
	    
	    }
	    
	  
	    @Then("^main menu pop is displayed$")
	    public void main_menu_pop_is_displayed() throws Throwable 
	    {
	     try {
	    	  Thread.sleep(5000);
	 	      report.startTest("main menu pop is displayed");
		      report.log(LogStatus.INFO, "main menu pop is displayed");
              app_logs.debug("main menu pop is displayed");
	          System.out.println("main menu pop is displayed"); 
	    }catch(Throwable t)
		    {
	    	 report.log(LogStatus.FAIL, "Sharekhan website Functionaltiy Failed");
             testUtil.captureScreenshot("sherkhan_website_launched_Test");
             report.attachScreenshot(testUtil.mailscreenshotpath);
		     Assert.assertTrue(false, t.getMessage());
		    }
	      }
	    
	    

	}
	
	
	
	
	
	
	
	

