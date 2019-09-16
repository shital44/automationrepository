package basicAnnotationM2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario4 {

	@Test
	public void test1()
	{
		System.out.println("Test case 1 from Scenario 4");
		
	}
	@Test
	public void test2()
	{
		System.out.println("Test case 2 from Scenario 4");
		
	}
	@Test
	public void test3()
	{
		System.out.println("Test case 3 from Scenario 4");
		
	}
	@BeforeMethod
	public void testcaseprecondition()
	{
		System.out.println("Test case pre condition");
	}
	@AfterMethod
	public void testcasepostcondition()
	{
		System.out.println("Test case post condition");
	}
	@BeforeClass
	public void preScenario()
	{
		System.out.println("Pre Condition for Scenario 4");
		
	}
	@AfterClass
	public void postScenario()
	{
		System.out.println("Post Condition for Scenario 4");
	}

}


