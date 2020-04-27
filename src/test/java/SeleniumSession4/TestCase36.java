package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase36 {

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
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='dialogClose']"))));
		driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Sunday April 26, 2020')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Sunday April 26, 2020')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'8:00 AM')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'8:00 AM')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]"))));
		driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]")).click();
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='dialogClose']"))));
		//driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//body//li[5]"))));
		driver.findElement(By.xpath("//body//li[4]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//tr[3]//td[3]//label[1]"))));
		driver.findElement(By.xpath("//tr[3]//td[3]//label[1]")).click();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
