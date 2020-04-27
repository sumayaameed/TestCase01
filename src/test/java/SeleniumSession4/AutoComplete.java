package SeleniumSession4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoComplete {

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
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]"))));
         driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]")).click();
         wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("myInput"))));
         driver.findElement(By.id("myInput")).sendKeys("united");
         List <WebElement>ListofCountries=driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
         
         for(int i=0;i<ListofCountries.size();i++)
         {
        	 if(ListofCountries.get(i).getText().contains("United States of America"))
        	 {
        		 ListofCountries.get(i).click();
        	 }
        	 
        	 else {
        		 System.out.println(ListofCountries.get(i).getText());
        	 }
         }
         
         
         
         
         
         
	}

}
