package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasicsFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/afernandez/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://google.com"); //launch url
		
		String title = driver.getTitle(); //get the title
		
		System.out.println("page title is: "+ title);
		
		//verification point/checkpoint -- Actual Result vs Expected Result
		if (title.equals("Google"))
			System.out.println("title is correct");
		
		else
			System.out.println("title is not correct");
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//driver.quit(); //close the browser

	}

}
