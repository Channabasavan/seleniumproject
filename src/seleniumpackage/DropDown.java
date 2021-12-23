package seleniumpackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		String page_title= driver.getTitle();
		driver.manage().window().maximize();
		WebDriverWait wx=new WebDriverWait(driver,10);
		WebElement e2=wx.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[9]/div/select")));
	    Select se=new Select(e2);
	    se.selectByIndex(0);
	    se.selectByValue("Alaska");
	    List storeEle=new ArrayList();
	    List<WebElement> w2=se.getOptions();
	    for(WebElement e:w2) {
	    	storeEle.add(e.getText());
	    }
	    
		System.out.println(storeEle);
	}
}
