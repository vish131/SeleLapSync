package homeWorkout;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		
		//click email
		driver.findElementByLinkText("Email").click();
		driver.findElementByName("emailAddress").sendKeys("csk@gmail.com");
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(6000);
		//get name
		String firstnameresult = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		System.out.println(firstnameresult);
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		
		Thread.sleep(3000);
		//duplicate Lead
		driver.findElementByLinkText("Duplicate Lead").click();
		
		Thread.sleep(3000);
		//check title
		String checkText = driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
		System.out.println(checkText);
		
		Thread.sleep(3000);
		if (checkText.equals("Duplicate Lead"))
		{System.out.println("Title Verified");}
		else
		{System.out.println("Title Not Verified");}
		
		Thread.sleep(3000);
		//create lead	
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
		Thread.sleep(3000);
		//verify duplicate lead name
		String secdCheckName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(secdCheckName);
		
		Thread.sleep(3000);
		
		if(secdCheckName.equals(firstnameresult))       //comes along with number
		{System.out.println("Matched");}
		else
		{System.out.println("Not Matched");}
		
		driver.close();
	}

}
