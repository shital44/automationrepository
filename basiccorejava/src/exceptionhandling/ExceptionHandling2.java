package exceptionhandling;

public class ExceptionHandling2 
{

	public static void main(String[] args) {
	try
	{
	String str="anand";
	System.out.println(str.charAt(10));
	System.out.println(10/0);
	}
	catch (ArithmeticException e)
	{
		System.out.println("Recovery Scenario number");
		System.out.println(e.getMessage());
	}catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("Recovery Scenario String");
		System.out.println(e.getMessage());

	}

}
}
