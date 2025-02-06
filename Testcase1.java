package Testcase1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().driverVersion("132.0.6834.160").setup();
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.automationexercise.com/");
		driver.findElement(By.cssSelector("body > div > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button")).click();
		Boolean displayed = driver.findElement(By.cssSelector("#slider-carousel > div > div.item.active > div:nth-child(1) > h2")).isDisplayed();
		if (displayed) {
			System.out.println("the page is displayed");
		}
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		Boolean newUser = driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > h2")).isDisplayed();
		if (newUser) {
			System.out.println("New User is displayed");
		} else {
			System.out.println("New User is not displayed");
		}
		
		driver.findElement(By.name("name")).sendKeys("Khaled");
		driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)")).sendKeys("kaka21khalil21@gmail.com");
		
		driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button")).click();
		
		Boolean Account = driver.findElement(By.cssSelector("#form > div > div > div > div.login-form > h2 > b")).isDisplayed();
		if (Account) {
			System.out.println("Account Information is displayed");
		} else {
			System.out.println("Account Information is not displayed");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.name("title")).click();
		driver.findElement(By.name("password")).sendKeys("new_password");
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("days"));
		Select selectday = new Select(day);
		selectday.selectByValue("12");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("months"));
		Select selectmonth = new Select(month);
		selectmonth.selectByValue("3");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("years"));
		Select selectyear = new Select(year);
		selectyear.selectByValue("1992");
		Thread.sleep(2000);
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		
		driver.findElement(By.name("first_name")).sendKeys("Gladiator");
		driver.findElement(By.name("last_name")).sendKeys("Gladiator2");
		driver.findElement(By.name("company")).sendKeys("films");
		driver.findElement(By.name("address1")).sendKeys("440 street");
		
		WebElement country = driver.findElement(By.id("country"));
		Select countryselect = new Select(country);
		countryselect.selectByValue("United States");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("state")).sendKeys("California");
		driver.findElement(By.name("city")).sendKeys("California");
		driver.findElement(By.name("zipcode")).sendKeys("California");
		driver.findElement(By.name("mobile_number")).sendKeys("99999999");
        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitButton.click();
		
		Boolean created = driver.findElement(By.cssSelector("#form > div > div > div > h2 > b")).isDisplayed();
		if (created) {
			System.out.println("Account created is displayed");
		} else {
			System.out.println("Account created is not displayed");
		}
		driver.findElement(By.cssSelector("#form > div > div > div > div > a")).click();
		
		Boolean logged = driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a > b")).isDisplayed();
		if (logged) {
			System.out.println("Account logged is displayed");
		} else {
			System.out.println("Account logged is not displayed");
		}
		
		driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a")).click();
		driver.findElement(By.cssSelector("#form > div > div > div > div > a")).click();
		
	}

}
