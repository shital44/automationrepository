package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingMaven 
{
	@Test
 public void test1()
 {
	 System.out.println("Testing");
 }
	@Test
 public void login()
 {
			
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
			ChromeDriver dr=new ChromeDriver();
			dr.get("http://www.newtours.demoaut.com");
		//dr.get("https://www.youtube.com/");
		  dr.manage().window().maximize();//for maximizing screen
		  //TextBox
		  dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		  dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		  //RadioButton
		 dr.findElement(By.xpath("//input[@name='login']")).click(); 
 }
 
}
