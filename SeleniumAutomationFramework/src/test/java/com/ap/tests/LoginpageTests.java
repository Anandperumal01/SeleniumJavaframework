package com.ap.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginpageTests extends BaseTest  {
	
	//public class LoginpageTests extends FrameworkConstants 
	// to avoid the above one we will create it final class for FrameworkConstants 
	// since only one class we can extends
	
	// naming conventions
	//class or Interface name --> AnandPerumal
	//final constant values -->ANANDPERUMAL or ANAND_PERUMAL
	//method name -->camelcasing-->anandPerumal
	//package name -->anandperumal
	// unused import to remove ====>ctrl+shift+o
	// Alignment ctrl+A and ctrl+i


	
	@Test
	public void test1() throws InterruptedException {

		//new FrameworkConstants();
		// to avoid creation of the object of the above step
		//
		
		//System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromeDriverPath());
	   // driver=new ChromeDriver();
	    
	    

		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
		//driver.quit();

	}

	@Test
	public void test2() throws InterruptedException {

	   //  System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
		// driver=new ChromeDriver();
		
	//	WebDriverManager.chromedriver().setup();
	//	driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		//driver.quit();

	}


}
