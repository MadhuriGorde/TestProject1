package Utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	//static and class variables and can be referred in any function
	static XSSFWorkbook workbook;
	//for .xls static HSSFWorkbook workbook;
	static XSSFSheet sheet;
	//for .xls static HSSFSheet sheet;
	
	//constructor
	public ExcelUtils(String excelPath, String sheetName)
	{
		try{
			//InputStream file= new InputStream(excelPath);
			//workbook= new HSSFWorkbook(new POIFSFileSystem(file));
			//for .xls workbook= new HSSFWorkbook(excelPath);
			workbook= new XSSFWorkbook(excelPath);
		    sheet= workbook.getSheet(sheetName);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/*public static void main(String[] args) {
		getRowCount();
		getCellData();
	}
	*/
	
	
	public static void getCellData(int rowNum, int colNum){
		
		try {
			//added into the constructor
			/*String excelPath="./data/TestData.xlsx";
			XSSFWorkbook workbook= workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet= workbook.getSheet("Sheet1");*/
			//index starts with 0 and to get the first row value in the sheet
			//String value= sheet.getRow(1).getCell(0).getStringCellValue();//returns Graham
			
			//to avoid decimal value
			DataFormatter formatter=new DataFormatter();
			Object value= formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			System.out.println(value);
			
			//returns subjectId with decimal value 1.0
			//double value1= sheet.getRow(1).getCell(2).getNumericCellValue();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	public static void getRowCount() {
		
			
		/*String projDir=System.getProperty("user.dir");
		System.out.println(projDir);
		String excelPath=projDir+"/data/TestData.xlsx";
		*/
		
		/*String excelPath="./data/TestData.xlsx";
		
			XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
			XSSFSheet sheet= workbook.getSheet("Sheet1");*/
			int rowCount= sheet.getPhysicalNumberOfRows();
			System.out.println("No.of rows: "+rowCount);
			
	}
	
	
}
