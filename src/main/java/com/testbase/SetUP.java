package com.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUP {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	}
	
	public static void tearDown() {
		driver.quit();
		System.out.println("Browser has been closed");
	}

}
