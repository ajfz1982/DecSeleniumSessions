package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/afernandez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //launch chrome browser
		
		ElementActions elementActions = new ElementActions(driver);
		
		elementActions.launchUrl("https://mail.rediff.com/cgi-bin/login.cgi");
		elementActions.doClick(By.name("proceed"));
		
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct alert text");
		}
		else {
			System.out.println("in-correct alert text");
		}
		
		alert.accept();//Click on OK button
//		alert.dismiss();//invokes Esc
	}

}
