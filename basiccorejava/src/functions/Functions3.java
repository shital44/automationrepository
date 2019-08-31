package functions;

public class Functions3 {

	public static void main(String[] args)
	{
		int[] marks= {33,86,45,78,91};
		 
		String res=finalResult(marks);
		System.out.println(res);

	}
	public static String finalResult(int[] arr)
	{
		int total=0;
		boolean fail=false;
		 
		for(int i=0;i<arr.length;i++)
		{
			total=total+arr[i];
			if(arr[i]<35) //since in one subject marks is 33 since it is true
			{
				fail=true;
			}
			
		}
		System.out.println(total);
		double per=total*100/500;
		System.out.println(per);
		
		String res = null;
		if(fail)
		{
			res="You are Fail";
		}
		else
		if(per>=75)
		{
			res="Pass with Distiction";
		}
		else
			if(per>=60)
			{
				res="Pass with first class";
	        }else
		if(per>=35)
		{
			res="Pass with second class";
		}

		
		 return res;
	}
	   

	
} 


