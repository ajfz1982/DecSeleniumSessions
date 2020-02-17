package ExtraClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementActions2 {
	WebDriver driver;
	
	public ElementActions2(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return(element);
	}	
	public void doSendKeys(By locator, String value) {
		WebElement element = getElement(locator);
		element.clear();
		element.sendKeys(value);
	}
	public void doClick(By locator) {
		WebElement element = getElement(locator);
		element.click();
	}
	public String doGetText(By locator) {
		WebElement element = getElement(locator);
		return element.getText();
	}

}
