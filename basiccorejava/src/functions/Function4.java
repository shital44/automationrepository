package functions;

public class Function4 {

	public static void main(String[] args) 
	{
		String res=result(82);
       System.out.println(res);
	}
	public static String result(int marks)
	{
		if(marks>35 && marks<60)
		{
			return "You are Pass";
			//System.out.println("you are pass");
		}else
			if(marks>=60 && marks<75)
			{
				return "you got first class";
				
			}else
				if(marks>=75)
				{
					return "You got Distinction!!";
				}
				else
					return "You are fail";
					}
		
	}

