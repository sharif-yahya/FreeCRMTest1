package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    DealsPage dealsPage;

    ContactsPage contactsPage;
    TestUtil testUtil;
    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        contactsPage = new ContactsPage();
        dealsPage = new DealsPage();
        driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
      homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    @Test(priority = 1)
    public void verifyHomePageTitleTest(){
    String  HomePagetitle =  homePage.verifyHomePageTitle();
        Assert.assertEquals(HomePagetitle,"Cogmento CRM","Home page title not matched");

    }
    @Test(priority = 2)
    public void verifyuserNameLabelTest(){
      Assert.assertTrue(homePage.verifyCorrectUserName());
    }
    @Test(priority = 3)
    public void clickOnContactsLinkTest(){
        contactsPage = homePage.clickOnContactsLink();

   }
   @Test
   public void clickOnDealsLinkTest(){
    dealsPage = homePage.clickOnDealsLink();

   }













    @AfterMethod
    public void teradown(){
        driver.quit();
    }



}
