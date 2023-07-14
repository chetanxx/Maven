package assignment;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProvider1 
{
	@DataProvider(name="name1")
	public static Object[][] name() throws IOException
	{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\cheta\\Desktop\\Excel\\RollNo.xlsx");
		XSSFWorkbook Wb=new XSSFWorkbook(fis);
		
		XSSFSheet Ws=Wb.getSheetAt(0);
		int row=Ws.getLastRowNum();
		int column=Ws.getRow(0).getLastCellNum();

		Object[][] arr= new Object[row+1][column];
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=Ws.getRow(i).getCell(j);
			}
		}
		return arr;

	}

}
