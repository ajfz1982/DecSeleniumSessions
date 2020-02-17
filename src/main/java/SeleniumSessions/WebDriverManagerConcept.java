package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		//WebDriver driver = new FirefoxDriver(); 
		
		driver.get("http://google.com"); //launch url
		
		String title = driver.getTitle(); //get the title
		
		System.out.println("page title is: "+ title);
	}

}
