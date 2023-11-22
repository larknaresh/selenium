package com.Sele;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		WebElement hair = driver.findElement(By.xpath("//a[text() = 'hair']"));
		WebElement Sha = driver.findElement(By.xpath("(//a[text() ='Shampoo'])[1]"));
		Actions s = new Actions(driver);
		s.moveToElement(hair).build().perform();
		s.click(Sha).build().perform();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
			
	}
			WebElement Loreal = driver.findElement(By.xpath("//span[text() ='₹1025']"));
			Loreal.click();
			
				
			}   
			
			
		}

	


