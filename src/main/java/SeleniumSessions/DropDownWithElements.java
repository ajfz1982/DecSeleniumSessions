package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("https://www.facebook.com/");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(day);
//		
//		List<WebElement> daysList = select.getOptions();
//		System.out.println(daysList.size());
//		
//		for (int i=0; i<daysList.size(); i++) {
//			String text = daysList.get(i).getText();
//			System.out.println(text);
//		}
		
		ArrayList<String> daysList = getAllDropDownOptions(day);
		System.out.println(daysList);
		
		ArrayList<String> monthsList = getAllDropDownOptions(month);
		System.out.println(monthsList);
		
		ArrayList<String> yearsList = getAllDropDownOptions(year);
		System.out.println(yearsList);
		
	}
	
	public static ArrayList<String> getAllDropDownOptions(WebElement element) {
		ArrayList<String> ar = new ArrayList<String>();
		
		Select select = new Select(element);
		
		List<WebElement> daysList = select.getOptions();
		System.out.println(daysList.size());
		
		for (int i=0; i<daysList.size(); i++) {
			String text = daysList.get(i).getText();
			ar.add(text);
		}
		
		return ar;
	}

}
