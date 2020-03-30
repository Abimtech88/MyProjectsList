package org.chrome.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1  {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\DayTwo\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	//Question 1
	//Launch Browser
	driver.get("https://www.facebook.com/ ");
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys("abiraghul6@gmail.com");
	WebElement txtPass = driver.findElement(By.name("pass"));
	txtPass.sendKeys("1234");
	//driver.quit();
}
}
