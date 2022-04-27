package orangehrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	
	WebDriver driver;
	
	public Dashboard(WebDriver driver ) {
		this.driver=driver;
	}
	
	public List<WebElement> getDashboardLabel() {
		return driver.findElements(By.tagName("h1"));
	}

}


