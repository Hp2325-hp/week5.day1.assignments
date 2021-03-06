package week5.day1.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class EditLead extends BaseClass{

	@Test(priority=5)
	public void editLead() throws InterruptedException {

		System.out.println("Test case 5");
		System.out.println("Edit Lead");
		//click leads
		driver.findElement(By.xpath("//div/a[text()='Leads']")).click();

		driver.findElement(By.xpath("//div//a[text()='Find Leads']")).click();
		Thread.sleep(2000);

		// Enter first name
		driver.findElement(By.xpath("//div[contains(@class,'x-tab-item')]//input[@name='firstName']")).sendKeys("HP");

		// Click Find leads button
		driver.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		Thread.sleep(2000);

		// Click on first resulting lead
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).click();
		Thread.sleep(2000);

		// Verify title
		String title = driver.getTitle();
		System.out.println(title);

		// Click Edit
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
		Thread.sleep(2000);

		String changecompanyname = "TCS";
		driver.findElement(By.xpath("//td/input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//td/input[@id='updateLeadForm_companyName']")).sendKeys(changecompanyname);
		// Click Update
		driver.findElement(By.name("submitButton")).click();

		// Confirm the changed name appears
		String company_name = driver.findElement(By.xpath("//td/span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(company_name);

		int length = changecompanyname.length();
		String temp = company_name.substring(0, length);
		company_name = temp;
		//verify the company is same or not
		if (company_name.equals(changecompanyname))
			System.out.println("Same company name");
		else
			System.out.println("Not same");

	}

}
