package com.basicRecursive;

public class Factorial {
	
	
	public static int factorial(int n)
	{
		
		if(n==0)
			return 1;
		
		else
		return factorial(n-1)*n;
	}
	
	
	public static void main(String[] args)
	{
		Factorial f=new Factorial();
		
		int factSum=f.factorial(5);
	System.out.println(factSum);
	}

}
