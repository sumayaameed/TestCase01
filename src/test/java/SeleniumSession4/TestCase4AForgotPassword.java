package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase4AForgotPassword {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shakul\\eclipse-workspace\\SeleniumSession4\\src\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com//");
		driver.manage().window().maximize();
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait
		WebDriverWait wait = new WebDriverWait(driver, 30);// explicit wait
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='forgot_password_link']"))));
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='un']"))));
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("sumaya.abdul@salesforce.com");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='continue']"))));
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		
	
		

	}

}
