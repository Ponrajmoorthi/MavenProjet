package org.framebasic.in;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-committers-oxygen-3a-win32-x86_64\\Program Files\\Selenium\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		WebElement txtseach = driver.findElement(By.id("twotabsearchtextbox"));
		txtseach.sendKeys("iphone",Keys.ENTER);
		Thread.sleep(3000);
		WebElement product = driver.findElement(By.xpath("(//span[text()='New Apple iPhone 11 (64GB) - Purple'])[2]"));
		product.click();
		String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		for (String eachwindow : allwindow) {
			if (!mainWindow.equals(eachwindow)) {
				driver.switchTo().window(eachwindow);
				
			}
			Thread.sleep(3000);
			WebElement add = driver.findElement(By.id("buy-now-button"));
			add.click();
			driver.switchTo().window(mainWindow);
			
		}
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
