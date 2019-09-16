package basicAnnotationsM1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseModule1 {
	@BeforeTest
	public void preModule()
	{
		System.out.println("Pre Condition for Module 1");
	}
	@AfterTest
	public void postModule()
	{
		System.out.println("Post Condition for Module 1");
	}
}
