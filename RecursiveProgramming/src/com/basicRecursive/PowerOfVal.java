package com.basicRecursive;

public class PowerOfVal {
	
	
	public int ExpoCal(int val,int powerval)
	{
		
		if(powerval==0)
			return 1;
		
		if(powerval==1)
			return val;
		
		else
			return ExpoCal(val, powerval-1)*val;
		
	}
	
	public static void main(String[] args)
	{
		PowerOfVal obj=new PowerOfVal();
		System.out.println(obj.ExpoCal(3,5));
		
	}

}
