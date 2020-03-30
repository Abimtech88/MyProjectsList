package org.chrome.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\DayTwo\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Question 7
		driver.get("https://www.snapdeal.com/login");
		WebElement userName = driver.findElement(By.id("userName"));
		userName.sendKeys("abiraghul6@gmail.com");
		driver.quit();

}
}

