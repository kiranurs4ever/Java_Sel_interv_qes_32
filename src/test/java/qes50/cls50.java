package qes50;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cls50 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/register");
		
		// Is Displayed or not
		// Is Enabled or not
	WebElement Name	= driver.findElement(By.xpath("//input[@id='FirstName']"));
	System.out.println("IS Displayed or Not "+ Name.isDisplayed());
	System.out.println("IS Enabled or Not "+ Name.isEnabled());
		
	WebElement lable = driver.findElement(By.xpath("//label[contains(text(),'I would like to receive newsletters:')]"));
	System.out.println("Lable check box " + lable.isSelected());
	//lable.click();
	driver.findElement(By.xpath("//label[contains(text(),'I would like to receive newsletters:')]")).click();
	Thread.sleep(5000);
	System.out.println("Lable check box " + lable.isSelected());
	}

}
