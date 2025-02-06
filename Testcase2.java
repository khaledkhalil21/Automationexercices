package Testcase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationexercise.com");
		
		driver.findElement(By.cssSelector("body > div > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p")).click();
		
		Boolean home = driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-4 > div > a > img")).isDisplayed();
		
		if (home) {
			System.out.println("the home page is displayed");
		} else {
			System.out.println("the home page is not displayed");
		}
		
		
		driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a")).click();
		Boolean login = driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > h2")).isDisplayed();
		if (login) {
			System.out.println("the login page is displayed");
		} else {
			System.out.println("the login page is not displayed");
		}
		
		driver.findElement(By.name("email")).sendKeys("gladiator@gmail.com");
		driver.findElement(By.name("password")).sendKeys("new_password");
		
		
		driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button")).click();
		
		Boolean logged = driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a > i")).isDisplayed();
		if (logged) {
			System.out.println("the user is logged");
		} else {
			System.out.println("the user is not logged");
		}
		
		driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a")).click();
		driver.findElement(By.cssSelector("#form > div > div > div > div > a")).click();
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
