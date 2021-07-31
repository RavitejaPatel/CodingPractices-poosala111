package com.basicRecursive;

public class MysteryTrace {

	
	
	public static int mystery(int n) {
		 if (n < 10) {
		 return (10 * n) + n;
		 } 
		 
		 else {
		 int a = mystery(n / 10);
		 int b = mystery(n % 10);
		 return (100 * a) + b;
		 }
		} 
	
public static void main(String[] args)
	
	{
		int num=348;
		System.out.println(mystery(num));
		
	}
	
	
}
