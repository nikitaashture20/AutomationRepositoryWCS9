package methodsofWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles_method {

	public static void main(String[] args) {

     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://omayo.blogspot.com");
     driver.findElement(By.partialLinkText("Open a popup window")).click();
     String ParentHandle = driver.getWindowHandle();
     System.out.println("ParentHandle :" + ParentHandle);
     
     Set<String> allHandles = driver.getWindowHandles();
    
     for(String wh : allHandles)
     {
    	 if(!ParentHandle.equals(wh))
    	 {
    		 System.out.println("Address of Child Window :" + wh);
    	 }
    	 else
    	 {
    		 System.out.println("Address of Parent Window :" + wh);
    	 }
     }
     
     driver.quit();
	}
	

}


