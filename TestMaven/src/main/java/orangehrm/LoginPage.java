package orangehrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement Loginbtn;
	
	@FindBy(xpath="//span[@id='spanMessage']")
	List<WebElement> label;
	
	
	
	
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public WebElement getUsernametxt() {
	 // return driver.findElement(By.id("txtUsername"));
	  return username;
  }

  public WebElement getPasswordtxt() {
	  return password;
  }

public WebElement getLoginBtn() {
	return Loginbtn;
}

public List<WebElement> getinvalidMessageLabel() {
	return label;
}


public void Login(String username,String password) {
	getUsernametxt().sendKeys(username);
	getPasswordtxt().sendKeys(password);
	getLoginBtn().click();
}

//
public void ForgotPassword() {
	
}
  
}
