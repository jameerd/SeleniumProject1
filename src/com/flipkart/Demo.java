package com.flipkart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo 
{
	WebDriver driver;
	@Test
	  public void a() throws InterruptedException 
	  {
		  
		  //driver.quit();
		  WebElement signIn=driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]"));
		  signIn.click();
		  
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("8951072433");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id='continue' and @type='submit']")).click();
		  Thread.sleep(5000);
		  WebElement pass=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		  pass.sendKeys("jame1996");
		  driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		  Thread.sleep(5000);
		 
	   }
	 @Test
	  public void z() throws InterruptedException
	  {
		  WebElement shopby=driver.findElement(By.xpath("//span[text()='Shop by']"));
		  WebElement echoAlexa=driver.findElement(By.xpath("//span[text()='Echo & Alexa']"));
		  WebElement echoDot=driver.findElement(By.xpath("//span[text()='All-new Echo Dot']"));
		  
		  Actions a=new Actions(driver);
		  a.moveToElement(shopby).build().perform();
		  Thread.sleep(5000);
		  a.moveToElement(echoAlexa).build().perform();
		  Thread.sleep(5000);
		  a.moveToElement(echoDot).build().perform();
		  Thread.sleep(10000);
		  
	   }
	 @Test
	  public void c() throws InterruptedException
	  {
		  WebElement searchDropdown=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		  //searchDropdown.click();
		  Select s=new Select(searchDropdown);
		  s.selectByVisibleText("Books");
		  Thread.sleep(5000);
		  
	   }
	 
	 @Test
     public void orderMobile() throws InterruptedException
     {
      String redrmi="//img[@alt=\"Redmi 6 Pro (Black, 3GB RAM, 32GB Storage)\" and @class=\"s-access-image cfMarker\"]";
      WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
      search.sendKeys("redmi 6 pro phone");
      WebElement submit=driver.findElement(By.xpath("//*[@class=\"nav-input\" and @type=\"submit\"]"));
      submit.click();
      Thread.sleep(5000);

      WebElement mobclick=driver.findElement(By.xpath(redrmi));
      mobclick.click();

      Thread.sleep(10000);
      String parentWindow=driver.getWindowHandle();
      Set<String>allWindow=driver.getWindowHandles();

      for(String curWindow:allWindow)
      {
   	   driver.switchTo().window(curWindow);
      }


      String addToCart="//*[@id=\"add-to-cart-button\"]";
      WebElement clickadd=driver.findElement(By.xpath(addToCart));
      clickadd.click();
      //driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
      Thread.sleep(10000);



      driver.quit();
      


     }
  
 
  @Test(enabled=false)
  public void e() throws InterruptedException
  {
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	  search.sendKeys("formal shoes");
	  WebElement submit=driver.findElement(By.xpath("//*[@class=\"nav-input\" and @type=\"submit\"]"));
	  submit.click();
	  Thread.sleep(5000);
	  WebElement lowprice=driver.findElement(By.xpath("//*[@id=\"low-price\"]"));
	  lowprice.sendKeys("500");
	  Thread.sleep(5000);
	  WebElement highprice=driver.findElement(By.xpath("//*[@id=\"high-price\"]"));
	  highprice.sendKeys("2000");
	  Thread.sleep(5000);
	  WebElement go=driver.findElement(By.xpath("//*[@aria-labelledby=\"a-autoid-4-announce\"]"));
	  go.click();
	  Thread.sleep(5000);
	  
	 
  }
	  
	  
	 // WebElement drop=driver.findElement(By.xpath("//*[@id=\"sort\" and @name=\"sort\"]"));
	  //Select s=new Select(drop);
	  //s.selectByVisibleText("Price:Low to High");
	  

	  @Test(enabled=false)
	  public void cart() throws InterruptedException
	  {
		  WebElement cart=driver.findElement(By.xpath("//*[@class=\"nav-cart-icon nav-sprite\"]"));
		  cart.click();
		  WebElement proceed=driver.findElement(By.xpath("//*[@name=\"proceedToCheckout\"]"));
		  proceed.click();
		  Thread.sleep(5000);
		  //driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("jame1996");
		  //driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		  
		 WebElement edit=driver.findElement(By.xpath("//div[@class=\"a-button a-button-small a-button-span12\"]/span/a"));
		 edit.click(); 
		 Thread.sleep(10000);
		  driver.close();
		  
		//driver.quit();
		  
	  }
	  
	  
	  
	  
  }
 


