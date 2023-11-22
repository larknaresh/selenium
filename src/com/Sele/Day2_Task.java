package com.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Vivo Y100A");
		WebElement search2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search2.click();
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobiles.click();
		
		
	}

}
