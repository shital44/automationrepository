package BasicSelenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass2 {
	@Test
	public void test2() throws InterruptedException
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
	 dr.findElement(By.xpath("//input[@value='oneway']")).click();
	 
	 WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
	
	 //Dropdown
	 
	 Select sel=new Select(pass);
	 sel.selectByIndex(2);//there are three methods for select elements 1
	 
	 Thread.sleep(2000);
	 sel.selectByValue("2");//2
	 
	 
	 Thread.sleep(2000);
	 sel.selectByVisibleText("4"); //3 method
	 
	 
	 //Write code to handle other dropdowns
	 
	dr.findElement(By.xpath("//input[@name='findFlights']")).click();
	WebElement table=dr.findElement(By.xpath("//table[@cellspacing='1'][1]/tbody"));
	List<WebElement> rows=table.findElements(By.tagName("tr"));
	 
	for(WebElement r:rows)
	{
		List<WebElement> cols =table.findElements(By.tagName("td"));
		for(WebElement c : cols)
		{
			System.out.print(c.getText()+" ");
		}
		System.out.println();
		}
	
	//click to continue
	dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	//dr.findElement(By.ByXPath)
	
	//country dropdown
	
	WebElement Country=dr.findElement(By.xpath("//select[@name='delCountry']"));
	Select cont=new Select(Country);
	 cont.selectByIndex(3);
	 // Alert
	 Alert alt=dr.switchTo().alert();
	 System.out.println(alt.getText());
	 alt.accept();
	// alt.dismiss();
	 
	 //checkbox
	WebElement check= dr.findElement(By.xpath("//input[@name='ticketLess']"));
	System.out.println((check.isSelected()));
	check.click();
	System.out.println((check.isSelected()));
	
	dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
	 
	
	//Message
	System.out.println(dr.findElement(By.xpath("//font[@size='1']']")).getText());
	
	//image
	
	WebElement img= dr.findElement(By.xpath("//img[@alt='Mercury Tours']"));
	System.out.println(img.getAttribute("width"));
	System.out.println(img.getAttribute("height"));
	
	}
	 
	  
	  
	}



