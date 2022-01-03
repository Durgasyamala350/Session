package Session.persistent.maven;
import java.io.*;
import java.util.*;

import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
	public static void main(String[] args) throws IOException{
		try{
		File file=new File("D:/JavaData.xlsx");
		if(!file.exists()){
			System.out.println("not exists");
			throw new FileNotFoundException("file doesnt exists");
		}
		FileInputStream fl = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fl);
		Sheet sh = wb.getSheetAt(0);
		
		

		Iterator<Row> iterator=sh.iterator();
		while(iterator.hasNext()){
			Row row=iterator.next();
			Iterator<Cell> cellIterator=row.iterator();
			
		    while(cellIterator.hasNext()){
		    	Cell cell=cellIterator.next();
		    if(cell.getCellTypeEnum()==CellType.STRING){
		    	System.out.println(cell.getStringCellValue());
		    }
		    else if(cell.getCellTypeEnum()==CellType.NUMERIC){
		    	System.out.println(cell.getNumericCellValue());
		    }
	 		
		    }
		    System.out.println();
		   
		}
		
		}
		
		
		
		catch(Exception e){
			e.printStackTrace();
		}
		 

	
	}
	
}
		
		
		
		
//		FileInputStream fl = new FileInputStream(file);
//		Workbook wb = new XSSFWorkbook(fl);
//		Sheet sh = wb.getSheetAt(0);
//		int i=0;
//		Iterator<Row> rows = sh.iterator();
//		List<Product> productTest = new ArrayList<>();
//
//		while(rows.hasNext())
//		{
//		if(i==0)
//		{
//		rows.next();
//		}
//		else
//		{
//		Row currentRow = rows.next();
//		ProductOrder p = new ProductOrder(((Object) currentRow.getCell(0)).getNumericCellValue(),
//		                                 currentRow.getCell(1).getStringCellValue(),
//		                                 currentRow.getCell(2).getdoubleCellValue(),
//	                                 	currentRow.getCell(3).getdoubleCellValue(),
//		                                  currentRow.getCell(4).getdoubleCellValue());
//		productTest.add(p);
//		}
//		i++;
//		}
//
//		System.out.println(productTest);
//		fl.close();
//		
//		}
//}
//}

