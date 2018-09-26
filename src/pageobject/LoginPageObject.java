package pageobject;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
	private WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePageObject login(String user, String pass) {
		driver.findElement(By.name("session_key")).sendKeys(user);
		driver.findElement(By.name("session_password")).sendKeys(pass);
		driver.findElement(By.id("login-submit")).click();
		return new HomePageObject(driver);		
	}
}
