package org.recall.in;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		
	
		
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-committers-oxygen-3a-win32-x86_64\\Program Files\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		WebElement search = driver1.findElement(By.id("email"));
		search.sendKeys("ponraj");
		Thread.sleep(3000);
		WebElement pass = driver1.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("123654987");
		WebElement botten = driver1.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		botten.click();
		Thread.sleep(3000);
		WebElement day = driver1.findElement(By.xpath("//*[@id=\"day\"]"));
		day.click();
		Select select=new Select(day);
		select.selectByIndex(0);
		select.deselectByIndex(1);
		List<WebElement> options = select.getOptions();
		int len=options.size();
		for (int i = 0; i < args.length; i++) {
			select.selectByIndex(i);
		}
		String days = null;
		select.selectByVisibleText(days);
		String element;
		}
		
		
		
		
		
		
		
		
	

}