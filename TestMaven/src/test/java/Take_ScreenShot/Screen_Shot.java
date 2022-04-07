package Take_ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {
	private static final TakesScreenshot TakesScreenshot = null;
	private static final int FILE = 0;
	private static final int OutputType = 0;
	public static WebDriver driver;
     
       @org.testng.annotations.Test
      public void Test () {
    	   System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
 	      //We need to create the object of browser drive to launch on it.
    	   driver=new ChromeDriver();
 	      driver.get("www.google.com");
 	      //driver.manage().window().maximize();
 	     TakesScreenshot scrshot = ((TakesScreenshot) driver);
 	    File SrcFile= scrshot.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
 	      File destination = new File ("Result\\Result.html");
 	      try {
 	      FileUtils.copyFile(SrcFile,destination);
 	      }catch (IOException e ) {
 	    	e.printStackTrace();
 	      }
    }
}
