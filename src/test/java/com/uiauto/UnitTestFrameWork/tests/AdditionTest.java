package com.uiauto.UnitTestFrameWork.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.uiauto.UnitTestFrameWork.MyCalculator;

@RunWith(Parameterized.class)
public class AdditionTest {
	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private MyCalculator addTest;

	public AdditionTest(int firstNumber, int secondNumber, int expectedResult) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void initilize() {
		addTest = new MyCalculator();
	}
	
	@Parameterized.Parameters
	public static Collection testData() {
		return Arrays.asList(new Object[][] {{1,2,3},{99,10, 109}, {-6,7,1},{-6,-6,-12},{-8,7,-1}});
	}

	@Test
	public void addNumbers() {
		assertEquals(addTest.Add(firstNumber, secondNumber), expectedResult);
	}

}
