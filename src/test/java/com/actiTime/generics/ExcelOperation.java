package com.actiTime.generics;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {
	public static int getRowCount(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//test data//userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		return w1.getSheet(sheetName).getPhysicalNumberOfRows();
	}
	public static int getCellCount(String sheetName,int rowNumber) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//test data//userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		return w1.getSheet(sheetName).getRow(rowNumber).getPhysicalNumberOfCells();
	}
	public static String readData(String sheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//test data//userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
	  Cell c=w1.getSheet(sheetName).getRow(rowNumber).createCell(cellNumber);
		DataFormatter rv=new DataFormatter();
		String s=rv.formatCellValue(c);
		return s;
	}
	public static void writeData(String sheetName,int rowNumber,int cellNumber,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//test data//userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		w1.getSheet(sheetName).getRow(rowNumber).createCell(cellNumber).setCellValue(data);
	}

}
