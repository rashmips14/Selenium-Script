package webdriv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\rashmi\\IGA\\Automation\\New Jar files\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("http://elearning.upskills.in");
				driver.manage().window().maximize();
				driver.findElement(By.id("login")).sendKeys("admin");
				driver.findElement(By.id("password")).sendKeys("admin@123");
				driver.findElement(By.name("submitAuth")).click();
				Thread.sleep(3000);
	}
}

			