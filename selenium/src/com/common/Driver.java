package com.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.firefox.*;

public class Driver {

	WebDriver driver;
	
	public WebDriver getDriver(int a){
		System.out.println(System.getProperty("user.dir"));
		String libPath = System.getProperty("user.dir") + "//lib";
		switch(a) {
		case 1 : 
				System.setProperty("webdriver.ie.driver",libPath + "//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
		case 2 : 
				System.setProperty("webdriver.gecko.driver",libPath + "//geckodriver.exe");
				driver = new FirefoxDriver();
				break;
		case 3 :
				System.setProperty("webdriver.chrome.driver",libPath + "//chromedriver.exe");
				driver = new ChromeDriver();
				break;
		default :
			System.setProperty("webdriver.ie.driver",libPath + "//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		return driver;
	}
	
	public static void main(String[] args) {
		WebDriver d;
		Driver driver = new Driver();
		d = driver.getDriver(0);
		d.get("http://www.google.com");
	}
	
}
