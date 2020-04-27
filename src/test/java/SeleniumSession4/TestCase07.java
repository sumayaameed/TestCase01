package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase07 {

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
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='userNavLabel']"))));
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"))));
		driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='LoginHistory_font']"))));
		driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
		Thread.sleep(4000);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"))));
		driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"))));
		driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"))));
		driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@name='p4']"))));
		driver.findElement(By.xpath("//select[@name='p4']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[contains(text(),'Available Tabs')]"))));
		driver.findElement(By.xpath("//label[contains(text(),'Available Tabs')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//option[contains(text(),'Reports')]"))));
		driver.findElement(By.xpath("//option[contains(text(),'Reports')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@class='rightArrowIcon']"))));
		driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//body/div/div/table/tbody/tr/td/div/div/div[4]/a[1]"))));
		driver.findElement(By.xpath("//body/div/div/table/tbody/tr/td/div/div/div[4]/a[1]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'My Email Settings')]"))));
		driver.findElement(By.xpath("//span[contains(text(),'My Email Settings')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='sender_name']"))));
		driver.findElement(By.xpath("//input[@name='sender_name']")).sendKeys("sumaya a");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='sender_email']"))));
		driver.findElement(By.xpath("//input[@name='sender_email']")).sendKeys("sumayaa23@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//tr[7]//td[2]//div[1]//input[1]"))));
		driver.findElement(By.xpath("//tr[7]//td[2]//div[1]//input[1]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='save']"))));
		driver.findElement(By.xpath("//input[@name='save']")).click();
	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'Calendar & Reminders')]"))));
		driver.findElement(By.xpath("//span[contains(text(),'Calendar & Reminders')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'Activity Reminders')]"))));
		driver.findElement(By.xpath("//span[contains(text(),'Activity Reminders')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='test']"))));
		driver.findElement(By.xpath("//input[@name='test']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
