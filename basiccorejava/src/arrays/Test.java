package arrays;

public class Test 
{
	public static void main(String[] args) {
	
		//Assignment NO 14
			/*String arr1[] = new String [3];
			String arr2[] = new String [3];

			arr1[0]="A";
			arr1[1]="B";
			arr1[2]="C";

			arr2[0]="1";
			arr2[1]="2";
			arr2[2]="3";
			printAll(arr2);
			printAll(arr1);

			}

			public static void printAll(String str[])
			{
			for(int i=0; i < str.length ; i++){
			System.out.println(str[i]);
			}
			}

			}*/
//Assignment NO 15
		int a[][] = new int[10][5];
		for(int i=0;i<10;i++){

		for(int j=0; j<5; j++){
		a[i][j]=i*j;
		}
		}

		System.out.println(a[0][0]);
		System.out.println(a[1][3]);
		System.out.println(a[3][4]);
		}


		}	

	


