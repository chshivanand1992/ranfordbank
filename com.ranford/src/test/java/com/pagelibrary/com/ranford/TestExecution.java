package com.pagelibrary.com.ranford;

import org.testng.annotations.Test;

import Excel.Excelclass;

public class TestExecution extends Reprository {
	
	
	@Test(priority=0)
	public void verify_launch()
	{
		launch();
	}
	@Test(priority=1)
	public void verify_login()
	{
		login();
	}
	
	
	
	
	
	/*@Test(priority=1)
	public void verify_login()
	{
		Excelclass.excelconnection("data.xls", "Sheet1");
		
		for(int r=1;r<Excelclass.rowcount();r++)
		{
			String username=Excelclass.readdata(0, r);
			String password= Excelclass.readdata(1, r);
			login(username,password);
		}
		
	}*/
	
	
	
}
