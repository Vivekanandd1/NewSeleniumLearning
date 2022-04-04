package _1_RahulShettyClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _22_ExcelDataDrivenTests {
	
	public ArrayList<String> getdata(String Testdata) throws IOException {
		ArrayList<String> a = new ArrayList<>();
	    FileInputStream fis = new FileInputStream("src//test//resources//TestData.xlsx");
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    int sheets = wb.getNumberOfSheets();
	    for(int i=0;i<sheets;i++) {
	    	if(wb.getSheetName(i).equalsIgnoreCase("Sheet1")) {
	    		XSSFSheet sheet = wb.getSheetAt(i);
	    		Iterator<Row> rows = sheet.iterator();
	    		 Row firstrow = rows.next();
	    		 Iterator<Cell> ce = firstrow.cellIterator();
	    		 int k = 0;
					int coloumn = 0;
					while(ce.hasNext()) {
						Cell value  = ce.next();
						if(value.getStringCellValue().equalsIgnoreCase("Testing")) {
							coloumn=k;
						}
						k++;
					}
					while(rows.hasNext()) {
					Row r =	rows.next();
					if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(Testdata)) {
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							a.add(cv.next().getStringCellValue());
					}
					}
	    	}
	    }
		
		
	}
	    return a;
	}
	public static void main(String[] args) throws IOException {
		_22_ExcelDataDrivenTests Data = new _22_ExcelDataDrivenTests();
		ArrayList<String> dc =  Data.getdata("virtual");
		System.out.println(dc.get(0));
		System.out.println(dc.get(1));
		System.out.println(dc.get(2));
		System.out.println(dc.get(3));
	
	}

}
