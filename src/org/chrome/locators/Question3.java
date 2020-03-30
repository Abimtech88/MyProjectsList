package org.chrome.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\DayTwo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	//Question 3
	//LaunchBrowser
	driver.get("https://www.google.com/");
	WebElement txtUser = driver.findElement(By.name("q"));
	txtUser.sendKeys("GreensTechnology"); 
	driver.quit();
}
}

