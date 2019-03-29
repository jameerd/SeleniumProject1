package com.amazonproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonProject {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-selenium\\DataDrivenFrameWork\\src\\com\\amazon\\utilites\\amazon.properties");
        
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String emaildata=p.getProperty("emaildata");
		String passdata=p.getProperty("passdata");
		String signInButton=p.getProperty("signInButton");
		String email=p.getProperty("email");
		String emailSubmit=p.getProperty("emailSubmit");
		String pass=p.getProperty("pass");
		String signIn=p.getProperty("signIn");
		
		String shopby=p.getProperty("shopby");
		String echoAlexa=p.getProperty("echoAlexa");
		String echoDot=p.getProperty("echoDot");
		String addTocart1=p.getProperty("addTocart1");
		

		String book=p.getProperty("book");
		String search=p.getProperty("search");
		String submit=p.getProperty("submit");
		String addTocart2=p.getProperty("addTocart2");
		
		
		String shopbymobile=p.getProperty("shopbymobile");
		String mobiles=p.getProperty("mobiles");
		String allmobiles=p.getProperty("allmobiles");
		String sumsungCheckbox=p.getProperty("sumsungCheckbox");
		String lowprice=p.getProperty("lowprice");
		String highprice=p.getProperty("highprice");
		String gobutton=p.getProperty("gobutton");
		String mobclick=p.getProperty("mobclick");
		String addtocart3=p.getProperty("addtocart3");
		
		String hellobutton=p.getProperty("hellobutton");
		String signout=p.getProperty("signout");
		
		
		//login code
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		WebElement signInbutton=driver.findElement(By.xpath(signInButton));
		signInbutton.click();
		  
		  Thread.sleep(1000);
		  WebElement email1=driver.findElement(By.xpath(email));
		  email1.sendKeys(emaildata);
		  Thread.sleep(1000);
		  WebElement submit1=driver.findElement(By.xpath(emailSubmit));
		  submit1.click();
		  Thread.sleep(1000);
		  WebElement pass1=driver.findElement(By.xpath(pass));
		  pass1.sendKeys(passdata);
		  WebElement sign=driver.findElement(By.xpath(signIn));
		  sign.click();
		  Thread.sleep(1000);
		  
		  //echoAlexa addtocart
		  WebElement shopby1=driver.findElement(By.xpath(shopby));
		  WebElement echoAlexa1=driver.findElement(By.xpath(echoAlexa));
		  WebElement echoDot1=driver.findElement(By.xpath(echoDot));
		  
		  Actions a=new Actions(driver);
		  a.moveToElement(shopby1).build().perform();
		  Thread.sleep(1000);
		  a.moveToElement(echoAlexa1).build().perform();
		  Thread.sleep(1000);
		  a.moveToElement(echoDot1).build().perform();
		  Thread.sleep(1000);
		  echoDot1.click();
		  
		  driver.findElement(By.xpath(addTocart1)).click();
		  Thread.sleep(4000);
		  
		  //order book add to cart

		   //String book="//*[text()=\"Wings of Fire: An Autobiography of Abdul Kalam\"]";
		   WebElement search1=driver.findElement(By.xpath(search));
		   search1.sendKeys("apj abdul kalam biography in english");
		   WebElement submit2=driver.findElement(By.xpath(submit));
		   submit2.click();
		   Thread.sleep(1000);

		   WebElement bookclick=driver.findElement(By.xpath(book));
		   bookclick.click();

		   Thread.sleep(5000);
		   String parentWindow=driver.getWindowHandle();
		   Set<String>allWindow=driver.getWindowHandles();

		   for(String curWindow:allWindow)
		   {
			   driver.switchTo().window(curWindow);
		   }

		   
		   WebElement clickadd=driver.findElement(By.xpath(addTocart2));
		   clickadd.click();
		   Thread.sleep(5000);
		   driver.close();
		   driver.switchTo().window(parentWindow);
		   Thread.sleep(5000);
		   
		   
		   //mobile order addto cart

			  WebElement shopbymobile1=driver.findElement(By.xpath(shopbymobile));
			  WebElement mobiles1=driver.findElement(By.xpath(mobiles));
			  WebElement allmobiles1=driver.findElement(By.xpath(allmobiles));
			  
			  Actions a1=new Actions(driver);
			  a1.moveToElement(shopbymobile1).build().perform();
			  Thread.sleep(5000);
			  a1.moveToElement(mobiles1).build().perform();
			  Thread.sleep(5000);
			  a1.moveToElement(allmobiles1).build().perform();
			  Thread.sleep(4000);
			  allmobiles1.click();
			 
			  WebElement sumcheck=driver.findElement(By.xpath(sumsungCheckbox));
			  sumcheck.click();
			  
			 WebElement lowprice1=driver.findElement(By.xpath(lowprice));
			  lowprice1.sendKeys("500");
			  Thread.sleep(1000);
			  WebElement highprice1=driver.findElement(By.xpath(highprice));
			  highprice1.sendKeys("2000");
			  Thread.sleep(1000);
			  WebElement go=driver.findElement(By.xpath(gobutton));
			  go.click();
			  Thread.sleep(1000);
			  
			  WebElement mob=driver.findElement(By.xpath(mobclick));
			  mob.click();
			  Thread.sleep(5000);
			  
			  String parentWindow1=driver.getWindowHandle();
			  System.out.println(parentWindow1);
			   Set<String>allWindow1=driver.getWindowHandles();
		      
			   for(String curWindow1:allWindow1)
			   {
				   driver.switchTo().window(curWindow1);
				   System.out.println(curWindow1);
			   }
			  driver.findElement(By.xpath(addtocart3)).click();//add cart
			  Thread.sleep(5000);
			  driver.close();
			  driver.switchTo().window(parentWindow);
			  Thread.sleep(5000);
			  
			  //sign out
			  WebElement hello=driver.findElement(By.xpath(hellobutton));
			  WebElement signout1=driver.findElement(By.xpath(signout));
			  
			 
			  
			  Actions a3=new Actions(driver);
			  a3.moveToElement(hello).build().perform();
			  
			  Thread.sleep(5000);
			  a3.moveToElement(signout1).build().perform();
			  signout1.click();
			  Thread.sleep(5000);
			  driver.quit();
			  
		   
		}

}
