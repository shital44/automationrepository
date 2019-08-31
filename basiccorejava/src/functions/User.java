package functions;

public class User {

	public static void main(String[] args) 
	{
		System.out.println(Car.wheels);
		Car.testdrive();
		Car.wheels=5;
	   ///Non static functions and variables
		Car Renault=new Car();//we can call static variables and functions by using classname
		Renault.colour="Black";
		Renault.model="ABC";
		Renault.specification();
 
		Car BMW=new Car();
		//BMW.colour="White";
		//BMW.model="X1";
		BMW.specification();
		
		Car Jaquar=new Car();
		//Jaquar.colour="Wine";
		// Jaquar.model="Xj";
		Jaquar.specification();
		Renault.specification();
	
		
	}

}
