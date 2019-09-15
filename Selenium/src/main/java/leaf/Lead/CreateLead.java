package leaf.Lead;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	@Test(dataProvider="fetchName") //invocationCount=1, groups="smoke"
	
	public void createLead(String cname, String fname, String mailId, int phoneNumber) {
		//login();
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), "Jayakumar");
		type(locateElement("id", "createLeadForm_primaryEmail"), mailId);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ""+phoneNumber);
		click(locateElement("name", "submitButton"));
		//closeApp();
		}
	
	//Learn Excel - readExcel() function comes here
	
	@DataProvider(name="fetchName")
	public Object [] [] fetch ()
	{
	Object [] [] data = new Object [2] [4];
	data [0] [0] = "Test Leaf";
	data [0] [1] = "Vishnu";
	data [0] [2] = "vish@";
	data [0] [3] = 1234567890;
	
	data [1] [0] = "amazon";
	data [1] [1] = "kumar";
	data [1] [2] = "amzn@";
	data [1] [3] = 1234567000;
	return data;
	}
	
}













