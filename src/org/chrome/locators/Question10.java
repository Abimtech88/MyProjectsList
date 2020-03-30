package org.chrome.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\DayTwo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Question 10
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("abiraghul6@gmail.com");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("1234");
		driver.quit();
}
}
