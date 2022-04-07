package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {

	WebDriver driver;
	
	public Dashboard(WebDriver driver ) {
		this.driver=driver;
	}
	
	public WebElement getDashboardLabel() {
		return driver.findElement(By.tagName("h1"));
	}

}


