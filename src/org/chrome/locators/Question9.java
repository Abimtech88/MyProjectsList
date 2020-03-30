package org.chrome.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\DayTwo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Question 9
		driver.get("https://www.irctc.co.in/");
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("abiraghul6@gmail.com");
		driver.quit();
	}
	
}
