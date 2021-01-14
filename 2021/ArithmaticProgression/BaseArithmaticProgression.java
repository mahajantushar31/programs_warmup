package com.test.jan;

public class BaseArithmaticProgression {
	Integer[] input;
	// BaseArithmaticProgression(){}
	BaseArithmaticProgression(Integer[] input){ this.input=input; }
		//  method 1
	public boolean checkArithmaticProgressionOrNot(){
		
	Integer a1= input[0]; //? (first number)
	Integer d=Math.abs(input[0]-input[1]);

	for(int i=0;i<=input.length-1;i++){
		System.out.print(" "+input[i]);
		if( input[i] == findNthNumber(a1,i+1,d))  continue;
		else  return  false;	//  / break  a[i];
	}
	return true;
	}
	
	public Integer findNthNumber(Integer a1,Integer i,Integer d){	
		System.out.print(" :- "+(a1+(i-1)*d)+"\n");
		return 	(a1+(i-1)*d);
	}
}

	
