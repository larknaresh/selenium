package com.Sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Downtask {

	public static void main(String[] args) throws IOException {
    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Chromewebdri\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement w = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(w);
		s.selectByVisibleText("Clothing & Accessories");
		WebElement a = driver.findElement(By.xpath("//input[@type = 'text' ]"));
		a.sendKeys("jeans pant for men");
		WebElement b = driver.findElement(By.xpath("//input[@type = 'submit' ]"));
		b.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot\\Amazon.png");
		FileUtils.copyFile(source, des);
		
		
		
		
		
		
		
		

	}

}
