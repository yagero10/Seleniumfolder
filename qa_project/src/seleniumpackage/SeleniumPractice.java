package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the web page http://jqueryui.com/droppable/	
		browserObject.get("https://training.qaonlinetraining.com/testPage.php");
		browserObject.findElement(By.name("name")).sendKeys("Agbo");
		browserObject.findElement(By.name("email")).sendKeys("guerier95@yahoo.fr");
		browserObject.findElement(By.name("website")).sendKeys("www.google.com");
		browserObject.findElement(By.name("comment")).sendKeys("This is great");
		browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
		browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	    browserObject.findElement(By.xpath("/html/body/form/input[6]")).click();
		
	}

}
