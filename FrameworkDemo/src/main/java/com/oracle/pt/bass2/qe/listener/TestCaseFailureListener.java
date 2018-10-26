package com.oracle.pt.bass2.qe.listener;

import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import com.oracle.pt.bass2.qe.util.SnapShotManager;

public class TestCaseFailureListener extends RunListener {

	public TestCaseFailureListener() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void testFailure(Failure failure) throws Exception {
		String filename=failure.getDescription().getTestClass().getSimpleName()+"_"+failure.getDescription().getMethodName();
		SnapShotManager.getScreenshot(filename);
		
		System.out.println(failure.getTrace());
	    }

}
