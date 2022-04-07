package common_functionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

//We are developing framework----Skeleton
public class BrowserLaunch {

	
	public static WebDriver driver;
	public static Properties property;
	public static ExtentReports report;
	public static ExtentTest test;
	public static String filepath;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
@BeforeSuite
	public void Browser_Initilisation() {
		ReadProperty();
		String Browsername=property.getProperty("Browsername");
		if(Browsername.equalsIgnoreCase("chrome")) //CH
		{	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
			
		} else if(Browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "path");
				driver=new FirefoxDriver();
		} else {
		System.setProperty("webdriver.edge.driver", "");
		driver=new EdgeDriver();
		
	}
		driver.get(property.getProperty("Url"));
	
}
	
	public static void ReadProperty() {
		try {
		property=new Properties();
		property.load(new FileInputStream("src/main/resources/config.properties"));
		} catch(FileNotFoundException e) {
		
	} catch (IOException t) {
		
	}
		
	}
	@AfterSuite
	public void Broweser_close () {
		driver.quit();
	}
	
	
	
	
	
}