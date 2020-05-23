package org.test.devops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDevops {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthic\\eclipse-workspace\\OnlineSelenium\\driver83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtuser = driver.findElement(By.xpath("//input[@type='email']"));
		txtuser.sendKeys("viji@gmail.com");
		
		WebElement txtpass = driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]"));
	    txtpass.sendKeys("java");	
	   
	    WebElement btnlogin = driver.findElement(By.xpath("//input[@value='Log In']"));
	    btnlogin.click();
	   
	}
}
