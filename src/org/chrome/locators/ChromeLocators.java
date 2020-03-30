package org.chrome.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLocators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\DayTwo\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Question 8
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
	WebElement userName = driver.findElement(By.name("username"));
	userName.sendKeys("abiraghul6@gmail.com");
	WebElement passWord = driver.findElement(By.name("password"));
	passWord.sendKeys("1234");
	driver.quit();
	
	//Question 9
	/*driver.get("https://www.irctc.co.in/");
	WebElement userName = driver.findElement(By.name("username"));
	userName.sendKeys("abiraghul6@gmail.com");*/
	
	/*//Question 10
	
	driver.get("www.adactin.com/HotelApp/ ");
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("abiraghul6@gmail.com");
	WebElement passWord = driver.findElement(By.id("password"));
	passWord.sendKeys("1234");
	driver.quit();*/
	
	/*//Question 1
	//Launch Browser
	driver.get("https://www.facebook.com/ ");
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys("abiraghul6@gmail.com");
	WebElement txtPass = driver.findElement(By.name("pass"));
	txtPass.sendKeys("1234");
	driver.quit();*/
	
	/*//Question 2
	//Launch Browser
	driver.get("https://www.redbus.in/");
	WebElement txtUser = driver.findElement(By.id("src"));
	txtUser.sendKeys("Chennai");
	WebElement txtPass = driver.findElement(By.id("dest"));
	txtPass.sendKeys("Thanjavur");
	driver.quit();*/
	
	/*//Question 3
	//LaunchBrowser
	driver.get("https://www.google.com/");
	WebElement txtUser = driver.findElement(By.name("q"));
	txtUser.sendKeys("GreensTechnology"); 
	driver.quit();*/
	
	/*//Question 4
	//LaunchBrowser
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("abiraghul6@gmail.com");
	WebElement passWord = driver.findElement(By.name("Pass"));
	passWord.sendKeys("1234");
	driver.quit();*/
	
	/*//Question 5
	driver.get("https://netbanking.hdfcbank.com/");
	WebElement userName = driver.findElement(By.name("fldLoginUserId"));
	userName.sendKeys("342KL78");
	driver.quit();*/
	
	/*//Question 6
	driver.get("https://www.swiggy.com/");
	WebElement userName = driver.findElement(By.id("location"));
	userName.sendKeys("Karapakkam");
	driver.quit();*/
	
	/*//Question 7
	driver.get("https://www.snapdeal.com/login");
	WebElement userName = driver.findElement(By.id("userName"));
	userName.sendKeys("abiraghul6@gmail.com");
	driver.quit();*/
	
}
}
