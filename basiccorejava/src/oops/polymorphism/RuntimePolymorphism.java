package oops.polymorphism;

import oops.inheritance.Smartphone;
import oops.inheritance.Telephone;

public class RuntimePolymorphism {

	public static void main(String[] args) 
	{
		
   Telephone obj=new Smartphone();
   obj.calling();//when we run the program it is call from mobile class thogh we create obj of smartphone and refering telephone class it is called as runtime or dynamic polymorphism
	}
	

}
