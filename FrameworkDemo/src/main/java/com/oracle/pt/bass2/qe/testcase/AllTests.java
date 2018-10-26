package com.oracle.pt.bass2.qe.testcase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.oracle.pt.bass2.qe.runner.TestSuite;

@RunWith(TestSuite.class)
@SuiteClasses({ Login.class })
public class AllTests {

}
