package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	
	static WebDriver driver;

	public static void main(String[] args) {

		String browserName = "test";
		
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/afernandez/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("Safari")) {
			driver = new SafariDriver();
		}
		else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("browser not found");
		}
		
		driver.get("http://google.com"); //launch url
		
		String title = driver.getTitle(); //get the title
		
		System.out.println("page title is: "+ title);
		
		//verification point/checkpoint -- Actual Result vs Expected Result
		if (title.equals("Google"))
			System.out.println("title is correct");
		
		else
			System.out.println("title is not correct");
	}

}
