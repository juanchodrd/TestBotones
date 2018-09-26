package botones;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobject.LoginPageObject;


public class TestConectar {
	private WebDriver driver;
	LoginPageObject loginPage;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\950794\\AppData\\Local\\Mozilla Firefox\\geckodriver32.exe");
		FirefoxOptions options = new FirefoxOptions ();
		//options.setCapability("marionette",true);
		options.setBinary("C:\\Users\\950794\\AppData\\Local\\Mozilla Firefox\\firefox.exe"); 
		driver = new FirefoxDriver(options); 
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://ar.linkedin.com/");
	}
	
	
	@Test
	public void conectarGentee() {
		loginPage = new LoginPageObject(driver);
		loginPage
		.login("juantognoli@gmail.com", "legacy32")
		.goToPeoplePage()
		.conectarGente();
	}
				
	
	@After
	public void tearDown() {
		//driver.quit();
	}

}