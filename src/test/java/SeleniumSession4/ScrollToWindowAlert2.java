package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollToWindowAlert2 {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shakul\\eclipse-workspace\\SeleniumSession4\\src\\config\\config1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait (driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email_field"))));
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password_field"))));
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")))).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"))));
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Alert')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
		
		//Create an instance of JavaScriptExecutor
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		
		//identify the webelement which will appear after scrolling down.
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[2]"))));
		WebElement element=driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[2]"));
		driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[2]")).click();
		
		//now execute query which actually will scroll until the element is not appeared on page
		
		je.executeScript("argument[0].scrollIntoView(true);",element);
		
		System.out.println(element.getText());
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
