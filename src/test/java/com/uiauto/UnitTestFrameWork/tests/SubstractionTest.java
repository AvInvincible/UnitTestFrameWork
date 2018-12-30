package com.uiauto.UnitTestFrameWork.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.uiauto.UnitTestFrameWork.MyCalculator;

@RunWith(Parameterized.class)
public class SubstractionTest {
	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private MyCalculator subTest;

	public SubstractionTest(int firstNumber, int secondNumber, int expectedResult) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initilized() {
		subTest = new MyCalculator();
	}

	@Parameterized.Parameters
	public static Collection testData() {
		return Arrays.asList(new Object[][] { { 99, 12, 87 }, { 12, 14, -2 }, { -2, 2, -4 }, { -4, -5, 1 } });
	}

	@Test
	public void subNumbers() {
		assertEquals(subTest.Substract(firstNumber, secondNumber), expectedResult);
	}

}
