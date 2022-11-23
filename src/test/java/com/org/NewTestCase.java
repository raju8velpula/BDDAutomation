package com.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\gg\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	}

}
