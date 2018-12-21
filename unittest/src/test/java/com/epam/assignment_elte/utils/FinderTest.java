package com.epam.assignment_elte.utils;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;

public class FinderTest {

    private Finder underTest;
    
    @Before
	public void setUp() {
		underTest = new Finder();
		 //MockitoAnnotations.initMocks(this);
	}
    
    /*
    @Mock
    List<Integer> mockList;
    
    @Test
    public void whenUseMockAnnotation_thenMockIsInjected() {
    		mockList.add(1);
        Mockito.verify(mockList).add(1);
        mockList.add(2);
        Mockito.verify(mockList).add(2);
        mockList.add(3);
        Mockito.verify(mockList).add(3);
        mockList.add(4);
        Mockito.verify(mockList).add(4);
        mockList.add(5);
        Mockito.verify(mockList).add(5);
     
        Mockito.when(mockList.size()).thenReturn(100);
        Assert.assertEquals(100, mockList.size());
        Integer target = 1;
        	//WHEN
        	int result = underTest.find(mockList, target);
      	//THEN
      	Assert.assertEquals(1, result);
    }
    */

	// alap teszt
	@Test
	public void test() {
		Assert.assertTrue("Ha a teszt hibára futott, ezt láthatod", true);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNullList() {
		//GIVEN
		List<Integer> list = null;
		int target = 5;
		//WHEN
		int result = underTest.find(list, target);
		//THEN
		Assert.assertEquals(-1, result);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNullTarget() {
		//GIVEN
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		Integer target = null;
		//WHEN
		int result = underTest.find(list, target);
		//THEN
		Assert.assertEquals(-1, result);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNullTargetAndNullList() {
		//GIVEN
		List<Integer> list = null;
		Integer target = null;
		//WHEN
		int result = underTest.find(list, target);
		//THEN
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testEmptyList() {
		//GIVEN
		List<Integer> list = Arrays.asList();
		Integer target = 3;
		//WHEN
		int result = underTest.find(list, target);
		//THEN
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testTargetNotInTheList() {
		//GIVEN
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Integer target = 7;
		//WHEN
		int result = underTest.find(list, target);
		//THEN
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testTargetInList() {
		//GIVEN
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Integer target = 1;
		//WHEN
		int result = underTest.find(list, target);
		//THEN
		Assert.assertEquals(1, result);
	}

}