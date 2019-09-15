package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class ProjectMethods extends SeMethods {	

	@Parameters({"url", "uName", "pName"})
	@BeforeMethod() //(groups={"smoke", "regression", "sanity"})
	
	public void login(String url1, String uName2, String pName3 ) {    //Name is not matter but Order is matter
		startApp("chrome", url1);
		type(locateElement("id", "username"), uName2);
		type(locateElement("id", "password"), pName3);
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}

	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}

}
