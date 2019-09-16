package basicAnnotationM2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseModule2 {
	@BeforeTest
	public void preModule()
	{
		System.out.println("Pre Condition for Module 2");
	}
	@AfterTest
	public void postModule()
	{
		System.out.println("Post Condition for Module 2");
	}

}
