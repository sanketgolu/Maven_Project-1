package com.abc.Orangehrm;


	import org.openqa.selenium.devtools.v85.browser.Browser;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;
	import com.relevantcodes.extentreports.LogStatus;

import common_functionality.BrowserLaunch;
import common_functionality.ReadExcel;
import common_functionality.Reporter;
import orangehrm.Dashboard;
import orangehrm.LoginPage;

	public class LoginPageTest1 extends ReadExcel {

		static ExtentTest test;
		static ExtentReports report;
		
			
		@BeforeClass(alwaysRun=true)	
	    public void startTest()
	    {
			report=new ExtentReports("Result/Result.html",true);
	    }
			
		
		@Test(description="Verify that user is unable to login successfully with invalid credential")
		public void TC1()  {
			//test=report.startTest("Verify that user is unable to login successfully with invalid credential");
			Reporter.startTest("Verify that user is unable to login successfully with invalid credential");
			LoginPage loginpage=new LoginPage(driver);	
			//loginpage.Login("Adimn12", "admin12345");
			loginpage.Login(ReadExcel.getStringCellData("Tc2", "Username"), ReadExcel.getStringCellData("Tc2", "Password") );
			
			if(loginpage.getinvalidMessageLabel().size()>0) {
				//test.log(LogStatus.PASS,"User is not able to login in system");
				Reporter.PassTest("User is not able to login in system");
			}else {
				//test.log(LogStatus.FAIL,"User is able to login with invalid credential");
				Reporter.Failed_Test("User is able to login with invalid credential");
			}
		}
		
		@Test(description="Verify that user is unable to login successfully with invalid Username and valid Password ")
		public void TC2() {
			test=report.startTest("Verify that user is unable to login successfully with invalid Username and valid Password");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.Login("Admin123", "admin123");
			
			if(loginpage.getinvalidMessageLabel().size()>0) {
				//test.log(LogStatus.PASS, "User is not able to login in system");
				Reporter.PassTest("User is not able to login in system");
			}else {
				//test.log(LogStatus.FAIL, "User is able to login with invalid credential");
				Reporter.Failed_Test("User is able to login with invalid credential");
			}
		}
		
		
		@Test(description="Verify that user is unable to login successfully with valid Username and invalid Password")
		public void TC3() {
			test=report.startTest("Verify that user is unable to login successfully with valid Username and invalid Password");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.Login("Admin", "admin12345");
		
			if(loginpage.getinvalidMessageLabel().size()>0) {
				//test.log(LogStatus.PASS, "User is not able to login in system");
				Reporter.PassTest("User is not able to login in system");
			}else {
				//test.log(LogStatus.FAIL, "User is able to login with invalid credential");
				Reporter.Failed_Test("User is able to login with invalid credential");
		}
		}
		@Test(description="Verify that user is able to login successfully with valid credential ")
		public void TC4()  {
			test=report.startTest("Verify that user is able to login successfully with valid credential");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.Login("Admin", "admin123");
			
			Dashboard dashbordpage=new Dashboard(driver);
			if(dashbordpage.getDashboardLabel().size()>0) {
				//test.log(LogStatus.PASS,"User is able to login successfully");
				Reporter.PassTest("User is able to login successfully");
				
			}else {
				//test.log(LogStatus.FAIL,"User is not able to login successfully");
				Reporter.Failed_Test("User is not able to login successfullyl");
			}
		}
		
		
		@AfterClass(alwaysRun=true)
		public void EndTest() {
			report.endTest(test);
			report.flush();
		}
		
	}

