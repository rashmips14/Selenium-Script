package webdriv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\rashmi\\IGA\\Automation\\New Jar files\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		WebElement UN = driver.findElement(By.name("userName"));
				if(UN.isEnabled())
					{
			UN.sendKeys("abhay");
			Thread.sleep(3000);
			UN.clear();
			UN.sendKeys("abhay");
		}
				if(driver.findElement(By.name("userName")).isDisplayed())
				{
				String name= UN.getAttribute("value");
				System.out.println("this will get attribute of " +name);
				String name1=UN.getAttribute("name");
				String label1 = driver.findElement(By.xpath("//*[contains(text(),'User')]")).getText();
				System.out.println(label1);
				driver.findElement(By.name(name1)).clear();
				
				System.out.println("this will get attribute of " +name1);
				//System.out.println(UN.getAttribute("value"));
				}
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.name("login")).click();
					
		
	}

}
