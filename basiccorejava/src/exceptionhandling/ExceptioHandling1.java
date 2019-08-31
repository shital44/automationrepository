package exceptionhandling;

public class ExceptioHandling1 {

	public static void main(String[] args)
	{
		try 
		{
			System.out.println(10/0);
		}catch (ArithmeticException e)
		{
			System.out.println("Recovery Scenario");
			System.out.println(e.getMessage());
		}

	}
}


