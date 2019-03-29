package com.zald;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZaldTest 
 {
	 public static void main(String args[]) throws InterruptedException
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 String url="https://www.zald.in/";
		 driver.get(url);
		 //driver.findElement(By.xpath("//*[@id='ember481']/div[2]/div/i")).click();
		 //driver.findElement(By.xpath("//*[@id='ember1001']")).sendKeys("hello");
		// driver.findElement(By.xpath("//*[@id='collapseTwo']/../div[1]/h4/a")).click();
		 driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[3]/a")).click();
		 Thread.sleep(5000);
		 driver.quit();
				 
	 }

}
