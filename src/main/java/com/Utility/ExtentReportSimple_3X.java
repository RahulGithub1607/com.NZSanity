package com.Utility;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportSimple_3X {

	public static void main(String[] args) throws IOException {
		
		//This is  the sample for basic and this samples and user have to import all
		
		//start reporters
		
		ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter("extent.html");
		
		//create Extents repots and attach reporter(s)
		
		ExtentReports extents =new ExtentReports();
		
		extents.attachReporter(htmlReporter);
		
		//create toggle for the given test , add all log events under it
		
		ExtentTest test =extents.createTest("Test Case Name 1", "Description of test case 1");
		
		// log(status, details)
		
		test.log(Status.INFO, "This gives you info for log with status details");
		
		//info(deatils)
		
		test.info("This step is for info details info(details)");
		
		//log with snapshot
		
		test.fail("Deatils with screenshot", MediaEntityBuilder.createScreenCaptureFromPath("failedscreenshot.png").build());
		
		//test with snapshot
		
		test.addScreenCaptureFromPath("TestWithSnapshot.png");
		
		//calling Flush to add all details to log file
		
		extents.flush();
		
		
		
		
		
		
		

	}

}
