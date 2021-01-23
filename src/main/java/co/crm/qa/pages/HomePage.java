package co.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath="//span[contains(text(), 'Dashboard')]")
	WebElement dashboard;
	
	@FindBy(xpath="//span[contains(text(), 'Customers')]")
	WebElement customers;
	
	@FindBy(xpath = "//span[contains(text(), 'Companies')]")
	WebElement companies;
	
	@FindBy(xpath = "//span[contains(text(), 'Transactions')]")
	WebElement transaction;
	
	@FindBy(xpath = "//span[contains(text(), 'Sales')]")
	WebElement sales;
	
	@FindBy(xpath = "//span[contains(text(), 'Orders')]")
	WebElement orders;
	
	@FindBy(xpath = "//span[contains(text(), 'Documents')]")
	WebElement documents;
	
	@FindBy(xpath = "//span[contains(text(), 'Calendar')]")
	WebElement calendar;
	
	@FindBy(xpath = "//span[contains(text(), 'Bank & Cash')]")
	WebElement bank;
	
	@FindBy(xpath = "//span[contains(text(), 'Products & Services')]")
	WebElement product;
	
	@FindBy(xpath = "//span[contains(text(), 'Reports')]")
	WebElement reports;
	
	@FindBy(xpath = "//span[contains(text(), 'Utilities')]")
	WebElement utilities;
	
	@FindBy(xpath = "//span[contains(text(), 'Appearance')]")
	WebElement appearance;
	
	@FindBy(xpath = "//span[contains(text(), 'Plugin')]")
	WebElement plugin;
	
	@FindBy(xpath = "//span[contains(text(), 'Settings')]")
	WebElement settings;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyDashboard() {
		return dashboard.isDisplayed();
	}
	
}
