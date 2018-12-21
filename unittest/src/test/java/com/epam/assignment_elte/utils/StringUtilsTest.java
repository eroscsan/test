package com.epam.assignment_elte.utils;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest {

    private StringUtils underTest;
    
    @Before
	public void setUp() {
		underTest = new StringUtils();
	}

	// alap teszt
	@Test
	public void test() {
		Assert.assertTrue("Ha a teszt hibára futott, ezt láthatod", true);
	}
	
	@Test
	public void testListisNull() {
		try {
			//GIVEN
			String start = "A";
			String end = "B";
			List<?> list = null;
			//WHEN
			String result = underTest.join(start, end, list);
			//THEN
			Assert.assertEquals("AemptyB", result);
			
		} catch (NullPointerException e) {
			System.out.println("A lista null értékű");
		}
	}
	
	@Test
	public void testListIsEmpty() {
			//GIVEN
			String start = "A";
			String end = "B";
			List<?> list = Arrays.asList();
			//WHEN
			String result = underTest.join(start, end, list);
			//THEN
			Assert.assertEquals("AemptyB", result);
	}
	
	@Test
	public void testListLessThenFourElement() {
			//GIVEN
			String start = "A";
			String end = "B";
			List<?> list = Arrays.asList("A","B","C");
			//WHEN
			String result = underTest.join(start, end, list);
			//THEN
			Assert.assertEquals("AABCB", result);
	}
	
	@Test
	public void testListGreaterThenFourElement() {
			//GIVEN
			String start = "A";
			String end = "B";
			List<?> list = Arrays.asList("A","B","C","D","E");
			//WHEN
			String result = underTest.join(start, end, list);
			//THEN
			Assert.assertEquals("AEDCBB", result);
	}
	
	@Test
	public void testListMixedElement() {
			//GIVEN
			String start = "A";
			String end = "B";
			List<?> list = Arrays.asList("A","Baba","C",1,"E");
			//WHEN
			String result = underTest.join(start, end, list);
			//THEN
			Assert.assertEquals("AE1CBabaB", result);
	}

}