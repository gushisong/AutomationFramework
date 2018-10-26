package com.oracle.pt.bass2.qe.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.oracle.pt.bass2.qe.logger.Log;

public class BasePage {

	protected WebDriver driver;
	protected Log log;
	
	/**
	 *	初始化界面元素
	 * @param driver
	 */
	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		log=new Log(this.getClass());
		
	}
	
	public void sendKeys(WebElement element,String keys) {
		log.info("向页面元素 : "+element.toString().split("->")[1].toString()+" 输入 ："+keys);
		element.clear();
		element.sendKeys(keys);
		
	}
	public void click(WebElement element) {
		log.info("点击元素  ："+element.toString());
		try {
			element.click();
		} catch (Exception e) {
			// TODO: handle exception
			new Actions(driver).click(element).perform();
		}
		
	}
	
	
	

}
