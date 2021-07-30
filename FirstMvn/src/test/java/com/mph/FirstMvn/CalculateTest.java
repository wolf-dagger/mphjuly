package com.mph.FirstMvn;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import org.junit.*;


public class CalculateTest {
	
	Calculate calc;
	@BeforeClass
	public static void setUpBefore() throws Exception{
		System.out.println("@Before Class called");
		}
	@AfterClass
	public static void TearDownAfter() throws Exception{
		System.out.println("@After Class Called");
	}
	
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("Befor Called");
		calc = new Calculate();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		calc = null;
		System.out.println("After Called");
	}
	
	@Test
	public void testadd()
	{
		System.out.println("Add test");
		assertEquals(130,calc.add(10,20,100));
	//	assertNotEquals(130,calc.add(10,20,100));
	}
	
	@Test
	public void testMultiply()
	{
		System.out.println("Multiply Test");
		assertEquals(300,calc.mul(300,1));
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	
	@Test
	public void testDivide()
	{
		System.out.println("Divide Test");
		calc.divide();
		exception.expect(ArithmeticException.class);
		exception.expectMessage("No Divide by 0 ;(");
	}

}
