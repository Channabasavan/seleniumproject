package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Openchromebrowser {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String page_title= driver.getTitle();
		System.out.println("the page title is:"+page_title);
		System.out.println("browser opned");
		driver.manage().window().maximize();
//		id & name locator Test
//	    WebElement inputbox=driver.findElement(By.id("search_query_top"));
//	    inputbox.sendKeys("T-shirts");
//		WebElement search=driver.findElement(By.name("submit_search"));
//		search.click();
////		linkTest
//		WebElement linksearch=driver.findElement(By.linkText("Faded Short Sleeve T-shirts"));
////		driver.findElement(By.partialLinkText("Printed chiffon Dress"));
//		linksearch.click();
//		classname as a locator
	  int slidernumber  =driver.findElements(By.className("homeslider-container")).size();
	  System.out.println("the slide number:"+slidernumber);
//		tag name as a locator
	  int links= driver.findElements(By.tagName("a")).size();
	  System.out.println(links);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  WebDriverWait w= new WebDriverWait(driver,10);
	  w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
	  w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"visibleAfter\"]")));//500ms
		
//		//fluentWait
//	    /*Wait<WebDriver> waits=new FluentWait<WebDriver>(driver)
//				.withTimeout(10,TimeUnit.SECONDS)
//				.pollingEvery(100,TimeUnit.MILLISECONDS)  //100ms
//				.ignoring(Exception.class);
//		waits.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//[@id=\"visibleAfter\"]")));/
//		
//	  
	}

}