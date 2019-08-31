 package variablesanddatatypes;

import functions.AccessModifiers;

public class TestAccessModOutsideThePackage extends AccessModifiers { 

	public static void main(String[] args) 
	{
		AccessModifiers obj=new AccessModifiers();
		obj.publicfunction(); //only public fuction can access outside the package
		TestAccessModOutsideThePackage obj2=new TestAccessModOutsideThePackage();
		obj2.protectedfunction();
		

		

	}

}
