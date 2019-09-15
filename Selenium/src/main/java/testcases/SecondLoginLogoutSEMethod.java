package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class SecondLoginLogoutSEMethod extends SeMethods {
@Test
	public void editSemethod() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement login = locateElement("id", "username");
		type(login, "DemoSalesManager");
		WebElement passwd = locateElement("id", "password");
		type(passwd,"crmsfa");
		WebElement loginclick = locateElement("class","decorativeSubmit");
		click(loginclick);
		WebElement clickCRMFSA = locateElement("a","CRM/SFA");
		click(clickCRMFSA);
		WebElement locateCreateLead = locateElement("a","Create Lead");
		click(locateCreateLead);
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName,"first name");
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName,"last name");
		WebElement companyName = locateElement("id", "createLeadForm_companyName");
		type(companyName, "Secound company name");
		//selectDropDownUsingText("id","createLeadForm_industryEnumId");
		WebElement submitButton = locateElement("name","submitButton");
		click(submitButton);
		
		WebElement verifyCompName = locateElement("id", "viewLead_companyName_sp");
		verifyPartialText(verifyCompName,"Second");
		
		driver.close();
		
		
		
		
		

	}

}
