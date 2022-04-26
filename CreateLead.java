package week5.day1.assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass{

	@Test(priority=2)
	public void createLeads() throws InterruptedException {
		
		System.out.println("Test case 2");
		System.out.println("Create Lead");
		//select leads
		driver.findElement(By.linkText("Leads")).click();
		//click create leads
		driver.findElement(By.linkText("Create Lead")).click();
		//providing company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Nortingam");
		//provide first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bala");
		//provide last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Soorya");
		//provide local first name
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bala");
		//provide local last name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Supply chain");
		//description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Bala, Working in supply chain Management");
		//mail id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Bala@soorya.com");
		//state selection
		WebElement we=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select s=new Select(we);
		
		s.selectByVisibleText("New York");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submitButton")).click();
		//get title
		String title=driver.getTitle();
		
		System.out.println(title);
		
	}

}
