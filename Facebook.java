package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sowmiya");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("sowmiyakumar@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sowmiyakumar@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("sri123@4");
		WebElement birthday = driver.findElement(By.name("birthday_day"));
		Select dd1=new Select(birthday);
		dd1.selectByVisibleText("20");
		WebElement birthMonth = driver.findElement(By.name("birthday_month"));
		Select dd2=new Select(birthMonth);
		dd2.selectByVisibleText("Mar");
		WebElement birthYear = driver.findElement(By.name("birthday_year"));
		Select dd3=new Select(birthYear);
		dd3.selectByVisibleText("2002");
		driver.findElement(By.name("sex")).click();
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
