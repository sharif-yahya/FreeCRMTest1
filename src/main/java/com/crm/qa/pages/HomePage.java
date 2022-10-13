package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{
    @FindBy(xpath = "//b[contains(text(),'ey')]")
    WebElement userNameLabel;

    @FindBy(xpath = "//*[contains(text(),'Contacts')]")
    WebElement contactsLink;

    @FindBy(xpath = "//*[contains(text(),'Deals')]")
    WebElement DealsLink;




    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle(){
        return driver.getTitle();
    }
    public boolean verifyCorrectUserName(){
        return userNameLabel.isDisplayed();
    }
    public ContactsPage clickOnContactsLink(){
       contactsLink.click();
       return new ContactsPage();
    }
    public DealsPage clickOnDealsLink(){
        DealsLink.click();
        return new DealsPage();
    }


}
