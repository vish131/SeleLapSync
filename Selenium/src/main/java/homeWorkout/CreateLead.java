package homeWorkout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//Options and Tabs
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		//filling basic details
		driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");
		driver.findElementById("createLeadForm_firstName").sendKeys("Dhoni");
		driver.findElementById("createLeadForm_lastName").sendKeys("MS");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("987654321");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("csk@gmail.com");
		
		Thread.sleep(3000);
		WebElement sourceList = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(sourceList);
		dd.selectByVisibleText("Existing Customer");
		Thread.sleep(3000);
//		WebElement marketing = driver.findElementById("marketingCampaignId");
//		Select dd2 = new Select(marketing);
//		dd2.selectByVisibleText("Automobile");
//		
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		driver.quit();
		
		//Learn How to select DOB
	}

}
