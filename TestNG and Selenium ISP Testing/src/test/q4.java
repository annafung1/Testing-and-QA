package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class q4 {
	
	public String baseUrl = "https://lambdatest.github.io/sample-todo-app/";
	String driverPath = "C:\\geckodriver.exe";
	public WebDriver driver ;
	
	@Test
	public void checkingitem() {
		
		System.setProperty("webdriver.gecko.driver", driverPath);
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		

		//li2
		//li4
		
		WebElement second_item= driver.findElement(By.name("li2"));
		second_item.click();
		
		WebElement fourth_item= driver.findElement(By.name("li4"));
		fourth_item.click();
		
		WebElement enter_name= driver.findElement(By.id("sampletodotext"));
		WebElement submit_= driver.findElement(By.id("addbutton"));
		enter_name.clear();
		enter_name.sendKeys("Anna");
		

		  try {
		        Thread.sleep(5000); // wait for 5 seconds then submit
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		submit_.click();
		
		
		//driver.close(); 
		}
	}

//https://www.browserstack.com/guide/selenium-click-command
//https://stackoverflow.com/questions/25208985/clear-placeholder-with-selenium-webdriver
//https://stackoverflow.com/questions/10799794/how-to-delete-default-values-in-text-field-using-selenium

		

