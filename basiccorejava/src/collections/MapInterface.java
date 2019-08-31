package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface //when we have to stored the data in keys and values we use Map there are two types hashmap and hashtable
{

	public static void main(String[] args) 
	{
		/*//Hashmap //Hashmap allows NULL keys but HashTable does not allow null values.also Hashmap is synchronised
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("Anand", 30);
		map.put("Abhishekh", 27);
		map.put("Ayushi", 24);
		map.put(null,50);
		//System.out.println(map.get("Abhishekh"));
		System.out.println(map.get(null));
		*/
		
		///HashTAble
		
		Map<String, Integer> map=new Hashtable<String,Integer>();
		map.put("Anand", 30);
		map.put("Abhishekh", 27);
		map.put("Ayushi", 24);
		//map.put(null,50);
		map.put("Abhishekh",28);
		//System.out.println(map.get("Abhishekh"));
		System.out.println(map.get("Abhishekh"));
		Set<String> set=map.keySet();
		for(String s:set)
		{
			System.out.println(s);
		}

	}
	}

