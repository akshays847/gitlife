package testingdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaDemo  {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chromedriver.chromium.org/downloads");
		String test = driver.getTitle();
		
		
		System.out.println(test);
		driver.close();
	}

}
