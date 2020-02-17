package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	//pre-condition
	//test -- ac vs ex
	//post step
	/**
	 * BS
	 * BT
	 * BC
	 * 
	 * BM
	 * T1
	 * AM
	 * 
	 * BM
	 * T2
	 * AM
	 * 
	 * AC
	 * AT
	 * AS
	 */
	//1
	@BeforeSuite
	public void startServer() {
		System.out.println("Start Server");
	}
	//3
	@BeforeClass
	public void launchURL() {
		System.out.println("launch URL");
	}
	//2
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch Browser");
	}
	//4
	@BeforeMethod
	public void login() {
		System.out.println("login to app");
	}
	//5
	@Test(priority=2)
	public void verifyHomePageTitleTest() {
		System.out.println("verify Home Page Title Test");
//		int i = 9/0;
	}
	@Test(priority=3)
	public void verifyHomePageHeaderTest() {
		System.out.println("verify Home Page Header Test");
	}
	@Test(priority=1)
	public void verifyLoggedInUserTest() {
		System.out.println("verify Logged In User Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close Browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("delete User");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("disconnect DB");
	}
}
