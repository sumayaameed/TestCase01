package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToTabs {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shakul\\eclipse-workspace\\SeleniumSession4\\src\\config\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email_field"))));
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password_field"))));
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")))).click();
        
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"))));
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Tabs')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Tabs')]")).click();
		
		
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'London')]"))));
	driver.findElement(By.xpath("//button[contains(text(),'London')]")).click();
	
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[contains(text(),'London')]"))));
	System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'London')]")).getText());
	
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),'London is the capital city of England.')]"))));
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'London is the capital city of England.')]")).getText());
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Paris')]"))));
		driver.findElement(By.xpath("//button[contains(text(),'Paris')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[contains(text(),'Paris')]"))));
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Paris')]")).getText());
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),'Paris is the capital of France.')]"))));
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Paris is the capital of France.')]")).getText());
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Tokyo')]"))));
		driver.findElement(By.xpath("//button[contains(text(),'Tokyo')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[contains(text(),'Tokyo')]"))));
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Tokyo')]")).getText());
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),'Tokyo is the capital of Japan.')]"))));
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Tokyo is the capital of Japan.')]")).getText());
		
        
        
        
        
        
	}

}
