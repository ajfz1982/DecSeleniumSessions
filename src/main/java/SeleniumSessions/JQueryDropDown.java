package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/"); //launch url

		driver.findElement(By.id("justAnInputBox")).click();
		
		Thread.sleep(2000);
		
//		selectChoiceValue(driver, "choice 2"); //selecting only one value from dropdown
//		selectChoiceValue(driver, "choice 2", "choice 2 3", "choice 6 2 3"); //selecting multiple values from dropdown 
		selectChoiceValue(driver, "ALL"); //selecting all values from dropdown
		
	}
	/**
	 * this method is used to select the choices from drop down
	 * 1. single selection
	 * 2. multi selection
	 * 3.all selection - pass "all" or "ALL" as value parameter
	 * @param driver
	 * @param value
	 */
	public static void selectChoiceValue(WebDriver driver, String... value) { //String... value is a string array being passed
		
		List<WebElement> choiceList = driver.findElements(By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]/ul//li/span[@class='comboTreeItemTitle']"));
		
		if (!value[0].equalsIgnoreCase("ALL")) {
		
		System.out.println(choiceList.size());
		
		for (int i=0; i<choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);
			
			for (int j=0; j<value.length; j++) {
				if (text.equals(value[j])) {
					choiceList.get(i).click();
					break;
				}
			}
			 
		}
	}
		else { //this selects all choices from dropdown
			for (int all=0; all<choiceList.size();all++) {
				choiceList.get(all).click();
			}
		}
	}
}
