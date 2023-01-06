package ai.DS.apps.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import ai.DS.apps.Testbase.TestBase;

public class Utilclass extends TestBase{
	
   public Utilclass() {
	   PageFactory.initElements(driver, this);   
   }
   
   public static void Screenshot(String filename) throws IOException {
	   
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   
	   File source =ts.getScreenshotAs(OutputType.FILE);
	   
	   String path="D:\\java\\com.dalalstreet1\\Screenshots\\";
	   
	   File destination = new File(path + filename + ".png");
	   
	   FileHandler.copy(source, destination);
   }
}
