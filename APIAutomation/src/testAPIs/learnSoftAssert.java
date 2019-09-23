package testAPIs;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class learnSoftAssert 
{
@Test(priority=2)
public void test1()
{
	SoftAssert ars=new SoftAssert();
	//Assert.assertTrue(10>10);
	ars.assertTrue(10>10);
	
	System.out.println("Shital");
	ars.assertAll();
}
@Test(priority=1)
public void test2()
{
	System.out.println("Testing");
}
@Test(priority=0)//to execute in order
public void test3()
{
	System.out.println("Testing2");
}
}





