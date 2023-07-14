package InstagramTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Test extends DriverClass{

	@BeforeMethod(groups={"kavi"})
	public static void openloginpage() throws Exception {
		DriverClass.WebDriver();
		InstagramValidation.validatelogo(InstagramLogin.web_logo());
  }
	
	@org.testng.annotations.Test(groups="kavi")
	public static void logincredentials() {
		InstagramLogin.sendlogin("robotonfirexc");
		InstagramLogin.sendpassword("Chetan@007");
		InstagramValidation.validateusername("robotonfirexc");
		InstagramValidation.validatepassword("Chetan@007");
		InstagramLogin.sendsubmit();
		InstagramValidation.validatehomepage(InstagramLogin.web_homepage());
	
	    InstagramLogin.ClickMore();
	    InstagramValidation.Validatelogout(InstagramLogin.web_logout());
	    
		
	}
	@AfterMethod(groups={"kavi"})
	public static void quit() {
		driver.quit();
	}
	

	public static void InvalidusernamePassword() throws Exception {
		openloginpage();
		InstagramLogin.sendlogin("robotonfirexc1");
		InstagramLogin.sendpassword("Chetan@007");
		InstagramValidation.validateusername("robotonfirexc");
		InstagramValidation.validatepassword("Chetan@007");
		InstagramLogin.sendsubmit();
		InstagramValidation.validateInvalidUsername(InstagramLogin.web_invalidUsername());
	}
	
}
