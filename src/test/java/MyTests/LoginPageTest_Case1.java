package MyTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest_Case1 {

	WebDriver driver;
	String url = "https://app.hubspot.com/login";
	WebDriverWait wait;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		wait = new WebDriverWait(driver, 10);
		
	}
	
	@Test(priority=1)
	public void verifyTitleTest() {
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		String title = driver.getTitle();
		System.out.println("page title is: "+ title);
		//inserting checkpoint
		AssertJUnit.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=2)
	public void verifySignUpLinkTest() {
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Sign up")).isDisplayed());
	}
	
	@Test(priority=3)
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("arun.j.f@live.com");
		driver.findElement(By.id("password")).sendKeys("Binu@run7");
		driver.findElement(By.id("loginBtn")).click();
		
		wait.until(ExpectedConditions.titleContains("Reports dashboard"));
		String title = driver.getTitle();
		AssertJUnit.assertEquals(title, "Reports dashboard");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
