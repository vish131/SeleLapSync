package Week05Day02;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class htmlReportClassroom {

	public static void main(String[] args) throws IOException {
ExtentHtmlReporter html = new ExtentHtmlReporter("./Reports/result.html");
html.setAppendExisting(true);
ExtentReports extent = new ExtentReports();
extent.attachReporter(html);
ExtentTest test = extent.createTest("TC001_CreateLeadOne","Create New Lead");
test.assignCategory("smoke");
test.assignAuthor("vishnu");
test.pass("The DemosSalesManager has entered sucessfully", MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img1.png").build());
test.pass("The data crmsfa Entered sucessfully",MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img2.png").build());
test.pass("The login button clicked succesfully",MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img3.png").build());
extent.flush();
	}

}
