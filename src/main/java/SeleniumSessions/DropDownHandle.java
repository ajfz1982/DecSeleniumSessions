package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("https://www.facebook.com/");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
//		Select select1 = new Select(day);
//		select1.selectByVisibleText("10");
//		
		Select select2 = new Select(month);
//		select2.selectByVisibleText("Jun");
//		
//		Select select3 = new Select(year);
//		select3.selectByVisibleText("1990");
		
//		selectValueFromDropdown(day, "10");
//		selectValueFromDropdown(month, "Jun");
//		selectValueFromDropdown(year, "1990");
		
		Select select1 = new Select(day);
		select1.selectByIndex(5);
		select2.selectByValue("3");
		System.out.println(select1.isMultiple());
		
	}
	
	public static void selectValueFromDropdown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void selectValueFromDropdown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	

}
