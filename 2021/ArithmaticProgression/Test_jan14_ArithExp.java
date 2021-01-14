package com.test.jan;

public class Test_jan14_ArithExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input=new Integer[] {3,5,7,9,11};
		BaseArithmaticProgression exp=new BaseArithmaticProgression(input);
		
		System.out.println("input "+exp.checkArithmaticProgressionOrNot());
		
	}
	
	
}
