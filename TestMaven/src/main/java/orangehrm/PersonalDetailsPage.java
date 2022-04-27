package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage {

	WebDriver driver;

	  public PersonalDetailsPage(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }
	//Edit Button method
	  
	public WebElement Edit_button () {
		return driver.findElement(By.id("btnSave"));
		
	}
	public WebElement My_Info () {
		
		return driver.findElement(By.xpath("//b[text()=\"My Info\"]"));
	}
	
	
	//FirstName Method
	public WebElement First_Name () {
		return driver.findElement(By.id("personal_txtEmpFirstName"));
	}
	// Middle Name Method
	public WebElement Middle_Name () {
		return driver.findElement(By.id("personal_txtEmpMiddleName"));
	}
	// Last Name Method
	public WebElement Last_Name () {
		return driver.findElement(By.id("personal_txtEmpLastName"));
	}
	//Empolyee Id Method
	public WebElement Empolyee_Id () {
		return driver.findElement(By.id("personal_txtEmployeeId"));	
	}
	//Other Id Method
	public WebElement Other_Id () {
		return driver.findElement(By.id("personal_txtOtherID"));
	}
	//DriverLiencens No method 
	public WebElement DriverLiecens_Id () {
		return driver.findElement(By.id("personal_txtLicenNo"));
	}
	//Liecences Exipery Date method
	public WebElement LiecencesExipery_Date () {
		return driver.findElement(By.id("personal_txtLicExpDate"));
	}
	//SSN NO. Method
	public WebElement SSN_No () {
		return driver.findElement(By.id("personal_txtNICNo"));
	}
	//SIN NI Method
	public WebElement SIN_No () {
		return driver.findElement(By.id("personal_txtSINNo"));
	}
	//RadioButton Male Method 
	public WebElement RadioButton_Male () {
		return driver.findElement(By.id("personal_optGender_1"));
	}
	//RadioButton Female Method 
	public WebElement RadioButton_Female () {
		return driver.findElement(By.id("personal_optGender_2"));
	}
	//Martial Status Method
	public WebElement Marital_Status () {
		return driver.findElement(By.id("personal_cmbMarital"));
	}
	// Nationality Method
	public WebElement Nationality () {
		return driver.findElement(By.id("personal_cmbNation"));
	}
	//Date of Birth 
	public WebElement Date_of_Birth () {
		return driver.findElement(By.id("personal_DOB"));
	}
	//NickName 
	public WebElement Nick_Name () {
			return driver.findElement(By.id("personal_txtEmpNickName"));
	}
	//MiltaryServices
	public WebElement Miltary_Services () {
			return driver.findElement(By.id("personal_txtMilitarySer"));
	}
	//Smoker
	public WebElement Smoker () {
	return driver.findElement(By.id("personal_chkSmokeFlag"));
	}
	
	public void Personal_DetailButton (String First_Name,String Last_Name ) {
		My_Info().click();
		Edit_button().click();
		First_Name().sendKeys(First_Name);
		Last_Name().sendKeys(Last_Name);
		Edit_button().click();
		
	    
		
	}
	
}
