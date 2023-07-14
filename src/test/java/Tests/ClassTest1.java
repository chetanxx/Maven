package Tests;

import org.testng.annotations.Test;

public class ClassTest1 {


	@Test(enabled=false) 
	public void Aftermethod() {
     System.out.println("Aftermethod");
	}
	@Test
	public void Aftermethod2() {
	     System.out.println("Aftermethod2");
	}
	@Test
	public void Aftermethod3() {
	     System.out.println("Aftermethod3");
	}
	@Test
	public void Aftermethod4() {
	     System.out.println("Aftermethod4");
	}
	@Test
	public void Aftermethod5() {
	     System.out.println("Aftermethod5");
	}

}
