package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
        WebElement e2= driver.findElement(By.tagName("table"));
                
     boolean b =driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]/td[4]")).isDisplayed();
     System.out.println(b); /*by using isDisplayed*/
     
      String s=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]/td[4]")).getText();
      String originalvalve="405.5";
      if(s.equals(originalvalve)) {
    	  System.out.println("the corresponding valve is present");
      }
      else {
    	  System.out.println("the valve is not present");
      }
       
	}

}
		
