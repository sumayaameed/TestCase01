package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase13 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shakul\\eclipse-workspace\\SeleniumSession4\\src\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com//");
		driver.manage().window().maximize();
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait
		WebDriverWait wait = new WebDriverWait(driver, 30);// explicit wait
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='username']"))));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sumaya.abdul@salesforce.com");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='password']"))));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin@123");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='Login']"))));
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("home_Tab"))));
		driver.findElement(By.id("home_Tab")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("AllTab_Tab"))));
		driver.findElement(By.id("AllTab_Tab")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]"))));
		driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]")).click();
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='fname']"))));
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("new accountname");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@name='fcol1']//option[contains(text(),'Account Name')]"))));
		driver.findElement(By.xpath("//select[@name='fcol1']//option[contains(text(),'Account Name')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@name='fop1']//option[contains(text(),'contains')]"))));
		driver.findElement(By.xpath("//select[@name='fop1']//option[contains(text(),'contains')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='fval1']"))));
		driver.findElement(By.xpath("//input[@name='fval1']")).sendKeys("a");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='fval1']"))));
		driver.findElement(By.xpath("//input[@name='fval1']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
