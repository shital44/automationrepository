package functions;

public class Car 
{
	static int wheels=4;
	String colour="Blue";
	String model;
	
	public void specification()
	{
		System.out.println("Specifications:wheels:"+wheels+",Colour="+colour+",and Model="+model);
	}
    public static void testdrive()
    
    {
    	System.out.println("Test drive");
    }
    public static void main(String[] args) 
    {
    	//static variables and static Functions
		testdrive();
		System.out.println(wheels);
		
		//Non static variables and non static functions
		Car c=new Car();
		System.out.println(c.colour);
		c.specification();
	}
}
