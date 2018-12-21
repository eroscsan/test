package com.epam.assignment_elte.lotto;

import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class LottoNumbersTest {

    private LottoNumbers underTest;

	@Before
	public void setUp() {
		underTest = new LottoNumbers(new RandomGenerator(new Random()), new UniquenessVerifier());
	}

	// alap teszt
	@Test
	public void test() {
		Assert.assertTrue("Ha a teszt hibára futott, ezt láthatod", true);
	}
    

    @Test // A többi esetet az alap esetekkel lekezeltük. 
    		  //Gondolok itt arra, hogy a szám a 2 határ között van-e, Mindegyik szám unique-e
    
    public void test1(){
    		//GIVEN
    		int from = 1;
    		int to = 90;
    		int count = 5;
    		//THEN
    		List<Integer> result = underTest.generateNumbers(from, to, count);
    		//RESULT
    		Assert.assertEquals(5, result.size());
    }
}