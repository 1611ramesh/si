package org.six;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Six {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("ramesh1995");
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("ramesh1995");
		WebElement findElement3 = driver.findElement(By.id("login"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.id("location"));
		Select si = new Select(findElement4);
		si.selectByIndex(2);
		
		
		
		
		
		
		
		
	}
	
	
	

}
