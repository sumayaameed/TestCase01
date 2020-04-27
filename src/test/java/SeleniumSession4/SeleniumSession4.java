package SeleniumSession4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumSession4 {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shakul\\eclipse-workspace\\SeleniumSession4\\src\\config\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://qa-tekarch.firebaseapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
        driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
        driver.findElement(By.id("password_field")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
        
        driver.findElement(By.xpath("//button[contains(text(),'Widget')]")).click();
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Table')]"))));
        driver.findElement(By.xpath("//a[contains(text(),'Table')]")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),'Table')]"))));
        
		//findelements for all the firstRow
        //here for findelement we use List<WebElements>
        if(driver.findElement(By.xpath("//p[contains(text(),'Table')]")).getText().contains("Table"))
        {
        	System.out.println("Success");
        	
        }
        else {
        	System.out.println("failure");
        }
        List<WebElement>FirstRow=driver.findElements(By.xpath("//tbody//tr[1]"));
        for(int i=0;i<FirstRow.size();i++)
        {
        	System.out.println(FirstRow.get(i).getText());
        }
        List<WebElement>SecondRow=driver.findElements(By.xpath("//tbody//tr[2]"));
        for(int i=0;i<SecondRow.size();i++)
        {
        	System.out.println(SecondRow.get(i).getText());
        }
		
		List<WebElement>ThirdRow=driver.findElements(By.xpath("//tbody//tr[3]"));
		for(int i=0;i<ThirdRow.size();i++)
		{
			System.out.println(ThirdRow.get(i).getText());
		}
		
		List<WebElement>FourthRow=driver.findElements(By.xpath("//tbody//tr[4]"));
		for(int i=0;i<FourthRow.size();i++)
		{
			System.out.println(FourthRow.get(i).getText());
		}
		
		List<WebElement>FifthRow=driver.findElements(By.xpath("//tbody//tr[5]"));
		for(int i=0;i<FifthRow.size();i++)
		{
			System.out.println(FifthRow.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
