package com.mph.FirstMvn;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertMethodsTest {

	@Test
	public void testAllAssertMethods()
	{
		String st1 = new String("Prashant");
		String st2 = new String("Prashant");
		String st3 = null;
		String st4 ="Obito";
		String st5 ="Obito";
		
		int v1=5;
		int v2=10;
		
		String[] a1 = {"Obito","Kakashi","Madara"};
		String[] a2 = {"Obito","Kakashi","Madara"};
		
		assertEquals(st1,st2);
		assertNull(st3);
		assertNotNull(st1);
		assertSame(st4, st5);
		
		assertTrue(v1<v2);
		assertFalse(v1>v2);
		
		assertArrayEquals(a1, a2);
		
		
	}
	
}
