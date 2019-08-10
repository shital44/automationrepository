package functions;

public class Assignment1 {

	public static void main(String[] args) 
	{
	 
	  String res=result(62); 
	  System.out.println(res);

	}
	public static String result(int marks)
	{
		String res;
		if(marks>=75)
		{
			res="Pass with Distiction";
		}
		else
			if(marks>=60)
			{
				res="Pass with first class";
	        }else
		if(marks>=3)
		{
			res="Pass with second class";
		}

		else
			res="you are Failed";
		 return res;
	}
	   

}