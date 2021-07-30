package com.mph.FirstMvn;

public class Calculate {

	public int add(int... number)
	{
		int result=0;
		
		for(int i:number)
		{
			result =result+i;
		}
		return result;
		
	}
	
	public int mul(int... n)
	{
		int result=1;
		for(int i:n)
		{
			result = result*i;
		}
		return result;
	}
	public int divide()
	{
		int z=1/1;
		return z;
	}
		
	public static void main(String[] args) {
		
		Calculate c = new Calculate();
		System.out.println(c.add(10,10));
		System.out.println(c.add(10,10,10));
		System.out.println(c.add(10,10,10,10));
		System.out.println(c.mul(1,300));
	}

}
