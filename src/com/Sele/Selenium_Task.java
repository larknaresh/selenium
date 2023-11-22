package com.Sele;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Task {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Chromewebdri\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		WebElement make = driver.findElement(By.xpath("(//a[text() ='makeup' ])[2]"));
		WebElement Fou = driver.findElement(By.xpath("(//a[text() = 'Foundation' ])[2]"));
		Actions s = new Actions(driver);
		s.moveToElement(make).build().perform();
		s.click(Fou).build().perform();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
			
		}
		    WebElement findElement = driver.findElement(By.xpath("//span[text() = 'Brand' ]"));
		    findElement.click();
		    WebElement findElement2 = driver.findElement(By.xpath("//span[text() = 'Nykaa Cosmetics' ]"));
		    findElement2.click();
		    WebElement Matte = driver.findElement(By.xpath("//span[text() = '₹594' ]"));
		    Matte.click();
		    Set<String> windowHandles2 = driver.getWindowHandles();
		    for (String string1 : windowHandles2) {
              String title1 = driver.switchTo().window(string1).getTitle();
		    	System.out.println(title1);
		 }
		    WebElement findElement3 = driver.findElement(By.xpath("(//span[text() = 'Add to Bag' ])[1]"));
			findElement3.click();
			WebElement findElement4 = driver.findElement(By.xpath("//span[@class = 'cart-count' ]"));
			findElement4.click();
		    TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot\\Nykaa.png");
			FileUtils.copyFile(source, des);
				
				

				
				
				
				
				
		    	
			}
		    
		    
		    
		    
	    
	    
		
		
		
		
		

	}
