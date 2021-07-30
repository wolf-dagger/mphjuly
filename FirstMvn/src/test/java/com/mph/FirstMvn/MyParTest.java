package com.mph.FirstMvn;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyParTest {
	
	private int x,y,result;
	Calculate calc;
	
	public MyParTest(int x, int y,int result)
	{
		super();
		this.x=x;
		this.y=y;
		this.result=result;
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
	
	@Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][] {{50,50,100},{100,100,200},{25,25,50},{200,200,400},{10,10,20}});
	}
	@Test
	public void testSum()
	{
		System.out.println("Add Test");
		assertEquals(result, calc.add(x,y));
	}
	
}
