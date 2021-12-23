package seleniumpackagenew;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChannaLInk{
public static WebDriver driver;
 public static void  openbrowser(){
 driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("");
}
public static void verifyurl(String url) throws IOException{
URL u=new URL(url);
HttpsURLConnection connection=(HttpsURLConnection)u.openConnection();
if(connection.getResponseCode()==200){
System.out.println("link is valid:"+connection.getResponseMessage()+" "+u);
}
if(connection.getResponseCode()==HttpsURLConnection.HTTP_NOT_FOUND){
System.out.println("link is valid:"+connection.getResponseMessage()+" "+u);
}
}
public static void main(String [] args) throws IOException
{
	openbrowser();
  List<WebElement> links=driver.findElements(By.tagName("a"));
  for(WebElement link:links){
  String url= link.getAttribute("href");
  verifyurl(url);
}
}
}