package com.basicRecursive;

public class FibannocRecursive {
	
	
	public static int fib(int n) {
		 if (n <= 2) {
		 return 1;
		 }
	     
	     return fib(n - 1) + fib(n - 2);
	} 
	
	
	
	public static void main(String[] args)
	{

		int n=5;
		for(int i=1;i<=n;i++)
		{
		System.out.println(fib(i));
		}
		}
	
	

}
