package basicAnnotationM3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario6 {

	@Test
	public void test1()
	{
		System.out.println("Test case 1 from Scenario 6");
		
	}
	@Test
	public void test2()
	{
		System.out.println("Test case 2 from Scenario 6");
		
	}
	@Test
	public void test3()
	{
		System.out.println("Test case 3 from Scenario 6");
		
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
		System.out.println("Pre Condition for Scenario 6");
		
	}
	@AfterClass
	public void postScenario()
	{
		System.out.println("Post Condition for Scenario 6");
	}

}

