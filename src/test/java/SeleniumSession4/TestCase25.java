package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase25 {

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
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"))));
		driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='dialogClose']"))));
		driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@name,'new')]"))));
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@name,'name_lastcon2')]"))));
		driver.findElement(By.xpath("//input[contains(@name,'name_lastcon2')]")).sendKeys("abdul");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(@class,'lookupInput')]//input[contains(@name,'con4')]"))));
		driver.findElement(By.xpath("//span[contains(@class,'lookupInput')]//input[contains(@name,'con4')]")).sendKeys("sumaya a");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]"))));
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("AllTab_Tab"))));
		driver.findElement(By.id("AllTab_Tab")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"))));
		driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='fname']"))));
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("sumaya a");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='devname']"))));
		driver.findElement(By.xpath("//input[@name='devname']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"))));
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("AllTab_Tab"))));
		driver.findElement(By.id("AllTab_Tab")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"))));
		driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[contains(@name,'hotlist_mode')]"))));
		driver.findElement(By.xpath("//select[contains(@name,'hotlist_mode')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("AllTab_Tab"))));
		driver.findElement(By.id("AllTab_Tab")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"))));
		driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//option[contains(text(),'My Contacts')]"))));
		driver.findElement(By.xpath("//option[contains(text(),'My Contacts')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//option[contains(text(),'sumaya a')]"))));
		driver.findElement(By.xpath("//option[contains(text(),'sumaya a')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='fname']"))));
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("ABCD");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='devname']"))));
		driver.findElement(By.xpath("//input[@name='devname']")).sendKeys("EFGH");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='cancel']"))));
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='cancel']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='newContact']"))));
		driver.findElement(By.xpath("//input[@name='newContact']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@name,'name_lastcon2')]"))));
		driver.findElement(By.xpath("//input[contains(@name,'name_lastcon2')]")).sendKeys("Indian");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(@class,'lookupInput')]//input[contains(@name,'con4')]"))));
		driver.findElement(By.xpath("//span[contains(@class,'lookupInput')]//input[contains(@name,'con4')]")).sendKeys("GlobalMedia");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td[contains(@class,'pbButtonb')]//input[contains(@name,'save_new')]"))));
		driver.findElement(By.xpath("//td[contains(@class,'pbButtonb')]//input[contains(@name,'save_new')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
