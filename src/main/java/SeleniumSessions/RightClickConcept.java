package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html"); //launch url
		
		WebElement rightClickMeElement = driver.findElement(By.className("context-menu-one"));
		
		System.out.println(rightClickMeElement.getText());
		
		List <WebElement> rightClickOptionsList = 
				driver.findElements(By.xpath("//ul/li[contains(@class, 'context-menu-icon')]/span"));
		
		//selectRightClickOptions(driver, rightClickMeElement, rightClickOptionsList, "Cut");
		ArrayList<String> list = getRightClickOptionsList(driver, rightClickMeElement, rightClickOptionsList);
		System.out.println(list);
		
	}

	public static void selectRightClickOptions(WebDriver driver, WebElement rightClickElement, 
			List<WebElement> rightClickOptionsList, String value) {
		Actions action = new Actions(driver);
		action.contextClick(rightClickElement).build().perform();
		System.out.println(rightClickOptionsList.size());
		for(int i=0; i < rightClickOptionsList.size(); i++) {
			String text = rightClickOptionsList.get(i).getText();
			System.out.println(text);
				if (text.equals(value)) {
					rightClickOptionsList.get(i).click();
					break;
				}
		}
	}
		
		public static int getRightClickOptionsCount(WebDriver driver, WebElement rightClickElement, 
				List<WebElement> rightClickOptionsList) {
			Actions action = new Actions(driver);
			action.contextClick(rightClickElement).build().perform();
			return rightClickOptionsList.size();
		}
		
		public static ArrayList<String> getRightClickOptionsList(WebDriver driver, WebElement rightClickElement, 
				List<WebElement> rightClickOptionsList) {
			ArrayList<String> ar = new ArrayList<String>();
			Actions action = new Actions(driver);
			action.contextClick(rightClickElement).build().perform();
			System.out.println(rightClickOptionsList.size());
			for(int i=0; i < rightClickOptionsList.size(); i++) {
				String text = rightClickOptionsList.get(i).getText();
				ar.add(text);
			}
			return ar;
		}
}
