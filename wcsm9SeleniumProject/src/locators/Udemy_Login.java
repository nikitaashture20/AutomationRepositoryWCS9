package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Udemy_Login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F%3Fdeal_code%3D%26utm_term%3DHomepage%26utm_content%3DTextlink%26utm_campaign%3DRakuten-default%26ranMID%3D39197%26ranEAID%3DUGrHaPSUfM0%26ranSiteID%3DUGrHaPSUfM0-pFv6ijI1ysEyx7p6nEy.YQ%26LSNPUBID%3DUGrHaPSUfM0%26utm_source%3Daff-campaign%26utm_medium%3Dudemyads");
		driver.findElement(By.id("form-group--1")).sendKeys("nikitaashture@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.id("form-group--3")).sendKeys("nikita"); 
		Thread.sleep(2000);
		driver.close();

	}

}
