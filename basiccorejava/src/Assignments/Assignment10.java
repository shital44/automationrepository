package Assignments;

public class Assignment10 {

	public static void main(String[] args) 
	{/*10) Suppose there is an integer array holding following elements:
		//1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1
		 * Write a program which prints which each number from array and the times it has been repeated in array
            Fox eg.
           1- Repeated 3 times
           4- Repeated 6 times
        */

		int[] arr= {1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
		int count=0;

            for(int i=0;i<32;i++)
            {
              count=0;
              for(int j=1;j<32;j++)
              {
            	  if(arr[i]==arr[j]);
            	  {
            	  count++;
            	  }
            	 
              
              System.out.println(arr[i] +"-repeated" +count+ "times");
              }
            }
	}
}