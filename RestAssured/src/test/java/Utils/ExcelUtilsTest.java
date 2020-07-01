package Utils;

public class ExcelUtilsTest {
	
	public static void main(String[] args) {
		
		String excelpath="./data/TestData.xlsx";
		//if file is .xls then use that and modify in ExcelUtils.java
		String sheetName="Sheet1";
		
		ExcelUtils excel= new ExcelUtils(excelpath,sheetName);
		
		excel.getRowCount();
		excel.getCellData(1, 0);
		excel.getCellData(1, 1);
		excel.getCellData(1, 2);
	}

}
