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

public class Takes_ScreenshotTask {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Chromewebdri\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@type = 'text']"));
		search.sendKeys("larknaresh2001@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type = 'password']"));
		pass.sendKeys("20102001nNNN@");
		WebElement login = driver.findElement(By.xpath("//div[text() = 'Log in' ]"));
		login.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot\\Instagram.png");
		FileUtils.copyFile(source, des);
		
		
		
		

	}

}
