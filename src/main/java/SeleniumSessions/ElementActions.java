package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementActions {

	WebDriver driver;
	
	//constructor
	public ElementActions(WebDriver driver) {
		this.driver = driver;
	}
		
	public void launchUrl(String url) {
		driver.get(url);
	}
	
	public String doGetTitle() {
		return driver.getTitle();
	}
	
	/** this method is used to create the webelement on the basis of By locator
	 * @param locator
	 * @param driver
	 * @return
	 */
	
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public void doSendKeys(By locator, String value) {
		WebElement element = getElement(locator);
		element.clear();
		element.sendKeys(value);
	}

	public void doClick(By locator){
		WebElement element = getElement(locator);
		element.click();	
	}
	
	public void doActionSendKeys(By locator, String value){
		WebElement element = getElement(locator);
		Actions actions = new Actions(driver);
		actions.sendKeys(element, value).build().perform();
	}
	
	public void doActionsClick(By locator){
		WebElement element = getElement(locator);
		Actions actions = new Actions(driver);
		actions.click(element).build().perform();
	}
	
	public void selectValueFromDropdown(By locator, String value) {
		WebElement element = getElement(locator);
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public void selectValueFromDropdown(By locator, int index) {
		WebElement element = getElement(locator);
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	/**
	 * this method is used to get all the values from a dropdown with select tag
	 * @param locator
	 * @return
	 */
	public ArrayList<String> getAllDropDownOptions(By locator) {
		ArrayList<String> ar = new ArrayList<String>();
		WebElement element = getElement(locator);
		Select select = new Select(element);
		
		List<WebElement> daysList = select.getOptions();
		System.out.println(daysList.size());
		
		for (int i=0; i<daysList.size(); i++) {
			String text = daysList.get(i).getText();
			ar.add(text);
		}
		
		return ar;
	}
	
	public void selectDropDownValueWithoutSelect(List<WebElement> list, String value) {
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
