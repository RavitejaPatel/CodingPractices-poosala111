package com.basicRecursive;

public class TraceTheVal {
	
	
	
	public static int test(String s, int last) {
		 if (last < 0) {
		 return 0;
		 }
		 if (s.charAt(last) == '0') {
		 return 2 * test(s, last-1);
		 }
		 return 1 + 2 * test(s, last-1);
		}
	
	
	
	public static void main(String[] args)
	{
	
		String s="01101";
		 System.out.println(test(s , 4));
		

	}
	
	

}
