package com.abc.Orangehrm;

import org.testng.annotations.Test;

import common_functionality.ReadExcel;
import common_functionality.Reporter;
import orangehrm.LoginPage;
import orangehrm.PersonalDetailsPage;

public class Peronal_DetailsTest extends ReadExcel {
	
	
	@Test
	public void TC1() {
		Reporter.startTest("Verify Personal Details save succesfully");
		LoginPage login = new LoginPage(driver);
		login.Login("Admin", "admin123");
		PersonalDetailsPage Details = new PersonalDetailsPage(driver);
		Details.Personal_DetailButton(ReadExcel.getStringCellData("TC1", "firstname"), ReadExcel.getStringCellData("TC1", "lastname"));
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
