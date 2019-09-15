package homeWorkout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IrctcSingup {

	public static void main(String[] args) throws InterruptedException {
		int i=1;
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		ChromeOptions chops = new ChromeOptions();
		chops.addArguments("--disable-notification");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//extra popup
		Thread.sleep(2000);
		driver.findElementByClassName("twoyears-close-btn").click();
		
		driver.findElementByXPath("//a[text()='Sign up']").click();
		
		//singup fillup details
		
		for (i=5018; i>0; i++)
		{
			driver.findElementById("userRegistrationForm:userName").clear();
		driver.findElementById("userRegistrationForm:userName").sendKeys("vishnu"+i);
		driver.findElementById("userRegistrationForm:checkavail").click();
		Thread.sleep(2000);
		String getIdAvail = driver.findElementById("userRegistrationForm:useravail").getText();
		System.out.println(getIdAvail);
				if (getIdAvail.equals("User Id is Available..Please go ahead with the Registration Process..."))
		{ break;}
		}
		
		System.out.println(driver.findElementById("userRegistrationForm:userName").getText()); //this is not working
	WebElement secQ = driver.findElementById("userRegistrationForm:securityQ");
	Select SQuest = new Select(secQ);
	SQuest.selectByIndex(1);
	driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("pet name");
	
	WebElement selectLang = driver.findElementById("userRegistrationForm:prelan");
	Select selectEng = new Select(selectLang);
	selectEng.selectByVisibleText("English");
	driver.findElementById("userRegistrationForm:firstName").sendKeys("vishnu");
	driver.findElementById("userRegistrationForm:gender:0").click();
	driver.findElementById("userRegistrationForm:maritalStatus:1").click();
	
	//DOB
	WebElement selectDob1 = driver.findElementById("userRegistrationForm:dobDay");
	Select date = new Select(selectDob1);
	date.selectByVisibleText("06");
	WebElement selectDob2 = driver.findElementById("userRegistrationForm:dobMonth");
	Select month = new Select(selectDob2);
	month.selectByVisibleText("APR");
	WebElement selectDob3 = driver.findElementById("userRegistrationForm:dateOfBirth");
	Select year = new Select(selectDob3);
	year.selectByVisibleText("1992");
	
	WebElement occupnt = driver.findElementById("userRegistrationForm:occupation");
	Select ocp = new Select(occupnt);
	ocp.selectByIndex(6);
	
	WebElement contry = driver.findElementById("userRegistrationForm:countries");
	Select cont = new Select(contry);
	cont.selectByVisibleText("India");
	
	driver.findElementById("userRegistrationForm:email").sendKeys("test@test.com");
	driver.findElementById("userRegistrationForm:mobile").sendKeys("9876543210");
	
	WebElement national = driver.findElementById("userRegistrationForm:nationalityId");
	Select natl = new Select(national);
	natl.selectByVisibleText("India");
	
	driver.findElementByXPath("//input[@id='userRegistrationForm:address']").sendKeys("0000");
	driver.findElementById("userRegistrationForm:pincode").sendKeys("600021");
	Thread.sleep(2000);
	driver.findElementById("userRegistrationForm:pincode").sendKeys(Keys.TAB);
	Thread.sleep(2000);
	WebElement citySelect = driver.findElementByXPath("//select[@id='userRegistrationForm:cityName']");
	Select cs = new Select(citySelect);
	cs.selectByVisibleText("Chennai");
	Thread.sleep(2000);
	WebElement postOffSlt = driver.findElementByXPath("//select[@id='userRegistrationForm:postofficeName']");
	Select po = new Select(postOffSlt);
	po.selectByVisibleText("Washermanpet S.O");
	
	driver.findElementByXPath("//input[@id='userRegistrationForm:landline']").sendKeys("9874563210");
	
	}

}
