package ExtraClass;

import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		String browserName = "chrome";
		BrowserUtil2 browserUtil = new BrowserUtil2();
		WebDriver driver = browserUtil.getDriver(browserName);
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		LoginPage lp = new LoginPage(driver);
		
		String dontHaveText = lp.getDontHaveAccountText();
		System.out.println("dont have text is -->"+ dontHaveText);
		
		lp.enterEmailID("test123@gmail.com");
		lp.enterPassword("test@123");
		lp.clickLoginButton();

	}

}
