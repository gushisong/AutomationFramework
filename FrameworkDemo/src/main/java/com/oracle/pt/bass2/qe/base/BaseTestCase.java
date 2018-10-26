package com.oracle.pt.bass2.qe.base;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.oracle.pt.bass2.qe.rule.RetryRule;
import com.oracle.pt.bass2.qe.util.Constants;
import com.oracle.pt.bass2.qe.util.WebDriverManager;

public class BaseTestCase {
	
	@Rule
	public RetryRule retryRule=new RetryRule();
	
	public static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver=WebDriverManager.getWebDriver(Constants.BrowserName);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}



}
