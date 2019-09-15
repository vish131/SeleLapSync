package Week03Day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MeargeLeadHomework {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
		//object creation for driver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//enter user, password and login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		//click crm/sfa , lead link, 
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		
		//----------------From Lead-------------------------
		
		//click icon near from lead
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		//Move to new window
		//driver.getWindowHandle();
		Set<String> winds = driver.getWindowHandles();
		int size = winds.size();
		System.out.println("Available window:" + size);
		
		//Convert set to List
		List<String> allWinds = new ArrayList<String>();
		allWinds.addAll(winds);
		
		//go to New Window
		String fromLead = allWinds.get(1);
		driver.switchTo().window(fromLead);
		System.out.println("Switched to From Lead Window");
		driver.manage().window().maximize();
		
		//Enter Lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys("100");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//wait for few sec
		Thread.sleep(5000);
		
		//click result
		driver.findElementByXPath("(//a[contains(text(),'100')])[1]").click();
				
		// back to primary window second time
		Set<String> winds2 = driver.getWindowHandles();
		int size2 = winds2.size();
		System.out.println("Available Window:" +size2);
		
		//convert Set to List
		List<String> allWinds2 = new ArrayList<String>();
		allWinds2.addAll(winds2);
		
		//go to new Window
		String firstwindow2 = allWinds2.get(0);
		driver.switchTo().window(firstwindow2);
		System.out.println("Swiched to First Window");
		
		
	//--------------- To Lead ----------------------
		
		//click icon To near lead
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		//Move to new window
		//driver.getWindowHandle();
		Set<String> windsTo = driver.getWindowHandles();
		int sizeTo = windsTo.size();
		System.out.println("Available window:" + sizeTo);
		
		//Convert set to List
		List<String> allWindsTo = new ArrayList<String>();
		allWindsTo.addAll(windsTo);
		
		//go to New Window
		String toLead = allWindsTo.get(1);
		driver.switchTo().window(toLead);
		System.out.println("Switched to TO Lead Window");
		driver.manage().window().maximize();
		
		//Enter Lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys("100");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[contains(text(),'100')])[1]").click(); 
		
		// back to primary window second time
		Set<String> windsP = driver.getWindowHandles();
		int sizeP = windsP.size();
		System.out.println("Available Window:" +sizeP);
		
		//convert Set to List
		List<String> allWindsP = new ArrayList<String>();
		allWindsP.addAll(windsP);
		
		//go to new Window
		String firstwindowP = allWindsP.get(0);
		driver.switchTo().window(firstwindowP);
		System.out.println("Swiched to First main Window");	
		
		//Click Merge
		driver.findElementByLinkText("Merge").click();
		
		//driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		Thread.sleep(3000);
		
		//accept Alert
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		//find Lead
		driver.findElementByLinkText("Find Leads").click();
		
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		
		System.out.println("Pressed find lead");
		
		//enter from lead ID and click find leads
		driver.findElementByXPath("//input[@name='id']").sendKeys("100");
		driver.findElementByLinkText("Find Leads");
		
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[contains(text(),'100')])[1]").click();
		
		//verify error message
		
		//close the browser
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//driver.close();
		
		
		
	}

}
