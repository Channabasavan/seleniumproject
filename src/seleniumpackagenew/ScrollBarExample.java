package seleniumpackagenew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705283629710&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		String s=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/p[16]")).getText();
//		System.out.println(s);	
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,-750)");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(250,-750)"); 
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(-250,-750)");
		
		int x=driver.findElements(By.xpath("//*[@id=\"ts4JusYsugaXPnRnT7qT4Q\"]/a/div/img ")).size();
		System.out.println(x);
	}

}
