package com.oracle.pt.bass2.qe.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oracle.pt.bass2.qe.annotation.Retry;
import com.oracle.pt.bass2.qe.base.BaseTestCase;
import com.oracle.pt.bass2.qe.base.pageobject.LoginPage;
import com.oracle.pt.bass2.qe.util.Constants;

public class Login extends BaseTestCase{

	@Test
	@Retry(runtimes=3)
	public void login() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(Constants.UserName, Constants.Password);
		
	}

}
