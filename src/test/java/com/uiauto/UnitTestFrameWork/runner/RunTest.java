package com.uiauto.UnitTestFrameWork.runner;

//import org.junit.runner.JUnitCore;
//import org.junit.runner.Result;
import org.junit.runner.RunWith;
//import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;

import com.uiauto.UnitTestFrameWork.tests.AdditionTest;
import com.uiauto.UnitTestFrameWork.tests.MultiplicationTest;
import com.uiauto.UnitTestFrameWork.tests.SubstractionTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({AdditionTest.class, SubstractionTest.class, MultiplicationTest.class})
public class RunTest {
	
	
//	public static void main(String args[]) {
//		Result result = JUnitCore.runClasses(AdditionTest.class);
//		
//		for(Failure failure : result.getFailures()) {
//			System.out.println(failure.toString());
//		}
//		
//		System.out.println(result.wasSuccessful());
//	}
}
