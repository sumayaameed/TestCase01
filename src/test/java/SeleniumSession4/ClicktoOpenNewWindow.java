package SeleniumSession4;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClicktoOpenNewWindow {

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
		
	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Windows')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[2]//button[1]"))));
		driver.findElement(By.xpath("//a[2]//button[1]")).click();
		ArrayList WindowTabs=new ArrayList(driver.getWindowHandles());
		System.out.println(WindowTabs.size());
		driver.switchTo().window((String)(WindowTabs).get(1));
		driver.get("https://www.yahoo.com");
		driver.close();
		driver.switchTo().window((String)(WindowTabs).get(0));
		System.out.println(driver.findElement(By.xpath("//a[2]//button[1]")).getText());
		
		
		

	}

}
