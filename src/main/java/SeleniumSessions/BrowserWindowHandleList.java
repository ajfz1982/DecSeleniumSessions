package SeleniumSessions;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		ArrayList<String> ar = new ArrayList<String>(handles);
		
		System.out.println(ar);
		
		String parentWindowID = ar.get(0);
		System.out.println(parentWindowID);
		
		String childWindowID = ar.get(1);
		System.out.println(childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		System.out.println("child window title is: "+ driver.getTitle());
		
		driver.close(); //do not use quit method.....that will close browser and not window
		
		driver.switchTo().window(parentWindowID);
		
		System.out.println("parent window title is: "+ driver.getTitle());
	
	}

}
