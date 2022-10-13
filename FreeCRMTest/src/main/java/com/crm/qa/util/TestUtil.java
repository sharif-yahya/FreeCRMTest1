package com.crm.qa.util;


import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class TestUtil extends TestBase {

	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;


	public void switchToFram(){

		driver.switchTo().frame("mainPanel");

	}
	public void Actions(){
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText(""))).build().perform();


		}

}
