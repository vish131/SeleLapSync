package Week04_Day02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Simple_Test_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		driver.findElementById("email").sendKeys("vish.nike131@gmail.com");
		
		driver.findElementById("pass").sendKeys("XXXXXXXXX");
		
		driver.findElementByXPath("//input[@type='submit']").click();
		Thread.sleep(2000);
		driver.findElementByName("q").sendKeys("TestLeaf");
		Thread.sleep(3000);
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(2000);

		String chkLike = driver.findElementByXPath("(//div[@class='_3ko9'])[2]/span/button").getText();
		System.out.println(chkLike);
		
		if (chkLike.equals("Liked"))
		{
			driver.findElementByXPath("(//div[text()='TestLeaf'])[1]").click();
		}
		else
		{
			driver.findElementByXPath("(//div[@class='_3ko9'])[2]/span/button").click();
			driver.findElementByXPath("(//div[text()='TestLeaf'])[1]").click();
		}
		
		
		driver.findElementByXPath("//span[text()='Reviews']").click();
		Thread.sleep(2000);
		
		String reviewNumber = driver.findElementByXPath("//div[contains(text(),'reviews')]").getText();
		System.out.println(reviewNumber);
		



	}

}
