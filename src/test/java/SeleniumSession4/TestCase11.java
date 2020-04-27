package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase11 {

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
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='dialogClose']"))));
		driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='fname']"))));
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("sumayaameed");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='devname']"))));
		driver.findElement(By.xpath("//input[@name='devname']"));
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"))));
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"))));
		//driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("//input[@id='srch']"))));
		//driver.findElement(By.id("//input[@id='srch']")).sendKeys("sumaya");
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]"))));
		//driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("AllTab_Tab"))));
		driver.findElement(By.id("AllTab_Tab")).click();
	     
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"))));
		driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='new']"))));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@name,'opp3')]"))));
		driver.findElement(By.xpath("//input[contains(@name,'opp3')]")).sendKeys("sumaya a");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(@class,'lookupInput')]//input[contains(@name,'opp4')]"))));
		driver.findElement(By.xpath("//span[contains(@class,'lookupInput')]//input[contains(@name,'opp4')]")).sendKeys("sumayaabdul");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[contains(text(),'Close Date')]"))));
		driver.findElement(By.xpath("//label[contains(text(),'Close Date')]")).click();
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@name,'opp9')]"))));
		//driver.findElement(By.xpath("//input[contains(@name,'opp9')]")).sendKeys("4/25/2020");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td[contains(@class,'weekend todayDate selectedDate highlight')]"))));
		driver.findElement(By.xpath("//td[contains(@class,'weekend todayDate selectedDate highlight')]")).click();
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'4')]"))));
		//driver.findElement(By.xpath("//a[contains(text(),'4')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
