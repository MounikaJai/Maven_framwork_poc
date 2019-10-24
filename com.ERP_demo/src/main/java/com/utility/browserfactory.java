package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class browserfactory {
	public static WebDriver driver ;
	@BeforeSuite
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	@AfterSuite
	public void teardown() {
		driver.quit();

	}

}
