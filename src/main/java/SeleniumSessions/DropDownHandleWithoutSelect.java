package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> daysList = driver.findElements(By.xpath("//select[@id='day']/option"));
		
		List<WebElement> monthsList = driver.findElements(By.xpath("//select[@id='month']/option"));  //this is not absolute xpath, this is relative xpath
//		selectDropDownValueWithoutSelect(monthsList, "Oct");
//		
		List<WebElement> yearsList = driver.findElements(By.xpath("//select[@id='year']/option"));  //this is not absolute xpath, this is relative xpath
//		selectDropDownValueWithoutSelect(yearsList, "2005");
		
		String date = "5-Jun-2001";
		String dateArr[] = date.split("-");
		
		selectDropDownValueWithoutSelect(daysList, dateArr[0]);
		selectDropDownValueWithoutSelect(monthsList, dateArr[1]);
		selectDropDownValueWithoutSelect(yearsList, dateArr[2]);
		
	}
	
	public static void selectDropDownValueWithoutSelect(List<WebElement> list, String value) {
		System.out.println(list.size());
		
		for (int i=0;i<list.size(); i++) {
//			System.out.println(list.get(i).getText());
			String text = list.get(i).getText();
				if (text.equals(value)) {
					list.get(i).click();
					break;
				}
		}
	}
	}

