package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeoplePageObject {
	private WebDriver driver;

	public PeoplePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public PeoplePageObject conectarGente() {
		int count=0;
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//button[starts-with(@aria-label, 'Conecta con')]"));		
		System.out.println(allOptions.size());
		    for ( WebElement button: allOptions)
		{
			System.out.println(button.getText());
			count=count+1;
		}
		    System.out.println(count);
		
		return new PeoplePageObject(driver);
}
	
}
