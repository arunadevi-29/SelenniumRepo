package homeassignmentday3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		
		
		driver.findElement(By.name("firstname")).sendKeys("Aruna");
		
		driver.findElement(By.name("lastname")).sendKeys("Devi");
		
		driver.findElement(By.name("reg_email__")).sendKeys("arunadevi@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("arunadevi@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("aruna@123");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("29");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("may");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2000");
		
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}



	}

