package arrays;

public class Concatination {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		String name="Anand";
		System.out.println(i+j);//+ operater is used for addition and concatenation
		System.out.println(i+j+name);
		System.out.println(i+name+j);
		System.out.println(name+i+j);//first add name and value of i then it conatenete with j
		System.out.println(name+(i+j));

	}
}
