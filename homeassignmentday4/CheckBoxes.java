package homeassignmentday4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//div[.='Basic']")).click();
		driver.findElement(By.xpath("//div[.'Ajax']")).click();
		WebElement notificationsmsg = driver.findElement(By.xpath("//div[.'Checked']"));
		System.out.println(notificationsmsg.getText());
		driver.findElement(By.xpath("//label[.='java']")).click();
		driver.findElement(By.xpath("//h5[.='Tri State Checkbox']/following::div[3]")).click();
		WebElement tristatevalue = driver.findElement(By.xpath("//div[@class='ui-growl-message']/following::p"));
		System.out.println(tristatevalue.getText());
		driver.findElement(By.xpath("//div[@class='ui-toogleswitch-slider']")).click();
		Boolean isselected = driver.findElement(By.xpath("//span[.'Displayed']")).isSelected();
		System.out.println(isselected);
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-muultiple')]")).click();
		driver.close();
		
				
	}

}
