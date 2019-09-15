package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class LogInAndLogOut extends SeMethods{
		
	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement uName = locateElement("id", "username");
		type(uName, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		WebElement loginButton = locateElement("class", "decorativeSubmit");
		click(loginButton);
		WebElement clickCRMFSA = locateElement("a","CRM/SFA");
		click(clickCRMFSA);
		WebElement locateCreateLead = locateElement("a","Create Lead");
		click(locateCreateLead);
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName,"first");
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName,"last");
		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		type(companyName, "Amazon Dev Center");
		//selectDropDownUsingText("id","createLeadForm_industryEnumId");
		WebElement submitButton = locateElement("name","submitButton");
		click(submitButton);
		
		WebElement verifyCompName = locateElement("id", "viewLead_companyName_sp");
		verifyPartialText(verifyCompName,"Amazon");
		
		driver.close();
				
		}
	
	

}
