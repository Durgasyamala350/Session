package Session.persistent.maven;


import java.io.*;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CalculateTotalAmountExcel {
     public static void main(String[] args) {
    
		
	
//	FileOutputStream fout=new FileOutputStream("order.xlsx");
	XSSFWorkbook wb1=new XSSFWorkbook();
	XSSFSheet sheet=wb1.createSheet("ProductOrder");
	Row header=sheet.createRow(0);
	  header.createCell(0).setCellValue("OrderId");
	  header.createCell(1).setCellValue("Customer Name");
	  header.createCell(2).setCellValue("Item1");
	  header.createCell(3).setCellValue("Item2");
	  header.createCell(4).setCellValue("Item3");
	  header.createCell(5).setCellValue("Total Amount");
	Map<Integer,Object[]> po = getProductOrderMap(loadStaticData());
    Set<Integer> keys = po.keySet();
    int rowNo = 1;
    for (Integer key : keys) 
    {
       
        Row row = sheet.createRow(rowNo++);
        Object[] objData = po.get(key);

        int cellNo = 0;
        for (Object obj : objData) 
        {
            Cell cell = row.createCell(cellNo++);

            if (obj instanceof String)
                cell.setCellValue((String) obj);
            else if (obj instanceof Integer)
                cell.setCellValue((Integer) obj);
            else if (obj instanceof Double)
                cell.setCellValue((Double) obj);
        }
    }
    

     
    try
    {
    	 File fileRef = new File("C:\\users\\ganesh\\order.xlsx");
         if(!fileRef.exists())
             fileRef.createNewFile();
          FileOutputStream outputStream = new FileOutputStream(fileRef);
        wb1.write(outputStream);
        outputStream.close();
        System.out.println("Excel file with data generated successfully");
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
     }
      
	 public static Set<ProductOrder> loadStaticData()
	    {
	        Set<ProductOrder> po = new HashSet<ProductOrder>();
	        po.add(new ProductOrder(1,"A",100,200,100));
	        po.add(new ProductOrder(2,"B",700,50,200));
	       
	       
	        
	        return po;
	    }
	 public static Map<Integer,Object[]> getProductOrderMap(Set<ProductOrder> data)
	    {
	        final Map<Integer,Object[]> map = new HashMap<Integer,Object[]>();
	        if(Objects.nonNull(data))
	        {
	            data.forEach(obj->{
	                map.put(obj.getOrderId(),new Object[]{obj.getOrderId(),obj.getCustomerName(),obj.getItem1(),obj.getItem2(),obj.getItem3()});
	            });
	        }

	        return map;
	    }

	  
     
	
     }
