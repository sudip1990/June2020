package co.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name = "username")
	//WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	WebElement username;
	
	@FindBy(name = "password")
	//WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	WebElement password;
	
	@FindBy(xpath = "//button[@name='login']")
	//WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
	WebElement button;
	
	@FindBy(xpath = "/html/body/div/div/div/div/img")
	//WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
	WebElement logo;
	
	@FindBy(xpath = "//*[@id=\"side-menu\"]/li[2]/a/span")
	//WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
	WebElement dash;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	
	}
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateTechfiosLogo() {
		return logo.isDisplayed();
	}
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		button.click();
		return new HomePage();
	} 
	
	
}
