package utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectSpecification;

public class Listener extends ProjectSpecification implements ITestListener {
	
	ExtentTest test;
	ExtentReports extent = ExtentReportCurahealthcare.getreport();
	
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		System.out.println("test started");
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		//test=extent.createTest(result.getName());
		test.log(Status.PASS, "TestCase Passed is : "+result.getName());
		System.out.println("Testcase Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
	//	test=extent.createTest(result.getName());
		test.log(Status.FAIL, "TestCase Failed is : "+result.getName());
		test.log(Status.FAIL, "TestCase Failed cause is : "+result.getThrowable());
		
		String filepath = null;
		
		  try {
		 filepath = getScreenShot(result.getMethod().getMethodName());
		 
		  } catch (IOException e) {
		  
		  e.printStackTrace(); }
		 
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		System.out.println("Testcase Failed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		//test=extent.createTest(result.getName());
		test.log(Status.SKIP, "TestCase Skipped is : "+result.getName());
		System.out.println("Testcase Skipped");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	

}
