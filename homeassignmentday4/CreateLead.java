package homeassignmentday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("hcl");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("aruna");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("devi");
	driver.findElement(By.id("createLeadForm_generalProfileTitle")).sendKeys("TestLeaf");
	driver.findElement(By.xpath("//input[@name='submitButton')]")).click();
	driver.close();
	}
}


