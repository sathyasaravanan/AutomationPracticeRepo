package com.booking.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class initialisation {
	
	
	@Test
	public static void driverInitialise() {
		
	
		
	WebDriver driver = new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	driver.get("https://www.jetblue.com/");
	driver.switchTo().frame("trustarc_cm");
	//driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
	//driver.switchTo().defaultContent();
	//driver.findElement(By.xpath("//*[@id=\"jb-autocomplete-3-search\"]")).clear();
	
	}	
		
	}
		
	//}
	
	


