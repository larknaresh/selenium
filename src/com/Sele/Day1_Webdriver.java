package com.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class Day1_Webdriver {
  public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("larknaresh2001@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("XXXXX");
		
		
		

		
		
		
		
		
		

	}

}
