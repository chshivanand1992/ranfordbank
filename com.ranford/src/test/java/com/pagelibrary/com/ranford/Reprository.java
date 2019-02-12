package com.pagelibrary.com.ranford;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestBase.Base;



public class Reprository extends Base {

	public ExtentReports report;
	
	       public  ExtentTest   test;
	@BeforeTest
	public void report()
	{
		 report=new ExtentReports("./extentreport/report.html",true);
	}
	@BeforeMethod
	public void sendthefunction_toreport(Method method)
	{
		test=  report.startTest((this.getClass().getSimpleName()+"::"+method.getName()));
		test.assignAuthor("shiva");
		test.assignCategory("Regression");
	}
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(getconfig("build1"));
		
		 String actualurl=driver.getCurrentUrl();
		  String expurl=getconfig("build1");
		  
		if(actualurl.contains(expurl))
		{
			test.log(LogStatus.PASS, "my expurl is "+getconfig("build1")+ "matching with my actualurl "+driver.getCurrentUrl());
		}
		else
		{
			test.log(LogStatus.FAIL, "my expurl is "+getconfig("build1")+ "not matching with my actualurl "+driver.getCurrentUrl());
		}
		      
		      
		
		
	}
	public void login()
	{
		BankerLogin_Page.username_editbox().sendKeys();
		BankerLogin_Page.password_editbox().sendKeys();
		BankerLogin_Page.login_editbox().click();
		
		
		//driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
	}
	
	
	
	
	
	
	
	
}
