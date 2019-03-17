package com.suite1.Shopping;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Report implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Test Finished...."+ arg0.getName());
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Start of execution...."+ arg0.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Failed ...."+ arg0.getName());
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test skipped...."+ arg0.getName());
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test started...."+ arg0.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test successed..." + arg0.getName());
		
	}
	

}
