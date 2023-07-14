package datadriventEST;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test {

	
	@Test(dataProvider="DN")
	public static void m1(String name,int age) {
		System.out.println("org.testng.annotations.datadriventEST.test.name====>"+name+"age=====>"+age);
	}
	
	@DataProvider(name="DN")
	public Object[][]   objext(){
		Object[][] a= new Object[3][1] ;
		a[0][0]="shaik";
		a[1][0]="Ztoh";
		a[2][0]="Attapur";
		return a;
		
	}
}
