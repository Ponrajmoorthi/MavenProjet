package org.framebasic.in;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandeling {
public static void main(String[] args) {
	System.setProperty("webdriver.driver.chrome","E:\\eclipse-committers-oxygen-3a-win32-x86_64\\Program Files\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone",Keys.ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
