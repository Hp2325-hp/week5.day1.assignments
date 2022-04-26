package week5.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver driver;//initialization
	
	@BeforeMethod
	public void preCondition()
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//login page
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//next page
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod(enabled=false)
	public void postCondition() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}
}
