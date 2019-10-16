package org.Sel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Launch {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\xpath\\driver\\chromedriver.exe" );
		WebDriver d= new ChromeDriver();
		d.get("  http://greenstech.in/selenium-course-content.html ");
		
		
		WebElement course = d.findElement(By.xpath("//a[@class='activeLink']"));
		Actions a= new Actions(d);
	a.moveToElement(course).perform();
	Thread.sleep(3000);
	
	WebElement soft = d.findElement(By.xpath("//span[@text()='Software Testing Training']"));
	Thread.sleep(5000);
	String text = soft.getText();
	System.out.println(text);
	//Actions a1= new Actions(d);
//a.moveToElement(soft).perform();

	
	
	
	}

}
