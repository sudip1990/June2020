package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

import co.crm.qa.pages.HomePage;
import co.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setup() {
		
		intialization();
		loginPage = new LoginPage();
		}
	
	@Test(priority=1)
	public void validateLoginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		
		Assert.assertEquals(title, "Login - iBilling");
	}
	
	@Test(priority=2)
	public void loginTest() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
