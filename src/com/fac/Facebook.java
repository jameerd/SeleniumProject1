package com.fac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook 
{
	 @Test
	 public void facebook() throws InterruptedException
	 {
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8951072433");
		driver.findElement(By.id("pass")).sendKeys("8951072433jdc151996");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(4000);
		driver.quit();
		
	 }
	

}
