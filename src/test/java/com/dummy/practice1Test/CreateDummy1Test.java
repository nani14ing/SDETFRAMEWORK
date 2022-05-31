package com.dummy.practice1Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDummy1Test {

	
		@Test
		public void reateDummy1Test() {
			
			//JavaLibrary javautil=new JavaLibrary();
			WebDriver driver=null;
			//WebDriverLibrary webDriverLibrary;
						
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://localhost:8888");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		}	
}
