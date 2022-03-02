package com.priya.juint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {
	//MyMath.sum
	//1,2,3 => 6
	
	@Test
	public void sum_with3numbers() {
		
		//Absence of failure is success
		
		MyMath myMath = new MyMath();
		
		System.out.println(myMath.sum(new int[] {1,2,3}));
	
		int result = myMath.sum(new int[] {1,2,3});
		//check that the result is 6
		assertEquals(6,result);
		
	}
public void sum_with1numbers() {
		
		//Absence of failure is success
		
		MyMath myMath = new MyMath();
		
		System.out.println(myMath.sum(new int[] {1}));
	
		//check that the result is 6
		assertEquals(2,myMath.sum(new int[] {1}));
		
	}

}
