package MyTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest_Case2 extends BaseTest{

//	WebDriver driver;
//	String url = "https://app.hubspot.com/login";
//	WebDriverWait wait;
//	
//	@BeforeTest
//	public void setUp() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get(url);
//		wait = new WebDriverWait(driver, 10);
//		
//	}
	
	@Test(priority=1)
	public void verifyTitleTest() {
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		String title = driver.getTitle();
		System.out.println("page title is: "+ title);
		//inserting checkpoint
		AssertJUnit.assertEquals(title, "HubSpot Login");
		
		/*Writing if else is not good practice like below*/
//		if (title.equals("HubSpot Login123")) {
//			Assert.assertTrue(true);
//		}	
//		else { 
//			Assert.assertTrue(false);
//		}
	}
	
	@Test(priority=2)
	public void verifySignUpLinkTest() {
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Sign up")).isDisplayed());
		
//		boolean flag = driver.findElement(By.linkText("Sign up12333")).isDisplayed();
//		if (flag) {
//			System.out.println("PASS");
//		}	
//		else { 
//			System.out.println("FAIL");
//		}
	}
	
	@Test(priority=3)
	public void loginTest() {
		SoftAssert softAssert = new SoftAssert();
		driver.findElement(By.id("username")).sendKeys("arun.j.f@live.com");
		driver.findElement(By.id("password")).sendKeys("Binu@run7");
		driver.findElement(By.id("loginBtn")).click();
		
		wait.until(ExpectedConditions.titleContains("Reports dashboard"));
		String title = driver.getTitle();
		AssertJUnit.assertEquals(title, "Reports dashboard");
		
		String header = driver.findElement(By.cssSelector("h1.private-page__title")).getText();
		AssertJUnit.assertEquals(header, "Sales dashboard");
		
		String accountName = driver.findElement(By.cssSelector("span.account-name")).getText();
		AssertJUnit.assertEquals(accountName, "Amazon");
		
		softAssert.assertAll();
	
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
}
