package exceptionhandling;

public class UncheckedExceptions 
{
    public static UncheckedExceptions obj;
	public static void main(String[] args) 
	{
		String str="anand";
		//System.out.println(str.charAt(6));//StringIndexOutOfBound exception
        System.out.println(10/0); //Arithmatic exception
	    //obj=new UncheckedExceptions();
		obj.test();//null pointer exception 
	}
	public static void test() //
	{
	
		
	}
	

}
