package org.framebasic.in;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\eclipse-committers-oxygen-3a-win32-x86_64\\Program Files\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement down = driver.findElement(By.xpath("//span[@id='ad-feedback-text-desktop-ad-center-1']"));
		executor.executeScript("arguments[0].scrollIntoView(true)", down);
		
		WebElement up = driver.findElement(By.xpath("//div[@id='Q-1rm5shY94Ag8H-ihAy0A']"));
		Thread.sleep(3000);
		executor.executeScript("arguments[0].scrollIntoView(false)", up);
		// JavascriptExecutor executor=(JavascriptExecutor) driver;

	}
}
