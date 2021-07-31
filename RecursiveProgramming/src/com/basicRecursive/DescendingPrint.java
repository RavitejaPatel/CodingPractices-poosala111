package com.basicRecursive;

public class DescendingPrint {
	
	public void desVal(int n)
	{
		
		if(n!=0)
		{
			System.out.print(n+" ");
			
		desVal(n-1);
		}
	}
	
	public static void main(String[] args)
	{
	
		DescendingPrint obj=new DescendingPrint();
		obj.desVal(5);
	}

}
