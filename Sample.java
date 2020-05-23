package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Sample {
	public static void main(String[] args) {
		//to configure webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthic\\eclipse-workspace\\OnlineSelenium\\driver83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//To launch the browser
		driver.get("https://www.facebook.com/");
		//To get the current url
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		//String title = driver.getTitle();
		//System.out.println(title);
	//	WebElement txtuser = driver.findElement(By.id("email"));
		//txtuser.sendKeys("green@gmail.com");
		//WebElement txtpass = driver.findElement(By.id("pass"));
		//txtpass.sendKeys("java");
		//WebElement txtuser = driver.findElement(By.name("email"));
		//txtuser.sendKeys("viji@gmail.com");
		//WebElement txtpass = driver.findElement(By.name("pass"));
		//txtpass.sendKeys("advik");
		WebElement txtuser = driver.findElement(By.xpath("//input[@type='email']"));
		txtuser.sendKeys("viji@gmail.com");
		WebElement txtpass = driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]"));
	    txtpass.sendKeys("java");	
	    WebElement btnlogin = driver.findElement(By.xpath("//input[@value='Log In']"));
	    btnlogin.click();
	   // driver.close();
	    //driver.quit();
	    
	}

}
