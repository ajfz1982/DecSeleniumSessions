package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddContact {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
//			call BrowserUtil class 'driver'		
			BrowserUtil br = new BrowserUtil();
			driver = br.init_driver("Chrome");
			
			ElementActions elementActions = new ElementActions(driver);
		
			elementActions.launchUrl("https://ui.cogmento.com/contacts/new");
			
			Thread.sleep(5000);
			
			//By Locators
			By emailID = By.name("email");
			By password = By.name("password");
			By loginButton = By.cssSelector("#ui > div > div > form > div > div.ui.fluid.large.blue.submit.button");
//			By forgotPassword = By.linkText("Forgot my password");			
			By fname = By.name("first_name");
			By lname = By.name("last_name");
//			By saveButton = By.cssSelector("#dashboard-toolbar > div.ui.right.secondary.pointing.menu.toolbar-container > div > button.ui.linkedin.button");

			elementActions.doSendKeys(emailID, "arun.j.f@live.com");
			elementActions.doSendKeys(password, "Binu@run7");
			elementActions.doClick(loginButton);
//			elementActions.doClick(forgotPassword);
			elementActions.doSendKeys(fname, "arun");
			elementActions.doSendKeys(lname, "fernandez");
//			elementActions.doClick(saveButton);

	}

}
