package functions;

public class AccessModifiers 
{

	public static void main(String[] args)
	{
		AccessModifiers obj=new AccessModifiers();
		obj.publicfunction();
		obj.privatefunction();//calling private function access only within the class
		obj.protectedfunction();
		obj.deffaultfunction();

	}
 public void publicfunction()
 {
	 System.out.println("Public Function");
 }
 
 private void privatefunction()
 {
	 System.out.println("private Function");
 }
 
 
 
 protected void protectedfunction() //within the package
 {
	 System.out.println("Protected Function");
 }
 
 
   void deffaultfunction()
 {
	 System.out.println("Default Function");
 }
}
 