package com.pagelibrary.com.ranford;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class BankerLogin_Page extends Base {

	
	public static WebElement username_editbox()
	{
		return driver.findElement(getElement("username"));
	}
	
	public static WebElement password_editbox()
	{
		return driver.findElement(getElement("password"));
	}
	public static WebElement  login_editbox()
	{
		return driver.findElement(getElement("login"));
	}
	
	
}
