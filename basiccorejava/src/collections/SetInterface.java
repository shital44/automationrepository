package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) 
	{
	/*	Set<Integer> set=new HashSet<>();//Hashset gives random values and unique values
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(30);
		set.add(40);
		for(int a:set)
		{
			System.out.println(a);
		}*/
		
       
		//Linked linkedhashset
		
		/*Set<Integer> set=new LinkedHashSet<>();//by using linkedhashset we can display values as inserted
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(30);
		set.add(40);
		for(int a:set)
		{
			System.out.println(a);
		}*/
		
		//Treeset
		Set<Integer> set=new TreeSet<>();//treeset displays values in sorted order and unique values
		set.add(30);
		set.add(40);
		set.add(30);
		set.add(40);
		set.add(10);
		set.add(20);
		/*for(int a:set) //This is one type of display output
		{
			System.out.println(a);
		}*/
		//second way is
		
		
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}
	
	
	

}
