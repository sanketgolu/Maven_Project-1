package common_functionality;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConditions extends BrowserLaunch {
	
	public static FluentWait<WebDriver> wait;
	
	public WaitConditions() {
			wait=new WebDriverWait(driver, 10)
				.ignoring(TimeoutException.class, NoSuchElementException.class);
		
	}
	
	public void IsDisplay(final WebElement element) {
		wait.until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver input) {
				// TODO Auto-generated method stub
				return element.isDisplayed();
			}
		});
	}
	
	public void WaitForClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public boolean WaitForNavigation(String url) {
		return wait.until(ExpectedConditions.urlContains(url));
	}
	
	public WebElement isVisible(WebElement webElement, WebDriver driver) {
	       return wait.until(ExpectedConditions.visibilityOf(webElement));
	   
	}
}

