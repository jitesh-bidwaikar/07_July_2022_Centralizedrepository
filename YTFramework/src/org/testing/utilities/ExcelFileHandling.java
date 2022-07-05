package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFileHandling 
{
	public static void ReadDataofanRow(int row) throws BiffException, IOException 
		{
			File f= new File ("../FileAssignments/Datafile.xls");
			Workbook wb= Workbook.getWorkbook(f);
			Sheet ws=wb.getSheet(0);
			int r=ws.getRows();
			int c=ws.getColumns();
			for (int i=0;i<=r;i++) 
		{
			if (i==row) 
			{
				for (int j=0;j<c;j++) 
				{
					Cell ce=ws.getCell(j,i);
					System.out.println(ce.getContents());
				}
			}
		}
	
	}
	
	public static void ReadDataofaparticularcell(int co, int ro) throws IOException, BiffException 
		{
			File f= new File ("../FileAssignments/Datafile.xls");
			Workbook wb= Workbook.getWorkbook(f);
			Sheet ws=wb.getSheet(0);
			Cell ce=ws.getCell(co, ro);
			System.out.println(ce.getContents());
		}
	
	public static void ReadDatafromRange(int initial, int end) throws BiffException, IOException 
		{
			File f= new File ("../FileAssignments/Datafile.xls");
			Workbook wb= Workbook.getWorkbook(f);
			Sheet ws=wb.getSheet(0);
			int r=ws.getRows();
			int c=ws.getColumns();
			for (int i=0;i<=r;i++) 
		{
			if (i>=initial && i<=end) 
			{
				for (int j=0;j<c;j++) 
				{
					Cell ce=ws.getCell(j,i);
					System.out.println(ce.getContents());
				}
			}
		}
	
	}
}

