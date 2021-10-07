package org.framebasic.in;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-committers-oxygen-3a-win32-x86_64\\Program Files\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://Amazon.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
	     txtSearch.sendKeys("iphone",Keys.ENTER);
	 
	     WebElement lnkPhone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	
	lnkPhone.click();
	
	
	
	
	
	}

}
