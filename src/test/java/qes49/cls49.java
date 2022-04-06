package qes49;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cls49 {
	
	public static void main(String[] args) {
		//1. How to launch a browser in WebDriver?
		
		//With System.setproperties
		//System.setProperties("webdriver.chrome.driver","Location");
		// With WebDriver Manger 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//2. How to open URL ?
		driver.get("https://www.google.com/");
		
		//3.How to capture Title of the Page?
		String title = driver.getTitle();
		System.out.println(title);
		
		//4.How to capture URL of the Page?
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	
		//5.How to capture page source of the page?
		String PgSource = driver.getPageSource();
		System.out.println(PgSource);
		
		
	}

}
