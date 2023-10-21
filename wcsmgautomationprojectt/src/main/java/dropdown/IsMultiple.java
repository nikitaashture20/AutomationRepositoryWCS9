package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMultiple {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		
		//implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.findElement(By.id("name")).sendKeys("admin");
		 driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		
		 

	}

}
