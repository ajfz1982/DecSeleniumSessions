package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("http://www.google.com"); //launch url
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		int linksCount = linksList.size();
		
		System.out.println("total number of links:"+linksCount);
		
		//getting these webelements from sites is also called webcrawling
		int cnt = 0;
		for (int i=0; i<linksCount; i++) {
			String text = linksList.get(i).getText();
			
			if (!text.equalsIgnoreCase("")) {	//Assignment 1 - print only non-null links
				cnt++;
				System.out.println(text);
			}
			
//			String hrefValue = linksList.get(i).getAttribute("href");
			
//			System.out.println(i+"--->"+text+"--->"+hrefValue);
		}
		System.out.println("Links with text: "+cnt); //Assignment 2 - print number of links with/without text
		System.out.println("Links without text: "+ (linksCount-cnt));
}
	
}