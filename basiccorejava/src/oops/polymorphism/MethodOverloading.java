package oops.polymorphism;
//This is called static Polymorphism
public class MethodOverloading//overloading: same function name with different parameters This is called static Polymorphism
{

	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.sum(10, 20);
		obj.sum(10, 20,30);

	}

	 public int sum(int a,int b)
	 {
	 return(a+b);
    }
	 public int sum(int a,int b,int c)
	 {
		 return(a+b+c);
	 }
	 
}
