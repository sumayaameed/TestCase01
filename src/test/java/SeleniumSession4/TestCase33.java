package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase33 {

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
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'sumaya a')]"))));
        driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'sumaya a')]")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("home_Tab"))));
		driver.findElement(By.id("home_Tab")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("AllTab_Tab"))));
		driver.findElement(By.id("AllTab_Tab")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@name,'customize')]"))));
		driver.findElement(By.xpath("//input[contains(@name,'customize')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//option[contains(text(),'Accounts')]"))));
		driver.findElement(By.xpath("//option[contains(text(),'Accounts')]")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]"))));
		driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td[contains(@class,'pbButtonb')]//input[contains(@name,'save')]"))));
		driver.findElement(By.xpath("//td[contains(@class,'pbButtonb')]//input[contains(@name,'save')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='userNavLabel']"))));
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='username']"))));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sumaya.abdul@salesforce.com");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='password']"))));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin@123");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='Login']"))));
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("home_Tab"))));
		driver.findElement(By.id("home_Tab")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='dialogClose']"))));
		driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("AllTab_Tab"))));
		driver.findElement(By.id("AllTab_Tab")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@name,'customize')]"))));
		driver.findElement(By.xpath("//input[contains(@name,'customize')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
