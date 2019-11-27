package webdriv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\rashmi\\IGA\\Automation\\New Jar files\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://dgsydrbdev01.sl.bluecloud.ibm.com:9443/services/gbl/gdbilling/index.wss");
        driver.manage().window().maximize();
        String Title= driver.getTitle();
        System.out.println(Title);
        driver.findElement(By.id("email")).sendKeys("rashmi.ps@in.ibm.com");
        driver.findElement(By.className("ibm-btn-arrow-pri")).click();
        driver.findElement(By.id("accept")).click();
        Thread.sleep(1000);
        String Expectedtitle="Residual Billing Application :";
        String ActualTitle= driver.getTitle();
        if (Expectedtitle.equals(ActualTitle))
        	System.out.println("actual title");
        else
        {
        	System.out.println("wrong title");
        	driver.findElement(By.id("sign-in-out")).click();
        }
        //driver.findElement(By.id("sign-in-out")).click();
        //driver.close();
        //Thread.sleep(100);
        

        
	}

}
