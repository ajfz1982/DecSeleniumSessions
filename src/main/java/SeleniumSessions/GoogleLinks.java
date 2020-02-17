package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("http://www.google.com"); //launch url
		
		List<WebElement> menuLinks = driver.findElements(By.xpath("//div[@id='hptl']/a"));
		
		System.out.println("total menu links:"+menuLinks.size());
		
		for (int i=0; i<menuLinks.size(); i++) {
			//System.out.println(menuLinks.get(i).getText());
			menuLinks.get(i).click();
			
			driver.navigate().back();	
			
			menuLinks = driver.findElements(By.xpath("//div[@id='hptl']/a")); //updating the object with the next dom version
		}
		
		/*Assignement 3*/
		
//		List<WebElement> leftfooterLinks = driver.findElements(By.xpath("//span[@id='fsl']/a"));
//		
//		System.out.println("left footer links:"+leftfooterLinks.size());
//		
//		for (int i=0; i<leftfooterLinks.size(); i++) {
//			System.out.println(leftfooterLinks.get(i).getText());
//			
//		}
//		
//		List<WebElement> rightfooterLinks = driver.findElements(By.xpath("//span[@id='fsr']/a"));
//		
//		System.out.println("right footer links:"+rightfooterLinks.size());
//		
//		for (int i=0; i<rightfooterLinks.size(); i++) {
//			System.out.println(rightfooterLinks.get(i).getText());
//			
//		}
	}
}
