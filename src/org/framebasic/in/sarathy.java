package org.framebasic.in;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sarathy {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-committers-oxygen-3a-win32-x86_64\\Program Files\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		Robot robot = new Robot(); 
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_S);
		
		
		
		
		
		
//		WebElement in = driver.findElement(By.xpath("(//a[@class='gb_f'])[2]"));
//		Actions actions=new Actions(driver);
//		actions.contextClick(in).perform();
//		
			
		}
		
	}


