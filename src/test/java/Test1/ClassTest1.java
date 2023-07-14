package Test1;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class ClassTest1 {


	@Test(priority = 3)
	public void M1 () {
     System.out.println("m1");
	}
	@BeforeMethod 
	public void M2() {
	     System.out.println("m2");
	}
	@AfterMethod
	public void M3() {
	     System.out.println("m3");
	}
	@Test(priority = 1)
	public void M4() {
	     System.out.println("m4");
	}
	@Test(priority = 2)
	public void M5() {
	     System.out.println("m5");
	}

}
