package Week04Day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass01 {

	public static void main(String[] args) throws InterruptedException {
				
				
				//dragAndDropBy//
				//Launch Browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://jqueryui.com/draggable/");
				WebElement jframe = driver.findElementByClassName("demo-frame");
				driver.switchTo().frame(jframe);
				
				//locating dragger
				WebElement dragger = driver.findElementByXPath("//p[text()='Drag me around']");
				Actions builder = new Actions(driver);
				builder.dragAndDropBy(dragger, 100, 100).perform();
				
				Thread.sleep(5000);
				driver.quit();
				
				
				//Droppable
					
				//Launch Browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver1 = new ChromeDriver();
				driver1.manage().window().maximize();
				
				driver1.get("https://jqueryui.com/droppable/");
				WebElement droppable = driver1.findElementByClassName("demo-frame");
				driver1.switchTo().frame(droppable);
				
				WebElement draggerTwo = driver1.findElementByXPath("//p[text()='Drag me to my target']");
				WebElement dropperTwo = driver1.findElementByXPath("//p[text()='Drop here']");
				Actions builderTwo = new Actions(driver1);
				builderTwo.dragAndDrop(draggerTwo,dropperTwo).perform();
				
				Thread.sleep(5000);
				driver1.quit();
				
				
				//Resizable
				
				//Launch Browser
//				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//				ChromeDriver driver2 = new ChromeDriver();
//				driver2.manage().window().maximize();
//				
//				driver2.get("https://jqueryui.com/resizable/");
//				WebElement resizable = driver2.findElementByClassName("demo-frame");
//				driver2.switchTo().frame(resizable);
				
				
				
				
				//Selectable
				//Launch browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver3 = new ChromeDriver();
				driver3.manage().window().maximize();
				
				driver3.get("https://jqueryui.com/selectable/");
				WebElement Selectable = driver3.findElementByClassName("demo-frame");
				driver3.switchTo().frame(Selectable);
				
				WebElement itemTwo = driver3.findElementByXPath("//li[text()='Item 2']");
				WebElement itemFour = driver3.findElementByXPath("//li[text()='Item 4']");
				WebElement itemSix = driver3.findElementByXPath("//li[text()='Item 6']");
				Actions builderfour = new Actions(driver3);
				
				builderfour.keyDown(Keys.CONTROL).click(itemTwo).click(itemFour).click(itemSix).keyUp(Keys.CONTROL).perform();
				
				Thread.sleep(5000);
				driver3.quit();
				
				
	}

}
