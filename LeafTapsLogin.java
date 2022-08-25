package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {
	
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			String text=driver.findElement(By.tagName("h2")).getText();
			System.out.println(text);
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("test leaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sowmiya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("miya");
			//driver.findElement(By.className("smallSubmit")).click();
		    
		   // driver.findElement(By.id(text))
		    

			
		}

	}



