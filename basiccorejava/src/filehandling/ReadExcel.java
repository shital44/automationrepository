package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel
{

	public static void main(String[] args) throws Exception
	{
		String path="D:\\automationrepo\\automationrepository\\basiccorejava\\src\\filehandling\\TestData.xls";
    FileInputStream file=new FileInputStream(path);
	HSSFWorkbook wb= new HSSFWorkbook(file);
	HSSFSheet sheet=wb.getSheet("Sheet1");
    HSSFRow row= sheet.getRow(0);
    
    HSSFCell cell=row.getCell(0);
    String data=cell.getStringCellValue();
    System.out.println(data);
    
	// ReadExcel ab=test();
	}
   
	
	
	
	public static ReadExcel test()
    {
    	return new ReadExcel();
    }
}
  