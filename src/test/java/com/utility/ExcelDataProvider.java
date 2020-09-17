package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataProvider {
	HSSFWorkbook wb;

	public ExcelDataProvider() {
		File src = new File("./Testdata/Datafile.xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new HSSFWorkbook(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("unable to read excel file" + e.getMessage());
		}

	}

	public String getStringData(int sheetIndex, int row, int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();

	}

	public String getStringData(String sheetname, int row, int column) {
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}

	public double getNumericData(String sheetname, int row, int column) {
		return wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
	}

}
