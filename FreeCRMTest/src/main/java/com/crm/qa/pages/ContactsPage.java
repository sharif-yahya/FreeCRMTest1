package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContactsPage extends TestBase {

    @FindBy(xpath = "//*[contains(@name,'first_name')]")
    @CacheLookup
    WebElement firstName;

    @FindBy(xpath = "//*[contains(@name,'last_name')]")
    WebElement lastName;

    @FindBy(xpath ="//*[@id='main-content']/div/div[2]/form/div[2]/div[2]/div/div/input")
    WebElement companyName;

    @FindBy(xpath = "//*[contains(@class,'plus inverted icon')]")
    WebElement saveBtn;



    //*[contains(@name,'company' )]

    public ContactsPage() {
        PageFactory.initElements(driver, this);

    }



    public void selectContactsByName(String name) {

        driver.findElement(By.xpath("//*[contains(text(),'"+name+"' )] ")).click();


    }
    public void selectMultipleContactsByName(String name){
        driver.findElement(By.xpath("//*[contains(text(),'"+name+"' )] ")).click();
    }
    public void createNewContact(String ftName, String lsName, String comp, String phonenumber){

        firstName.sendKeys(ftName);
        lastName.sendKeys(lsName);
        companyName.sendKeys(comp);
        saveBtn.click();



    }




}