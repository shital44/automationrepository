package basicAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass 
{
	@BeforeSuite
public void setUp()
{
	System.out.println("Pre condition for suite");
}
	@AfterSuite
	public void teardown()
	{
		System.out.println("Post condition for suite");
	}
}
