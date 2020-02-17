package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSSelector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// 1. id --> #
		//htmltag#id
		//#id
		// #username
		// input#username
		
		// 2. class --> .
		//.className, htmltag.className, .c1.c2.c3, htmltag.c1.c2.c3
		//.login-email
		//input.login-email
		//input.login-email#username
		//.form-control.private-form__control.login-email
		//input.form-control.private-form__control.login-email
		
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test");
		driver.findElement(By.className("login-email")).sendKeys("naveen");
		
		// 3. parenttag > childtag
		// div.private-form__input-wrapper > input#username
		
		// 4. htmltag[id='value']
		// input[id='username']
		// input[id='username'][type='email']
		// input#username[type='email']
		// input.login-email[type='email']
		
		// 5. starting:
		// input[id^='user']
		
		// 6. ending
		// input[id$='name']
		
		// 7. comma in css: for the same as well as different elements in DOM
		// input#username, input.login-email
		// input#username, input.login-password -- collecting multiple elements separated by comma
		
		// 8. first-of-type in css: interview question
		// ul.navbar-right> li:first-of-type > a
		
		// 9. last-of-type in css: interview question
		// ul.navbar-right> li:last-of-type > a
		
		// 10. nth-of-type in css:
		// ul.navbar-right> li:nth-of-type(3)
		// ul.navbar-right> li:nth-of-type(n) --> all elements
		
		// 11. sibling of element:
		// div.private-form__input-wrapper + div --> gives the next available/following sibling, cannot go back/upwards
		
		// 12. not operator in css:
		// input.form-control.private-form__control:not(.login-password)
		
	}

}
