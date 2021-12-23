package seleniumpackagenew;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
public static WebDriver driver=null;
	
public static void openBrowser() {
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\automation files\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");	
}
public static void verfiybrokenlink(String url) throws IOException {
	URL u=new URL(url);
	HttpURLConnection connection=(HttpURLConnection)u.openConnection();
	connection.setConnectTimeout(3000);
	connection.connect();
	if(connection.getResponseCode()==200) {
		System.out.println("valid link:"+u+" =>"+connection.getResponseMessage());
	}
	if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
		System.out.println("libk is broken"+u+" =>"+connection.getResponseMessage());
		
	}	
}
	public static void main(String[] args) throws IOException {
		openBrowser();
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    System.out.println("links are"+links.size());
	    for(WebElement link:links) {
	    String url=link.getAttribute("href");
	    verfiybrokenlink(url);			 
		}
	}
}
