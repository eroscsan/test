package com.epam.assignment_elte.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    private Math underTest;
    
    @Before
	public void setUp() {
		underTest = new Math();
	}

	// alap teszt
	@Test
	public void test() {
		Assert.assertTrue("Ha a teszt hibára futott, ezt láthatod", true);
	}
	
	@Test // A függvény felett az volt, hogy csak a valid értékekkel számoljunk
	public void testValidInput() {
		//GIVEN
		double base = 10000;
		double interestRate = 0.1;
		int years = 4;
		//WHEN
		long result = underTest.interestRate(base, interestRate, years);
		//THEN
		Assert.assertEquals(14641, result);
	}
	
	@Test 
	public void testAisZero() {
		//GIVEN
		int a = 0;
		int b = 1;
		//WHEN
		int result = underTest.greatesCommonDivisor(a, b);
		//THEN
		Assert.assertEquals(1, result);
	}
	
	@Test 
	public void testBisZero() {
		//GIVEN
		int a = 1;
		int b = 0;
		//WHEN
		int result = underTest.greatesCommonDivisor(a, b);
		//THEN
		Assert.assertEquals(1, result);
	}
	
	@Test 
	public void testAandBNegativ() {
			//GIVEN
			int a = -1;
			int b = -2;
			//WHEN
			int result = underTest.greatesCommonDivisor(a, b);
			//THEN
			Assert.assertEquals(-1, result);
	}
	
	@Test 
	public void testPositiveNumbers() {
			//GIVEN
			int a = 10;
			int b = 25;
			//WHEN
			int result = underTest.greatesCommonDivisor(a, b);
			//THEN
			Assert.assertEquals(5, result);
	}
}