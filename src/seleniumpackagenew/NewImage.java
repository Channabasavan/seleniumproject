package seleniumpackagenew;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewImage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 TakesScreenshot ts= (TakesScreenshot)driver;
		 File f=ts.getScreenshotAs(OutputType.FILE);
		 String s=System.getProperty("user.dir")+"/channa/"+"java"+".jpg";
		 File ft=new File(s);
		 FileUtils.copyFile(f,ft);
	}

}
