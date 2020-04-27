package SeleniumSession4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shakul\\eclipse-workspace\\SeleniumSession4\\src\\config\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,50);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"))));
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='DayPicker-Day]//p[contains(text(),'25')]"))));
		 driver.findElement(By.xpath("//div[@class='DayPicker-Day]//p[contains(text(),'25')]")).click();
		 
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='25 Apr 20']"))));
		 driver.findElement(By.xpath("//span[text()='25 Apr 20']")).click();
		 System.out.println(driver.findElement(By.xpath("//span[text()='25 Apr 20']")).getText());
		

	}

}
