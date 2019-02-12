package TestBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	
	public static WebDriver driver;
	static Properties property;
	public static void loadproperty() 
	{
		try {
			File f=new File(".\\src\\main\\java\\configuration\\OR.properties");
			
			FileReader  fr=new FileReader(f);
			
			property=new Properties();
			
			property.load(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static By getElement(String key)
	{
		loadproperty();
		By loc = null;
		String value=property.getProperty(key);
		
		 String loctype=  value.split(":")[0];
		 String locval=value.split(":")[1];
		 
		 if(loctype=="id")
		 {
			 loc=   By.id(locval);
		 }
		 else if(loctype=="xpath")
		 {
			 loc=By.xpath(locval);
		 }
		return loc;
		
		 
	}
	
	public static void loadpropertyconfig() 
	{
		try {
			File f=new File(".\\src\\main\\java\\configuration\\config.properties");
			
			FileReader  fr=new FileReader(f);
			
			property=new Properties();
			
			property.load(fr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static String getconfig(String key)
	{
		loadpropertyconfig() ;
		String value=property.getProperty(key);
		return value;
	}
	
	
	
	

}
