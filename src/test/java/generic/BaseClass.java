package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  abstract class BaseClass {
	
	public void readFromExcel()
	{
		String currentPath = System.getProperty("user.dir");
		currentPath = currentPath + "\\src\\test\\java\\data\\";
		 File file = new File(currentPath +"xyz.xlsx");
		 try {
			FileInputStream fis = new FileInputStream(file);
			try {
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet= wb.getSheetAt(0);
				XSSFRow  row= sheet.getRow(0);
			    XSSFCell cell= row.getCell(1);	
			    wb.close();
			    fis.close();
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
   public void writeFromExcel(String sheetName,String fileName)
   {
	   XSSFWorkbook wb= new XSSFWorkbook(); 
	   XSSFSheet sheet =wb.createSheet(sheetName);
	   
	   for(int i=0;i<=10;i++) {
		   
		   XSSFRow  row=sheet.createRow(i);
		   XSSFCell cell= row.createCell(1);  
		   cell.setCellValue("Ana");
	

   }

	   String currentPath = System.getProperty("user.dir");
	   currentPath = currentPath + "\\src\\test\\java\\data\\";
	   File file = new File(currentPath +fileName);
	   
	   try {
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
	
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	   } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
	   
   }
   
   
}
