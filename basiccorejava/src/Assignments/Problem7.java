package Assignments;

public class Problem7 {

	public static void main(String[] args) 
	{
		int i;
		// Print alternate elements of String array array
		String[] str=new String[7];  //array syntax
		str[0]="Abhishek";
	    str[1]="Rutuja";
	    str[2]="Shirin";
	    str[3]="Shiva";
	    str[4]="Shital";
	    str[5]="Sanjeet";
	    str[6]="Ayushi";
	      for( i=0;i<=6;i++)
	      {   if(i%2==0)
	    	  {
	    	  System.out.println(str[i]);
	    	  }
	      /*else
	    	  {
	    	  System.out.println(str[i]);
	    	  }*/
	    	  
	     

	}
	}

}
