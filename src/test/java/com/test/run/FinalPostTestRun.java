package com.test.run;

import org.testng.annotations.Test;

import com.generic.CreateFunction;
import com.report.ExtentReport;


public class FinalPostTestRun extends ExtentReport{

	@Test
	public void postTestCases() {
		CreateFunction.post();
		CreateFunction.postTestCase();
	}
	
}
