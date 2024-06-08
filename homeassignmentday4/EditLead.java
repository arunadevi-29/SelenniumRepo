package homeassignmentday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("mca");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("SeleniiumWebAutomation");
		driver.findElement(By.id("createLeadForm_email")).sendKeys("ggarunadevitdr00@gmail.com");
		WebElement ele = driver.findElement(By.id("createLeadForm generalStateProvinceGeoId"));
		Select state = new Select(ele);
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenium WebAutomatio");
		driver.findElement(By.xpath("//input[@value='update']")).click();
		String title = driver.findElement(By.id("viewLead_generalProfileTitle_sp")).getText();
		System.out.println(title);
		driver.close();
	}

}
