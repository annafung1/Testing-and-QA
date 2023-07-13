package test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class q6 {
	
	//im stupid answer is on page 9
	
	@Test
	public void executeSessionOne() {
		
		
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/V4/");
		

		WebElement Driver_1= driver.findElement(By.name("uid"));
		Driver_1.sendKeys("Driver 1");

	}
	
	@Test
	public void executeSessionTwo() {
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/V4/");
		

		WebElement Driver_2= driver.findElement(By.name("uid"));
		Driver_2.sendKeys("Driver 2");
		
		
	}
	
	@Test
	public void executeSessionThree() {
		
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/V4/");
		

		WebElement Driver_3= driver.findElement(By.name("uid"));
		Driver_3.sendKeys("Driver 3");
		
	}
	

}
