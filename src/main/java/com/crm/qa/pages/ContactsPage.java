package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;


public class ContactsPage extends TestBase {


    public ContactsPage() {
        PageFactory.initElements(driver, this);

    }



    public void selectContactsByName(String name) {

        driver.findElement(By.xpath("//*[contains(text(),'"+name+"' )] ")).click();


    }
    public void selectMultipleContactsByName(String name ){
        driver.findElement(By.xpath("//*[contains(text(),'"+name+"' )] ")).click();
    }
}