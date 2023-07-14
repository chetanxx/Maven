package InstagramTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InstagramLogin extends DriverClass {
	
	public static  By by_login =By.xpath("//input[@aria-label='Phone number, username, or email']");
	
	public static By by_password = By.xpath("//input[@aria-label='Password']");
	
	public static By by_submit = By.xpath("//button[@class='_acan _acap _acas _aj1-']");
	
	public static By by_logo = By.xpath("//i[@aria-label='Instagram']");
	
	public static By by_homepage = By.xpath("//span[text()='Home']");
	
	public static By by_invalidusername = By.xpath("//p[text()='Sorry, your password was incorrect. Please double-check your password.']");
	
	public static  By by_NotNow = By.xpath("//button[text()='Not Now']");
	
	public static By by_more = By.xpath("//span[text()='More']");
	
	public static By by_logout = By.xpath("//*[@id=\"mount_0_0_VZ\"]/div/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div[6]/div[1]");
	
	public static WebElement web_logout() {
		WebElement  web_logout = driver.findElement(by_logout);
		return web_logout;
	}
	
	public static WebElement web_More() {
		WebElement  web_More = driver.findElement(by_more);
		return web_More;
	}
	
	public static WebElement  web_NotNow() {
		WebElement  web_NotNow = driver.findElement(by_NotNow);
		return web_NotNow;
	}
	 
	
	public static WebElement web_invalidUsername() {
		WebElement  web_invalidUsername = driver.findElement(by_invalidusername);
		return web_invalidUsername;
	}
	public static WebElement web_Login() {
		WebElement  web_Login = driver.findElement(by_login);
		return web_Login;
		
	}
	
	public static WebElement web_password() {
		WebElement  web_password = driver.findElement(by_password);
		return web_password;
		
	}
	public static WebElement web_submit() {
		WebElement  web_submit = driver.findElement(by_submit);
		return web_submit;
		
	}
	
	public static WebElement web_homepage() {
		WebElement  web_homepage = driver.findElement(by_homepage);
		return web_homepage;
		
	}
	
	public static WebElement web_logo() {
		WebElement  web_logo = driver.findElement(by_logo);
		return web_logo;
		
	}
	
	public static void sendlogin(String username) {
		web_Login().sendKeys(username);
	}

	public static void sendpassword(String password) {
		web_password().sendKeys(password);
	}

	public static void clickNotNow() {
		web_NotNow().click();
	}

	public static void sendsubmit() {
		web_submit().click();
	}  
	
	public static void ClickMore() {
		web_More().click();
	}

	
}
