package test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class q2 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\geckodriver.exe";
	public WebDriver driver ;

	 @Test
	public void verifyHomepageTitle() {
	System.out.println("launching firefox browser");
	System.setProperty("webdriver.gecko.driver", driverPath);
	System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //need to add this line
	driver = new FirefoxDriver();
	driver.get(baseUrl);
	String expectedTitle = "Welcome: Mercury Tours";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	System.out.println("The title was:" + " " + actualTitle);
	
	 try {
	        Thread.sleep(3000); //wait 3 secs
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }

	driver.close(); }
	 }

