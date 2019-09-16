package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Column;

public class SetDataInExcel {

	public static void main(String[] args) throws Exception
	{
		String path="D:\\automationrepo\\automationrepository\\basiccorejava\\src\\filehandling\\TestData.xls";
    FileInputStream file=new FileInputStream(path);
	HSSFWorkbook wb= new HSSFWorkbook(file);
	HSSFSheet sheet=wb.getSheet("Sheet1");
    HSSFRow row= sheet.getRow(0);
    HSSFRow col= sheet.getRow(1);
    
    HSSFCell cell=row.getCell(0);
    HSSFCell cell2=col.getCell(0);
    cell.setCellValue("Shital");
    cell.setCellValue("Shital@123");
    
    FileOutputStream fileout=new FileOutputStream(path);
    wb.write(fileout);
	{
		

	}

}
} 
