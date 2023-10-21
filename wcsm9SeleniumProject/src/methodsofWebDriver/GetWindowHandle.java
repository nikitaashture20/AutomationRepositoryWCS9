package methodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
