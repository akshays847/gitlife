package testingdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class newLocator {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		
		driver.get("https://clients.ia.ca/");
		driver.manage().window().maximize();
		
		Assert.assertEquals(findElement(By.cssSelector("h1")).getText(),"My Client Space");
	//	driver.findElement(By.cssSelector("span[class='o-form-input-name-username o-form-control okta-form-input-field input-fix']")).sendKeys("akshaytcs");
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("@19");
		
		
		//driver.findElement(By.id("email")).sendKeys("ritika");
		//driver.findElement(By.id("password")).sendKeys("hello123");
		//driver.findElement(By.name("commit")).click();
		
		//String error = driver.findElement(By.cssSelector("div.inline-error")).getText();
		//System.out.println(error);
		
		//driver.findElement(By.linkText("Forgot Password")).click();
		
		
	//driver.findElement(By.linkText("Sign Up")).click();
	//Thread.sleep(10000);
	
    // WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
     
   //driver.findElement(By.xpath("//a[@href='https://teachable.com/terms-of-service/']")).click();
   
  // driver.findElement(By.cssSelector("button[name='sign_up_method'])")).click();
   
 //  driver.findElement(By.xpath("//div[h3])").g

	
	//driver.findElement(By.xpath(//a[@aria-label="Teachable's Terms of Use"]))
     
     
		 // driver.findElement(By.xpath("//a[@href=‘https://teachable.com/terms-of-service/‘]”).click();
		
	
	
		//driver.findElement(By.linkText("Terms of Use")).click();		
		//driver.findElement(By.xpath("//a/@href=https://teachable.com/terms-of-service/")).click();
	
	
		
	//	driver.findElement(By.cssSelector(a[href="https://teachable.com/terms-of-service/"])).click();
		}

	private static WebElement findElement(By cssSelector) {
		// TODO Auto-generated method stub
		return null;
	} 
	
	

}
