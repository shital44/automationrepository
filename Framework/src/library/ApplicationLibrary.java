package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.Configuration;

public class ApplicationLibrary 
{
 public WebDriver launchBrowser(String browserName)
 {
	 WebDriver dr=null;
	 if(browserName.equalsIgnoreCase("chrome"))
	 {
	 System.setProperty("webdriver.chrome.driver", Configuration.ChromeDriver);
	 dr=new ChromeDriver();
	 dr.get("http://newtours.demoaut.com/");
		
	  dr.manage().window().maximize();
	 }
	 else if(browserName.equalsIgnoreCase("firefox"))
	 {
		 //system.set property for geckodriver
		 dr=new FirefoxDriver();
	 }
	 return dr;

}
 public void navigate(WebDriver dr,String url)
 {
	 dr.get(url);
 }
 public boolean isElementPresent(WebDriver dr,By element)
 {
	 if (dr.findElements(element).size()>=1)
		 return true;
	 else
		 return false;
 
 }
}
