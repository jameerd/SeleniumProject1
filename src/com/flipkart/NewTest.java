package com.flipkart;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest 
{
	
	WebDriver driver;
	
     @Test(priority=1)
     public void b() throws InterruptedException
     {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   String url="https://www.amazon.in/";
	   driver.get(url);
	  
     }
     @Test(priority=2)
     public void c() throws InterruptedException
     {

   	  WebElement shopby=driver.findElement(By.xpath("//span[text()='Shop by']"));
   	  WebElement mobiles=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
   	  WebElement allmobiles=driver.findElement(By.xpath("//span[text()='All Mobile Phones']"));
   	  
   	  Actions a=new Actions(driver);
   	  a.moveToElement(shopby).build().perform();
   	  Thread.sleep(5000);
   	  a.moveToElement(mobiles).build().perform();
   	  Thread.sleep(5000);
   	  a.moveToElement(allmobiles).build().perform();
   	  Thread.sleep(4000);
   	  allmobiles.click();
   	 
   	  WebElement sumcheck=driver.findElement(By.xpath("//*[@name=\"s-ref-checkbox-Samsung\"]"));
   	  sumcheck.click();
   	  
   	 WebElement lowprice=driver.findElement(By.xpath("//*[@id=\"low-price\"]"));
	  lowprice.sendKeys("500");
	  Thread.sleep(5000);
	  WebElement highprice=driver.findElement(By.xpath("//*[@id=\"high-price\"]"));
	  highprice.sendKeys("2000");
	  Thread.sleep(5000);
	  WebElement go=driver.findElement(By.xpath("//*[@aria-labelledby=\"a-autoid-4-announce\"]"));
	  go.click();
	  Thread.sleep(5000);
	  
	  WebElement mob=driver.findElement(By.xpath("//*[@data-attribute=\"Samsung Guru 1200 (GT-E1200, Black)\"]"));
	  mob.click();
	  Thread.sleep(5000);
	  
	  String parentWindow=driver.getWindowHandle();
	  System.out.println(parentWindow);
	   Set<String>allWindow=driver.getWindowHandles();
         
	   for(String curWindow:allWindow)
	   {
		   driver.switchTo().window(curWindow);
		   System.out.println(curWindow);
	   }
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();//add cart
	  Thread.sleep(5000);
	  driver.close();
	   driver.switchTo().window(parentWindow);
	   Thread.sleep(10000);
	  driver.quit();
   	  //driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click(); 
     }
     
    
}
