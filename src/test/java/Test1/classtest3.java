package Test1;

import org.testng.annotations.Test;

public class classtest3 {

	@Test(groups="it_department") 
	public void Aftermethod() {
    System.out.println("classtest3 Aftermethod");
	}
	@Test(groups="it_department") 
	public void Aftermethod1classtest3() {
		System.out.println("classtest3 Aftermethod1");
	}
	@Test(groups="it_department") 
	public void Aftermethod2classtest3() {
		System.out.println("classtest3 Aftermethod2");
	}
	@Test
	public void Aftermethod3classtest3() {
		System.out.println("classtest3 Aftermethod3");
	}
	@Test(groups="it_department") 
	public void Aftermethod4classtest3() {
		System.out.println("classtest3 Aftermethod4");
	}

}
