package com.priya.juint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class AssertTest {
	
	@Before
	public void before() {
		System.out.println("Before");
	}

	@Test
	public void test() {
		System.out.println("Test1");
		//checks equal for any argument types
		assertEquals(1,1);
		//Check if a condition is true
		boolean con = true;
		assertTrue(con);
		
		//check if condition id false
		assertFalse(false);
		
		
	
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	

}
