package org.chrome.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\DayTwo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Question 4
		//LaunchBrowser
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("abiraghul6@gmail.com");
		WebElement passWord = driver.findElement(By.name("Pass"));
		passWord.sendKeys("1234");
		driver.quit();
		
}
}
