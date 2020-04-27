package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calculator {

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
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Calculator')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Calculator')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//body//input[10]"))));
		driver.findElement(By.xpath("//body//input[10]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//body//input[5]"))));
		driver.findElement(By.xpath("//body//input[5]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//body//input[11]"))));
		driver.findElement(By.xpath("//body//input[11]")).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//body//input[16]"))));
		driver.findElement(By.xpath("//body//input[16]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
