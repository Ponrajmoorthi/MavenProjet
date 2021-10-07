package org.framebasic.in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","E:\\eclipse-committers-oxygen-3a-win32-x86_64\\Program Files\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement creatNew = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	//Thread.sleep(3000);
	creatNew.click();
	Thread.sleep(3000);
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	//year.click();
	//System.out.println("year count");
	Select select=new Select(year);
	List<WebElement> options = select.getOptions();
	int size=options.size();
	System.out.println(size);
	
	
	
	
	
			
	
	
		
	}
	
	
	
	
	
		
		
			
	}



