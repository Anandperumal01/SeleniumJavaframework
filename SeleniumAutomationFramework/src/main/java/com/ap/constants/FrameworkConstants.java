package com.ap.constants;

public final class FrameworkConstants {
	private FrameworkConstants() {
		
	}
	
	//CHROMEDRIVERPATH -this variable never going to change so we made it as final 
	//we made it  as private  and implemented as getter method
	private static final String CHROMEDRIVERPATH=System.getProperty("user.dir")+"/src/test/resources/Executeables/chromedriver.exe";

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

}
