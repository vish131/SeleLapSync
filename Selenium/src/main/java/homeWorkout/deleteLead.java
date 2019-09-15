package homeWorkout;

import org.openqa.selenium.chrome.ChromeDriver;

public class deleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//Options and Tabs
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Phone").click();
		driver.findElementByName("phoneNumber").sendKeys("987654321");
		Thread.sleep(3000);
		//click find Lead
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//get Lead ID for first result and click the result
		
		Thread.sleep(3000);
		String outputResult = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println(outputResult);
		//wait
		Thread.sleep(3000);
				
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
		Thread.sleep(3000);
		//click delete
		driver.findElementByLinkText("Delete").click();
		//driver.findElementByClassName("subMenuButtonDangerous").click();
		//driver.findElementByXPath("//a[text()='Delete']").click();
		
		Thread.sleep(3000);
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='id']").sendKeys(outputResult);
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		//verify error message
		String noRecord = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(noRecord);
		Thread.sleep(3000);
		
		if (noRecord.equals("No records to display")){
			System.out.println("Record Deleted");
		}
		else
		{ System.out.println("Not Deleted");
		}
		driver.quit();
		}
}


