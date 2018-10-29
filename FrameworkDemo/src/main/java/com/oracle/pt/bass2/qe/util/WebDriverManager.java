package com.oracle.pt.bass2.qe.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

	private static WebDriver driver;

	public static WebDriver getWebDriver(String browserName) {
		
		if("Chrome".equals(browserName)) {
			System.setProperty("webdriver.chrome.driver", "F:\\java_lib\\BrowserDrivers\\chromedriver.exe");
			ChromeOptions chromeOptions=new ChromeOptions();
			chromeOptions.addArguments("disable-inforbars");
			driver=new ChromeDriver(chromeOptions);
		}else if("Firefox".equals(browserName)) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

			driver=new FirefoxDriver();
		}
		driver.get(Constants.URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;

	}
	
	public static WebDriver getWebDriver() {
		return driver;
	}
}
