package pageobject;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObject {
	private WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public PeoplePageObject goToPeoplePage() {
		driver.get("https://www.linkedin.com/search/results/people/v2/?origin=DISCOVER_FROM_SEARCH_HOME");		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//scroll222222
		jse.executeScript("window.scrollBy(0,250)", "");
		jse.executeScript("window.scrollBy(0,250)", "");
		jse.executeScript("window.scrollBy(0,250)", "");
		jse.executeScript("window.scrollBy(0,250)", "");		
		return new PeoplePageObject(driver);
}
		
	
}
