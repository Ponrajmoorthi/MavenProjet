package org.framebasic.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\eclipse-committers-oxygen-3a-win32-x86_64\\Program Files\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement use = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
	use.sendKeys("ponraj");
	
}
}	
