package org.chrome.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\DayTwo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//Question 8
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("abiraghul6@gmail.com");
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("1234");
		driver.quit();
}
}
