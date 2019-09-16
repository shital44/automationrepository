package BasicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flipkart1 
{
	
	@Test
	public void test2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		 
	//dr.get("https://www.youtube.com/");
	  dr.manage().window().maximize();
	  //Implicit wait
	  dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	  Actions act=new Actions(dr);
	 
	  act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
	//Explicit wait
	  WebDriverWait wait=new WebDriverWait(dr,5);
	  wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts']"))));
	 
	  
	  dr.findElement(By.xpath("//a[text()='Shirts']")).click(); 
	 WebElement ele=dr.findElement(By.xpath("//div[@class='_3QFE_k _3bwhLT']"));
	 act.dragAndDropBy(ele, 50,0).build().perform();
	 String parent=dr.getWindowHandle();
	 System.out.println(parent+"First");
	 Thread.sleep(2000);
	 
	 //first method 
	// wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//img[@class='_3togXc']")))).click();
	 
	 //other method when stale element exception occurs
	
	 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='_3togXc']")));
	 //dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
	 
	 
	 //method 3
	//wait.until(ExpectedConditions.stalenessOf(dr.findElement(By.xpath("//img[@class='_3togXc']"))));
	dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
	Set<String> wins=dr.getWindowHandles();
	
	for(String w:wins)
	{
		//System.out.println(w);
		if(!w.equals(parent))
		dr.switchTo().window(w);
	}
	
	
	dr.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("412207");
	}

}
