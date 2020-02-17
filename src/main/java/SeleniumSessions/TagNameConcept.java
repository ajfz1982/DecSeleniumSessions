package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("http://www.amazon.com"); //launch url
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		int linksCount = linksList.size();
		
		System.out.println("total number of links:"+linksCount);
		
		for (int i=0; i<linksCount; i++) {
			String text = linksList.get(i).getText();
			System.out.println(text);
			
			
			if (text.equals("Privacy")) {
				linksList.get(i).click();
				break;
			}
		
	}
		System.out.println("--------------------------------");
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		
		int imagesCount = imagesList.size();
		
		System.out.println("total number of images:"+imagesCount);

}
}

