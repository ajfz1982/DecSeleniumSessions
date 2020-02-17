package ExtraClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	ElementActions2 elementActions;
	
	By emailID = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("loginBtn");
	By dontHaveAccount = By.className("signup-link");
	
	public LoginPage(WebDriver driver) {
		elementActions = new ElementActions2(driver);
	}
	public void enterEmailID(String value) {
		elementActions.doSendKeys(emailID, value);
	}
	public void enterPassword(String value) {
		elementActions.doSendKeys(password, value);
	}	
	public void clickLoginButton() {
		elementActions.doClick(loginButton);
	}
	public String getDontHaveAccountText() {
		return elementActions.doGetText(dontHaveAccount);
	}
}
