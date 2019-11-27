package webdriv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\rashmi\\IGA\\Automation\\New Jar files\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		if (driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected());
		{
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
			WebElement DD =driver.findElement(By.name("passCount"));
			Select sel =new Select(DD);
			sel.selectByVisibleText("4");
					
		}
	}

}
