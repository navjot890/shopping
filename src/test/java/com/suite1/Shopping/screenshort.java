package com.suite1.Shopping;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshort {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Garcha\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		takeScreenshot("Gmail");
		

	}
	public static void takeScreenshot(String fileName) throws IOException{
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File("C:/Users/Garcha/workspace/Shopping/src/test/java/com/suite1/Shopping/" + fileName + " .jpg"));
		
	}


}
