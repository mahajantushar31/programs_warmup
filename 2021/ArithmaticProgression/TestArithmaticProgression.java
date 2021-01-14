package com.test.jan;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class TestArithmaticProgression {

	
	@Test
	public void testCase1(){
		Integer[] input=new Integer[] {3,5,7,9,11};
		assertEquals(true ,new BaseArithmaticProgression(input).checkArithmaticProgressionOrNot());
	}
	@Test
	public void testCase2(){
		Integer[] input=new Integer[] {3,5,7,9,11,35};
		assertEquals(false ,new BaseArithmaticProgression(input).checkArithmaticProgressionOrNot());
	}
	@Test
	public void testCase3(){
		Integer[] input=new Integer[] {3,5,7,19,11,13};
		assertEquals(false ,new BaseArithmaticProgression(input).checkArithmaticProgressionOrNot());
	}
	
	@Test
	public void testCase4(){
		Integer[] input=new Integer[] {3,5,7,19,11,13};
		assertEquals(false ,new BaseArithmaticProgression(input).checkArithmaticProgressionOrNot());
	}
	
	@Test
	public void testCase5(){
		Integer[] input=new Integer[] {3,5,7,19,11,13};
		Integer d=Math.abs(input[0]-input[1]);
		Integer first=input[0];
		Integer position=5; 
		assertEquals(input[5-1] ,new BaseArithmaticProgression(input).findNthNumber(first, position,d ));
	}
}
