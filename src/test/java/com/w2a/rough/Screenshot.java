package com.w2a.rough;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\executables\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://demo.aminfocraft.com/Sk8bet_Project/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='img-fluid announcementcross']")).click();
	
	
		
		//"C:\\Users\\AMW201\\Desktop\\Projects\\SK8BET\\Screenshots\\HomePage.png"
	}
	}