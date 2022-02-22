package com.ap.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	

	
	
	
	@Test
	public void test3() throws InterruptedException {

	   //  System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
		// driver=new ChromeDriver();
		
	//	WebDriverManager.chromedriver().setup();
	//	driver=new ChromeDriver();
	//	driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
		//driver.quit();

	}

}
