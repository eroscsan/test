package com.epam.assignment_elte.lotto;

import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RandomGeneratorTest {

    private RandomGenerator underTest;
    
	@Before
	public void setUp() {
		underTest = new RandomGenerator(new Random());
	}

	// alap teszt
	@Test
	public void test() {
		Assert.assertTrue("Ha a teszt hibára futott, ezt láthatod", true);
	}
    
    @Test(expected=IllegalArgumentException.class)
	public void test1() {
    		//GIVEN
    		int from = 4;
    		int to = 3;
    		//THEN
    		int result = underTest.getNumber(from, to);
    		//RESULT
    		Assert.assertTrue(from <= result && result <= to);
    }
    
    @Test(expected=IllegalArgumentException.class)
	public void test2() {
    		//GIVEN
    		int from = 1;
    		int to = 1;
    		//THEN
    		int result = underTest.getNumber(from, to);
    		//RESULT
    		Assert.assertTrue(from <= result && result <= to);
    }
    
    @Test
	public void test3() {
    		//GIVEN
    		int from = 1;
    		int to = 5;
    		//THEN
    		int result = underTest.getNumber(from, to);
    		//RESULT
    		Assert.assertTrue(from <= result && result <= to);
    }

}