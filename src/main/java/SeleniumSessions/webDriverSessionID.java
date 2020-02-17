package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverSessionID {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("http://google.com"); //launch url
		
		String title = driver.getTitle(); //get the title
		
		System.out.println("page title is: "+ title);
		
		driver.close(); //close the browser
		
		//driver.quit();//quit the browser
		
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com"); //launch url
		
		//driver.quit();//quit the browser
		
		System.out.println(driver.getTitle());//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	}

}
