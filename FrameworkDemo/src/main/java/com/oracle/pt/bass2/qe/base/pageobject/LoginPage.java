package com.oracle.pt.bass2.qe.base.pageobject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.oracle.pt.bass2.qe.base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//�û��������
	@FindBy(id="username")
	WebElement txt_username;
	
	//���������
	@FindBy(id="password")
	WebElement txt_password;
	
	//��½��ť
	@FindBy(className="login_btn")
	WebElement btn_login;
	
	
	//��ӭ����
	@FindBy(partialLinkText="����")
	WebElement lab_hello;
	
	public void login(String username,String password) {
		
		sendKeys(txt_username, username);
		sendKeys(txt_password, password);
		click(btn_login);
		assertEquals("http://localhost/index.php?m=user&c=index&a=index", driver.getCurrentUrl());
	}
	
	


}
