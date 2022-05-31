package com.dummy.practice1Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeParametreJenkinsTest 
{

	WebDriver driver=null;
    String url = System.getProperty("URL");
    String browser = System.getProperty("BROWSER");

	@Test
	public void practiceParametreJenkinsTest()
	{

	switch (browser) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		break;
		
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver=new FirefoxDriver();
		break;

	default:
		driver=new ChromeDriver();
		break;
	}
	driver.get(url);
	driver.get("https://localhost:8888");
	driver.quit();
	

	}
}
