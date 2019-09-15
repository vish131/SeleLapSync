package Week04_Day02;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Medium_Test_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElementByClassName("desktop-searchBar").sendKeys("Sunglasses",Keys.ENTER);
		
		Thread.sleep(2000);
		
		//Get Brand uniq name
		List<WebElement> list1 = driver.findElementsByXPath("//ul[@class='results-base']/li");
		Set<String> uniqueBrands =new LinkedHashSet<String>(); //No duplicate value, order remains same
		for(int i=1;i<list1.size()-1;i++) {				
			uniqueBrands.add(driver.findElementByXPath("//ul[@class='results-base']/li["+i+"]/a/div/div").getText());
		}
		System.out.println("Please find the below Uniq brand names");
		for(String s1:uniqueBrands) {
			System.out.println(s1);
		}
		
		//get count 40% dicount
	 /*WebElement listfrty = driver.findElementByXPath("//span[text()='(40% OFF)']");
	 Dimension countProduct = listfrty.getSize();
	System.out.println(countProduct);*/
		List<WebElement> listfrty = driver.findElementsByXPath("//span[text()='(40% OFF)']");
		System.out.println("count of the sunglasses with 40% discounts : "+ listfrty.size());
	
		//get count for unisex
		List<WebElement> getUnisex = driver.findElementsByXPath("//h4[contains(text(),'Unisex')]");
		System.out.println("count of the product those are Unisex : "+ getUnisex.size());
		
		//click green color
		driver.findElementByXPath("//li[@data-colorhex='green']").click();
		//click second listed product
		driver.findElementByXPath("(//li[@class='product-base'])[2]").click();
		
	// get title, price, add to bag & go to bag
		String titleName = driver.findElementByClassName("pdp-title").getText();
		String priceTag = driver.findElementByClassName("pdp-price").getText();
		System.out.println("Find the Title and Price of the product below :");
		System.out.println(titleName);
		System.out.println(priceTag);
		driver.findElementByXPath("//span[text()='ADD TO BAG']").click();
		driver.findElementByClassName("desktop-cart").click();
		System.out.println("Product is added to bag for check out");
		
//verify title and price
		String verifyTitle = driver.findElementByClassName("c-gray").getText();
		String verifyPrice = driver.findElementByXPath("//div[@class='c-dblue total-rupees']").getText();
	if(verifyTitle.equals(titleName)) {System.out.println("Title verify Status : Title Verified");}
	if(verifyPrice.equals(priceTag)) {System.out.println("Price Tag verify Status : Price Tag Verified");}
	
	System.out.println("The shopping process is verified its time for conform the order");
	
	/*//my workshop
	driver.findElementByXPath("(//span[text()='Apply Coupon'])[2]").click();
	driver.findElementByXPath("//span[text()='MYNTRANEWW500']").click();
	driver.findElementByXPath("//button[@type='submit']").click();
	Thread.sleep(3000);
	driver.findElementByXPath("//button[text()='PLACE ORDER']").click();
	Thread.sleep(3000);*/
	driver.close();
	}

}
