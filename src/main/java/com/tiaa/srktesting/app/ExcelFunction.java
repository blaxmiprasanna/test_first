package com.tiaa.srktesting.app;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunction {

	XSSFWorkbook WB;
	XSSFSheet SH1;
	int rowCount;

	public String ExcelFun(String excelPath, int sheetNo, int rowValue, int cellValue) {

		try {
			System.out.println(excelPath);
			File file = new File(excelPath);
			FileInputStream FS = new FileInputStream(file);
			WB = new XSSFWorkbook(FS);
			XSSFSheet SH1 = WB.getSheetAt(sheetNo);
			rowCount = SH1.getLastRowNum();
			// for (int i = 0; i < rowCount + 1; i++) {
			// System.out.println(SH1.getRow(rowValue).getCell(cellValue).getStringCellValue());
			// System.out.println(SH1.getRow(rowValue).getCell(cellValue).getStringCellValue());
			// }

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// return excelPath;
		return null;
	}

}
