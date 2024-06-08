package homeassignmentday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement selectElement = driver.findElement(By.name("selectomatic"));
        Select select = new Select(selectElement);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Account")).click();
		driver.findElement(By.partialLinkText("Creaat")).click();
		driver.findElement(By.id("accountName")).sendKeys("Abc");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		select.selectByVisibleText("S-Corporation");
		select.selectByValue("Employee");
		select.selectByValue("Texas");
		String title=driver.getTitle();
		if (title.contains("Create Account")) {
			System.out.println("Login page verified successfully");
		}
		else {
			System.out.println("Details are not verified");
		}
		driver.close();
	}

}
