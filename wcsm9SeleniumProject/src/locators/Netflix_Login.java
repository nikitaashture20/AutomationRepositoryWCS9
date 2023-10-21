package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Netflix_Login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		driver.findElement(By.id("id_userLoginId")).sendKeys("nikitaashture@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("nikita"); 
		Thread.sleep(2000);
		driver.close();
	}

}
