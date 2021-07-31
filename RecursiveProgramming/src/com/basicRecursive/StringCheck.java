package com.basicRecursive;

public class StringCheck {
	
	public static boolean p(String s, int i, int f)
	{
	 if (i < f) 
	 {
	 if (s.charAt(i) == s.charAt(f))
	 {
	 return p(s, i+1, f-1);
	 } 
	 else 
	 {
	 return false;
	 }
	 } //if
	 
	 else
	 {
	 return true;
	 }
	 
	}
	

public static void main(String[] args)
{

	String s="BAAB";
	//System.out.println(s.length-1);
	System.out.println(p(s,0,s.length()-1));
}
	

}
