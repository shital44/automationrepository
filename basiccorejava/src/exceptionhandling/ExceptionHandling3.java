package exceptionhandling;

public class ExceptionHandling3 {

	public static void main(String[] args) throws InterruptedException 
	{
	pause1(6000);
	pause(6000);
    test();
	}
	public static void pause(int seconds) throws InterruptedException
	{
		Thread.sleep(seconds);
	}

	public static void pause1(int seconds)
	
	{
		try
		{
			
		Thread.sleep(seconds);
	}catch(InterruptedException e)
		{
		e.printStackTrace();
		}
}
	
	public static void test() throws ArithmeticException
	{
		
	}
	}
	

