package homeWorkout;

import org.openqa.selenium.chrome.ChromeDriver;

public class editLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Dhoni");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[contains(text(),\"Dhoni\")])[2]").click();
		
		//title
		String title = driver.getTitle();
		System.out.println("The title is"+title);
		
		if(title.equals("View Lead | opentaps CRM"))
		{
		System.out.println("Correct");	
		}
		else
		{System.out.println("Wrong");
		}
		Thread.sleep(3000);
		//edit
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(3000);
		//change the company name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("NewCompCSK");
		driver.findElementByXPath("//input[@value='Update']").click();
		Thread.sleep(3000);
		String NewCompany = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(NewCompany);
		
		if(NewCompany.equals("NewCompCSK"))//company name and LeadId is appended
		{ System.out.println("Correct company name");
		}
		else {
			System.out.println("Wrong Company Name");
		}
		
		driver.quit();
		
		
	}

}
