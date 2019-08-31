package functions;

public class Car2 
{
  	int cc;
	String fueltype;
	int steering;
	
	public Car2() //Default Constructor
	{
	
	}
	
	//Parameterised Constructor
	/*public Car2(int cc1,String fueltype1,int steering1) 
	{
	 cc=cc1;
	 fueltype=fueltype1;
	 steering=steering1;
	 }
	 */
	
	//by using this keyword
	public Car2(int cc,String fueltype,int steering) 
	{
	 this.cc=cc; //when the name of instance variable and local variable is same we use this keyword before instance variables
	 this.fueltype=fueltype;
	 this.steering=steering;
	}
	
	
	public void accelaration()
	{
		
		System.out.println("Reanault Duster with :Engine:"+cc+", runs on Fuel with  " +fueltype+  " and steering is:" +steering);
	}

}
 