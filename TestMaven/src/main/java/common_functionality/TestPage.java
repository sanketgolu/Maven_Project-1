package common_functionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage {

	@FindBy(id="")
	WebElement username;
	
	
	public TestPage() {
		PageFactory.initElements(BrowserLaunch.driver, this);
	}
}
