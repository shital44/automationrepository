package functions;

public class Functions1 {

	public static void main(String[] args)
	{
		sum(10,20);
		sum(30,40);
		sum(50,60);
		sub(20,40);
		mul(30,60);
		dev(90,30);
		msg(); 
	}
	public static void sum(int a,int b)
	{
	
		
		System.out.println(a+b);
		
		
	} 
	public static void msg()
	{
		System.out.println("studying Functions");
	}
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void dev(int a,int b)
	{
		System.out.println(a/b);
	
	}

}
