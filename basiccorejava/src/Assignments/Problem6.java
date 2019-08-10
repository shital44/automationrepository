package Assignments;

public class Problem6 {
	public static void main(String args[])
	{
		int[] rev=new int[5];
		 rev[0]=1;
		 rev[1]=2;
		 rev[2]=3;
		 rev[3]=4;
		 rev[4]=5;
		 
		for(int i=4;i>=0;i--)  ///if we write rev.length then it will give error, we hardcore array value as 5 if we want dynamic array then how it is possible
		{System.out.print(rev[i]+" ");
		
		}
	}

}
