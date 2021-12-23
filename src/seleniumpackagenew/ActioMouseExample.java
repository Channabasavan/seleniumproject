package seleniumpackagenew;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActioMouseExample {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/automation-practice-form");
		 WebElement x=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		 WebElement y=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		 Actions a=new Actions(driver);
		 Action a2=a.dragAndDrop(x,y).build();
		 a2.perform();
	}

}
