package week5.day1.assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class CreateContact extends BaseClass{

	@Test(invocationCount=1,priority=1)
	public  void createContact() throws InterruptedException {
	
		System.out.println("Test case 1");
		System.out.println("Create Contact");
		//click contacts
		driver.findElement(By.xpath("//div/a[text()='Contacts']")).click();
		//click create contact
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		//providing first name
		driver.findElement(By.id("firstNameField")).sendKeys("Hari");
		//providing last name
		driver.findElement(By.id("lastNameField")).sendKeys("Prakash");
		//providing first local name
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("HP");
		//providing last local name
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("HP");
		//department
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Supply chain");
		//Description
		driver.findElement(By.id("createContactForm_description")).sendKeys("Working in supply chain Management");
		//mail id 
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Hari@gmkail.com");
		//state selection
		WebElement we=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select s=new Select(we);
		
		s.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//td/input[@name='submitButton']")).click();
		
		driver.findElement(By.xpath("//div/a[text()='Edit']")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("IMPORTANT NOTES");
		
		driver.findElement(By.xpath("//tr//input[@name='submitButton']")).click();
		//get title
		String title=driver.getTitle();
		
		System.out.println(title);
		
	}

}
