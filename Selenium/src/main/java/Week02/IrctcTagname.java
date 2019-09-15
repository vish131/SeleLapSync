package Week02;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcTagname {

	public static void main(String[] args) {

		//Driver:
				System.setProperty("webDriver.chrome.driver",".drivers/chromedriver.exe" );
				ChromeDriver driver1 = new ChromeDriver();
				
				//Launch browser and enter the url:
				driver1.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
				driver1.manage().window().maximize();
				//driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				List<WebElement> tag = driver1.findElementsByTagName("a");
				System.out.println(tag.size());
				
				//for (WebElement : tag) {
				
				for (WebElement : tag) {

	}

}
