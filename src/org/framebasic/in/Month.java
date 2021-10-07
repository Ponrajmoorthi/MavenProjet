package org.framebasic.in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Month {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\eclipse-committers-oxygen-3a-win32-x86_64\\Program Files\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement creatNew = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		creatNew.click();

		Thread.sleep(3000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		month.click();
	
		Select select = new Select(month);
		List<WebElement>options =select.getOptions();
		for (int i = 6; i < options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();	
			System.out.println(text);
			

		}
		
	
	
	}
}
