package testingdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "rahul";
		
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String password = getPassword(driver);
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());
		
		Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(), "You are successfully logged in.");
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Hello "+name+"," ) ;

	}
     public static String getPassword(WebDriver driver) throws InterruptedException {
    	 
    	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
    		driver.findElement(By.linkText("Forgot your password?")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.className("reset-pwd-btn")).click();
    		
    		String passwordText = driver.findElement(By.cssSelector("form p")).getText();	
    		
    		String [] passwordArray = passwordText.split("'");
    		
    		String [] passwordArray1 = passwordArray[1].split("'");
    		String password = passwordArray1[0];
    		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
    		
    		return password;
    		
     }
}
