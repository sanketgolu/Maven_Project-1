package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common_functionality.BrowserLaunch;

public class LoginPage  {



		WebDriver driver;
		
	  public LoginPage (WebDriver driver) {
		  this.driver=driver;
	  }
	  
	  public WebElement getUsernametxt() {
		  return driver.findElement(By.id("txtUsername"));
	  }

	  public WebElement getPasswordtxt() {
		  return driver.findElement(By.id("txtPassword"));
	  }

	public WebElement getLoginBtn() {
		return driver.findElement(By.id("btnLogin"));
	}

	public WebElement getinvalidMessageLabel() {
		return driver.findElement(By.xpath("//span[@id='spanMessage']"));
	}
	
	public void Login (String Username, String Password) {
		getUsernametxt ().sendKeys(Username);
		getPasswordtxt().sendKeys(Password);
		getLoginBtn().click();
	}
	
	  
	}

