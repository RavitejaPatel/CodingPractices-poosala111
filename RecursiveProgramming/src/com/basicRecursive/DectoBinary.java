package com.basicRecursive;

public class DectoBinary {
	
	public static void decToBin(int num)
	{

        if(num>0)
	
		{
		 decToBin(num/2);
		System.out.println(num%2);	
		}
			
	}
	

	public static void main(String[] args)
	
	{
		int num=5;
		decToBin(num);
		
	}
	
	
	
}
	/*
	
	
	public static void decToBin(int num)
	{
	 if (num > 0)
	 {
	 decToBin(num / 2);
	 System.out.print(num % 2);
	 }
	} 
	
	public static void main(String[] args)
	{
		decToBin(10);
		
	}
	
	
}

	
	*/