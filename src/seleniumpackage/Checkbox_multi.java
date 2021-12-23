package seleniumpackage;
	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	 
	public class Checkbox_multi {
	 
	   public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe ");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("E:\\Selenium class\\Programs\\Sonali\\bin\\project1\\check.html");
	         
	   List<WebElement> AllCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    System.out.println("Number of Check boxes : "+ Integer.toString(AllCheckBoxes.size()));
	         
	    for(WebElement cb:AllCheckBoxes)
	    {
	        cb.click();
	    }
	    System.out.println("All check boxes have been checked");
	      }
	}