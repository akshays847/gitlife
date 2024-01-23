package testingdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulShettyAcademy {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahul00shettyacademy");
		
		//driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("JOGN");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@rsa.com");
		
		//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0898898");
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//driver.findElement(By.className("go-to-login-btn")).click();
		
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		
		
		

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		
		
		
		
		
			
		
		
		
		
		
	
			
		
		
		
		
		
		
	}
     
	
	
}
