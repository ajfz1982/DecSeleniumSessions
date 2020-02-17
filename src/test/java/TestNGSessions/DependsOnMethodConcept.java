package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void loginTest() {
		System.out.println("login Test");
		int i = 9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void homeTest() {
		System.out.println("home Test");
	}
	@Test(dependsOnMethods="loginTest")
	public void homeSearchTest() {
		System.out.println("home Search Test");
	}
	
}
