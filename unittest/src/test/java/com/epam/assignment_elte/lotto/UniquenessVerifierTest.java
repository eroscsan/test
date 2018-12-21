package com.epam.assignment_elte.lotto;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class UniquenessVerifierTest {

    private UniquenessVerifier underTest = new UniquenessVerifier();
    
    @Test
    public void test1() {    		
        		//GIVEN
        		List<Integer> input = Arrays.asList(1,2,3,4,5);
        		//THEN
        		underTest.verify(input);
        		//RESULT	
        		Assert.assertEquals(5, input.size());
    }
    
    @Test(expected=RuntimeException.class) // Azért true mert direkt elkaptuk az exception-t
    public void test2() {    		
        		//GIVEN
        		List<Integer> input = Arrays.asList(1,1,1,4,5);
        		//THEN
        		underTest.verify(input);
        		//RESULT	
        		Assert.assertEquals(5, input.size());
    }
    
    @Test //Azért true mert a lista elemeinek száma nulla
    public void test3() {    		
        		//GIVEN
        		List<Integer> input = Arrays.asList();
        		//THEN
        		underTest.verify(input);
        		Assert.assertEquals(0, input.size());
        		//RESULT	
    }
    
	@SuppressWarnings("null")
	@Test // Le kellett kezelni a nullpointer exceptiont is mivel a listában null van
    public void test4() {    	
		try {
    		//GIVEN
    		List<Integer> input = null;
    		//THEN
    		underTest.verify(input);
    		//RESULT	
    		Assert.assertEquals(null, input.size());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}  catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
    }
}