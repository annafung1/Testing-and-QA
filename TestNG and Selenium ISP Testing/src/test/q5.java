package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class q5 {


	
	String driverPath = "C:\\geckodriver.exe";
	public WebDriver driver ;
	
	
	 @Test(priority = 1)			
	   public void openBrowser() {	
		 driver = new FirefoxDriver();
	   			
	  }
	 @Test(priority = 2)			
	    public void launchGoogle() {

		 System.setProperty("webdriver.gecko.driver", driverPath);
	     System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");	
		String baseUrl = "http://www.google.com";
		driver.get(baseUrl);	
		}
		
		@Test(priority = 3)	
		public void peformSeachAndClick1stLink() {
		
			WebElement google= driver.findElement(By.name("q"));
			//WebElement press_search= driver.findElement(By.name("btnK"));
			google.clear();
			google.sendKeys("Facebook");
			google.submit();
			 try {
			        Thread.sleep(3000); //wait 3 secs
			    } catch (InterruptedException e) {
			        e.printStackTrace();
			    }

		}		
	 
		
		@Test(priority=4)
		  public void FaceBookPageTitleVerification() {
			  String actual = driver.getTitle();
			  String expected = "Google"; 
			  System.out.println("The title is: "+ actual);
			  Assert.assertTrue(actual.contains(expected));
			 
		  }
		  @Test(priority=5)
		  public void driverexit() {
			 driver.close();
	
		  }
	
}
