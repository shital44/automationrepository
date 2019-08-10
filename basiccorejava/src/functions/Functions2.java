package functions;

public class Functions2 {

	public static void main(String[] args) {
		/*
		 * int sum1,sum2; sum1= sum(10,20); sum2=sum(30,40);
		 * System.out.println(sum1+sum2); } public static int sum(int a,int b) {
		 * return(a+b); }
		 */
		eligible(31);
		boolean res;
		res=eligible(31);
		
		if(res)   //we cannot hardcore like if(true).it returns only true value not going for else part
		{
			System.out.println("you are eligible  ");
		}else
		{
			System.out.println("you are not eligible  ");
		}
 
	}
    public static boolean eligible(int age) {
		if (age >= 18 && age <= 30) 
		{
			return true;

		} else
			return false;
	}

}
