package filehandling;

import java.io.IOException;

public class TestXlsReader {

	public static void main(String[] args) throws IOException 
	{
		Xls_Reader x1=new Xls_Reader("D:\\automationrepo\\automationrepository\\basiccorejava\\src\\filehandling\\TestData.xls");
		int rows=x1.getRowCount("Sheet1");
		int cols=x1.getColumnCount("Sheet1");
		System.out.println(rows);
		System.out.println(cols);
		System.out.println(x1.getCellData("Sheet1", 1, 1));
	     for(int r=1;r<=rows;r++)
	     {
	    	 for(int c=1;c<=cols;c++)
	    	 {
	    		System.out.print(x1.getCellData("Sheet1", r, c)+" ");
	    		 
	    		 
	    	 }System.out.println();
	     }

	}

}
