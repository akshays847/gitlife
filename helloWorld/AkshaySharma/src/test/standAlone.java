package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class standAlone {

	public static void main(String[] args) {
	
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.findElement(By.id("userEmail")).sendKeys("ak@yahoo.com");
		
		driver.findElement(By.id("userPassword")).sendKeys("Welcome1");
		
		driver.findElement(By.id("login")).click();
		driver.manage().window().maximize();
		List<WebElement> products = driver.findElements(By.className(".mb-3"));
		
		WebElement prod = products.stream().filter(product ->product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		
		prod.findElement(null);
				
			}
		

	}


