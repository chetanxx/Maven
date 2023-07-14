package assignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.testng.annotations.Test;

public class Data_Driven_Using_Excel 
{
	@Test(dataProvider="name1",dataProviderClass=assignment.DataProvider1.class)
	public static void Data(XSSFCell Name,XSSFCell No)
	{
		System.out.println(Name+" "+No);
	}

}
