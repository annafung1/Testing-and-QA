package test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class q3 {
public String baseUrl = "https://www.facebook.com/";
String driverPath = "C:\\geckodriver.exe";
public WebDriver driver ;
	;
@Test
public void verifyEmailTag() {
	

	driver = new FirefoxDriver();
	driver.get(baseUrl);
	
	System.setProperty("webdriver.gecko.driver", driverPath);
	System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	String expected= "email";
	
	//WebElement emailBox= driver.findElement(By.id("email"));
	
	WebElement emailBox= driver.findElement(By.name("email"));
	String actual = emailBox.getAttribute("name"); 
	System.out.println("The tag was:" + " " + actual);
	Assert.assertEquals(actual, expected);
		driver.close()
	; }
}
	


//getTagName will not return the name of the tag apparently,at least not when paired with web element
//need to get attribute instead 
//can also use id or name, if you inspect you will see they are both named email