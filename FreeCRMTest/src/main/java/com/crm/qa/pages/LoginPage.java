package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// page Factory -OR:
	
	
			

	@FindBy(xpath = "//input[contains(@type,'text')]")
	WebElement email;

	@FindBy(xpath = "//input[contains(@type,'password')]")
	WebElement password;

	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;

	// initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Action
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String un, String pwd) {
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();

	}

}
