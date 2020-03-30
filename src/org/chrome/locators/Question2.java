package org.chrome.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\DayTwo\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
			
	//Question 2
	//Launch Browser
	driver.get("https://www.redbus.in/");
	WebElement txtUser = driver.findElement(By.id("src"));
	txtUser.sendKeys("Chennai");
	WebElement txtPass = driver.findElement(By.id("dest"));
	txtPass.sendKeys("Thanjavur");
	driver.quit();
}
}

	
