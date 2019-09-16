package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.Configuration;
import library.ApplicationLibrary;
import pages.FlightFinder;
import pages.HomePage;

public class TC_MurcuryTours_Login 
{
  WebDriver dr;
  ApplicationLibrary lib;
  @BeforeClass
  public void initialize()
  {
	  lib=new ApplicationLibrary();
	  dr=lib.launchBrowser("chrome");
	  Assert.assertTrue(dr!=null);
  }
  
  @Test
  public void Script1()
  {
	  //Login in the application
	  dr.get(Configuration.url);
	  HomePage page1=new HomePage(dr);
	  page1.login(Configuration.globalUsername,Configuration.globalPassword);
	  
	  //Verify Login
	  FlightFinder page2=new FlightFinder(dr);
	  Assert.assertTrue(lib.isElementPresent(dr, page2.oneway));
  }
  @AfterClass
  public void tearDown()
  {
	dr.quit();  
  }
}
