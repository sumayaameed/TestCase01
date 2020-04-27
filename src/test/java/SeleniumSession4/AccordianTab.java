package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccordianTab {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shakul\\eclipse-workspace\\SeleniumSession4\\src\\config\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email_field"))));
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password_field"))));
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")))).click();
        
		driver.findElement(By.xpath("//button[contains(text(),'Widget')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Accordian')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Accordian')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Section 1')]"))));
		driver.findElement(By.xpath("//button[contains(text(),'Section 1')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[1]//p[1]")).getText());
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Section 2')]"))));
		driver.findElement(By.xpath("//button[contains(text(),'Section 2')]")).click();
		System.out.println(driver.findElement(By.xpath("//body//div[@id='user_div']//div//div[2]//p[1]")).getText());
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Section 3')]"))));
		driver.findElement(By.xpath("//button[contains(text(),'Section 3')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[3]//p[1]")).getText());
		
		
		
		
		
		
		
		
		
		
	}

}
