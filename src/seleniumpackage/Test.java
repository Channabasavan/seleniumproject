package seleniumpackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.tagName("table"));    
		List <WebElement> rows = table.findElements(By.tagName("tr")); 
		
		for (WebElement eachrows : rows) { 
			
			List<WebElement> thead = eachrows.findElements(By.tagName("th"));
			for (WebElement hdata : thead) {
				System.out.print(hdata.getText()+"  ");
				}
				
				 //for fetching table data (each cell data will be fetching)
				List<WebElement> rowdata=eachrows.findElements(By.tagName("td"));
				
				for (WebElement cell : rowdata) {   
					
					System.out.print(cell.getText()+"  ");
			}
				System.out.println();
		}

	}

}