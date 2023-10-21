package methodsofWebDriver;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		Dimension targetSize = new Dimension(350,450);
		//driver.manage().window().setSize(targetSize);
		Thread.sleep(2000);
		
		Point targetPosition = new Point(450,230);
		//driver.manage().window().setPosition(targetPosition);
		driver.close();

	}

}
