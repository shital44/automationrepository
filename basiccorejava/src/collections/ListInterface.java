 package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface
{

	public static void main(String[] args) 
	{
		//Arraylist
    /*  List<String> list=new ArrayList<>();//<string>: this is called generic only string values are stored.we can make it non generic also then it takes all types of values
	  list
	   .add("anand");
	  list.add("Bahire");
	  list.add("techbodhi");
	   for(String s:list)
	   {
		   
		   System.out.println(s);
	   }*/
	
		
		/*//LinkedList
	   List<String> list=new LinkedList<>();// 
		  list.add("anand");
		  list.add("Bahire");
		  list.add("anand");
		  list.add("techbodhi");
		   for(String s:list)
		   {
			   
			   System.out.println(s);
		   }*/
	
		 //Vector
		  List<String> list=new Vector<>();
			  list.add("anand");
			  list.add("Bahire");
			  list.add("techbodhi");
			  list.add("Bahire");
			  list.add("techbodhi");
			   for(String s:list)
			   {
				   
				   System.out.println(s);
			   }
	
	}
	
	
	
	

}
