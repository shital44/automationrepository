package collections;

public class ObjectArray 
{
	
	public static void main(String[] args)
	{
   Object[] arr = new Object[3];//Object class is a superclass of all classes
   arr[0]=100;
   arr[1]=true;
   arr[2]="anand";
   
   int val[]= {1,32,34,56,70};
   
   
   //type 1 for printing array
  /* for(int i=0;i<arr.length;i++)
   {
	   System.out.println(arr[i]);
   }*/
   //type 2 for printing array it is called enhanced for loop
   for(Object o:arr)
   {
	   System.out.println(o);
   }
   for(int i:val)  //we can print all types of array syntax (datatype variable name:arrayname)
   {
	   System.out.println(i);
   }
}
   

   

}
