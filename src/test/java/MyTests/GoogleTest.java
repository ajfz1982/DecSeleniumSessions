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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	WebDriver driver;
	String url = "https://www.google.com";
	WebDriverWait wait;
	
	@BeforeTest
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
	public void verifyGoogleTitleTest() {
		wait.until(ExpectedConditions.titleContains("Google"));
		String title = driver.getTitle();
		System.out.println("page title is: "+ title);
		AssertJUnit.assertEquals(title, "Google");
	
	}
	
	@Test(priority=2)
	public void verifyGoogleSearchTest() {
		driver.findElement(By.name("q")).sendKeys(("Naveen Automation Labs"));
		driver.findElement(By.name("btnK")).click();
		String title = driver.getTitle();
		if (title.contains("Naveen")) 
			AssertJUnit.assertTrue(true);
		}
		
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	}


