package Week04_Day02;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FlipkartComplex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		ChromeOptions cls = new ChromeOptions();
		cls.addArguments("--diable-notifications");
		Thread.sleep(9000);
//driver.findElementByClassName("_2AkmmA _29YdH8").click(); //not working
		//driver.findElementByXPath("//div[@class='_3Njdz7']/button").click(); //not working

WebElement optTvsapp = driver.findElementByXPath("//span[text()='TVs & Appliances']");
Actions builder = new Actions (optTvsapp);
builder.moveToElement(optTvsapp);
Thread.sleep(2000);

driver.findElementByXPath("(//span[text()='Samsung'])[2]").click();




		
		
	}

}
