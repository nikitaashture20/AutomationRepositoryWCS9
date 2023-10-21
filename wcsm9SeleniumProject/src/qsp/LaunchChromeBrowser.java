package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); //UPCASTING
		System.out.println("Chrome is open!!");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.close();
		System.out.println("Chrome is closed");

	}

}
