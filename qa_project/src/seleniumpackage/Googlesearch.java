package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
				// 2. Initialize Webdriver object through ChromeDriver class. 
			        ChromeDriver browserObject = new ChromeDriver();
				// 3. Open the http://www.amazon.com/ link using get method.
			        browserObject.get("http://www.google.com");
			        browserObject.findElement(By.name("q")).sendKeys("Selenium search");
			        browserObject.findElement(By.name("btnK")).click();
	}

}
