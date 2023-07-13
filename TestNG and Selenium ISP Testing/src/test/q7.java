package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class q7 {

	
	String driverPath = "C:\\geckodriver.exe";
	public WebDriver driver ;
	
	
	 @Test(priority = 1)			
	   public void openBrowser() {	
		 driver = new FirefoxDriver();
	   			
	  }
	 @Test(priority = 2)			
	    public void launchLinkedIn() {

		 System.setProperty("webdriver.gecko.driver", driverPath);
	     System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");	
		String baseUrl = "https://www.linkedin.com/uas/login?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Ffeed%2F&fromSignIn=true&trk=cold_join_sign_in";
		driver.get(baseUrl);	
		}
		
		@Test(priority = 3)	
		public void peformLogin() {
		
			WebElement login= driver.findElement(By.name("session_key"));
			WebElement password= driver.findElement(By.name("session_password"));
			//login.clear();
			login.sendKeys("username");
			password.sendKeys("password");
			
			password.submit();
			 try {
			        Thread.sleep(3000); //wait 3 secs
			    } catch (InterruptedException e) {
			        e.printStackTrace();
			    }

		}		
	 
		
		@Test(priority=4)
		  public void LinkedinURLVerification() {
			
			
			String expected ="https://www.linkedin.com/feed/";
			String actual = driver.getCurrentUrl();
			 
			  System.out.println("Url is: "+ actual);
			  Assert.assertTrue(actual.contains(expected));
			 
		  }
		  @Test(priority=5)
		  public void driverexit() {
			//driver.close();
	
		  }

	
}
