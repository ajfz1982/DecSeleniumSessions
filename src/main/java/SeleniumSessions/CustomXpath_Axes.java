package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath_Axes {

	public static void main(String[] args) {
		// Xpath Axes
		
		//div[@class='private-form__input-wrapper']/input[@id='username']
		//div[@class='private-form__input-wrapper']//following::input[@id='password']
		
		//div[@class='input-group']//following::input[@type='submit']
		//input[@name='username']//preceding::div
		
		//input[@name='username']//parent::div
		//div[@class='input-group']/input -- gives only direct child
		//div[@class='input-group']//input -- give both direct and indirect child
		
		//div[@class='input-group']//child::input -- same result as both direct and indirect child
		//div[@class='input-group']//child::div//child::input
		
		//input[@name='username']/../../../../../../.. -- reverse traversing, interview question
		//input[@value='Login']//ancestor::div[@class='input-group'] -- gives the chain of parents
		//input[@id='username']//ancestor::form[@id='hs-login']
		
		//span[text()='Arun F']//ancestor::td//preceding-sibling::td//child::input[@type='checkbox']
		//span[text()='Arun F']//ancestor::td//preceding-sibling::td//input[@type='checkbox']
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/19304/scorecard/1187029/india-vs-australia-3rd-odi-australia-tour-of-india-2019-20");
//		String email = driver.findElement(By.xpath("//span[text()='Arun F']//ancestor::td//following-sibling::td/a")).getText();
//		driver.findElement(By.xpath("//span[text()='Arun F']"
//					+"//ancestor::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
//		
		//a[text()='SPD Smith']//parent::div/a
//		String xpath = "//a[text()='SPD Smith']//parent::div//following-sibling::div[@class='cell runs']";
//		List<WebElement> ScoreList = driver.findElements(By.xpath(xpath));
//		for(int i=0; i<ScoreList.size(); i++) {
//			System.out.println(ScoreList.get(i).getText());
//		}	
		
		System.out.println("SPD Smith "+getScoreCard("SPD Smith", driver));
		getWicketTaker("SPD Smith", driver);
		System.out.println("AJ Turner "+getScoreCard("AJ Turner", driver));
		getWicketTaker("AJ Turner", driver);
	}
	public static ArrayList<String> getScoreCard(String playerName, WebDriver driver) {
		String xpath = "//a[text()='"+playerName+"']//parent::div//following-sibling::div[@class='cell runs']";
		
		List<WebElement> ScoreList = driver.findElements(By.xpath(xpath));
		ArrayList<String> ar= new ArrayList<String>();
		for(int i=0; i<ScoreList.size(); i++) {
			ar.add(ScoreList.get(i).getText());
		}
		return ar;
	}
	public static void getWicketTaker(String playerName, WebDriver driver) {
			String xpath = "//a[text()='"+playerName+"']//parent::div//following-sibling::div[@class='cell commentary']";
			WebElement wicketTaker = driver.findElement(By.xpath(xpath));
			String text = wicketTaker.getText();
			System.out.println("Wicket Taken By: "+text);
	}
}
