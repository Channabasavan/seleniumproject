package seleniumpackagenew;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotExample {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File src =ts.getScreenshotAs(OutputType.FILE);
		  String s2=System.getProperty("user.dir"+"/jj/"+"pictures"+".jpg");
		  File f=new File(s2);
		  FileUtils.copyFile(src,f);  
	}

}
