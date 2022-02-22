package com.ap.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ap.constants.FrameworkConstants;

public class BaseTest {


	public WebDriver driver;
	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromeDriverPath());
		driver=new ChromeDriver();



		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}
	@AfterMethod
	public void teardown() {
		driver.quit();


	}

}
