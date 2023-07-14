package InstagramTest;

import org.openqa.selenium.WebElement;

public class InstagramValidation {


	
	public static void validatelogo(WebElement logo) throws Exception {
		
		if (logo.isDisplayed()) {
			
			  System.out.println("The login page is displayed");
			
			
		} else {
			  System.out.println("The login page is not displayed");
		}
	}
	
	public static void validateusername(String username) {
		if (username.equals(InstagramLogin.web_Login().getAttribute("value"))) {
			System.out.println("Username is Entered successfully");
		}else {
			System.out.println("Username is  not Entered ");
		}
	}
	
	public static void validatepassword(String password) {
		if (password.equals(InstagramLogin.web_password().getAttribute("value"))) {
			System.out.println("password is Entered successfully");
		}else {
			System.out.println("password is  not Entered ");
		}
	}
	public static void validatehomepage(WebElement homepagelogo) {
		if (homepagelogo.isDisplayed()) {
			System.out.println("The Homepage is Displayed");
		} else {
			System.out.println("The Homepage is Not  Displayed");
		}
	}

	public static void validateInvalidUsername(WebElement web_homepage) {
		
		if (web_homepage.isDisplayed()) {
			System.out.println("Sorry, your username was incorrect. Please double-check your username.");
		} else {
			System.out.println("The Homepage is Not  Displayed");
		}
		
	}
	
	public static void Validatelogout(WebElement logout) {
		if (logout.isDisplayed()) {
			System.out.println("successfully clicked on More");
		} else {
			System.out.println("Not clicked on More");
		}
	}
	    
	
}
