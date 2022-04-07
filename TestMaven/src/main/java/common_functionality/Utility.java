package common_functionality;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


	public class Utility extends Reporter {
		
		
		public static String captureScreen()  {
			//Convert web driver object to TakeScreenshot
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	        TakesScreenshot scrShot =((TakesScreenshot)driver);
	        //Call getScreenshotAs method to create image file
	         File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	          String destinationpath=filepath+"/"+dateName+".png";
	          System.out.println("filepath"+ filepath);
	          System.out.println("destinationpath" + destinationpath);
	          File DestFile=new File(destinationpath);
	          try {
	        	  FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          return dateName+".png";

		}

	}
