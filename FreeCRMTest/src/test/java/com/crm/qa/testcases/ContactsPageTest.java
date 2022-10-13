package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ContactsPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    ContactsPage contactsPage;
    TestUtil testUtil;

    public ContactsPageTest() {
        super();

    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        contactsPage = new ContactsPage();
        testUtil = new TestUtil();
        driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        contactsPage = homePage.clickOnContactsLink();


    }

    @Test(priority = 1)
    public void selectContactsTest(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("dashboard-toolbar"))).build().perform();
        contactsPage.selectContactsByName("hassan y amin");



    }
    @Test(priority = 2)
    public void selectMultipleContactsTest(){

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("dashboard-toolbar"))).build().perform();

        contactsPage.selectContactsByName("leena h jebr");

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}