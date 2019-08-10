package Assignments;

public class Ass2EvenNos {
	public static void main(String[] args)
	{
		int count=0;
		//for loop to display even numers between 1 to 100
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			System.out.println(i);
			count+=i;
		}
		 	System.out.println(count);
		
}
}
//query:suppose we want to know how many  even numbers are there between 1 to 100 then how will we calculate??