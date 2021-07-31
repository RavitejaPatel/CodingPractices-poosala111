package com.basicRecursive;

public class ElementSearchFromArray {
	
	
	
	public static Boolean searchEle(int[] arr,int searchEle,int size)
	{
		
		if(size>=0)
		{
		
		if(arr[size]==searchEle )
			return true;
		
		else
		return searchEle(arr, searchEle, size-1); 
		
		}
		else
		{
			return false;
		}
	
	}
	
	public static void main(String[] args)
	{
		int[] arr= {5,9,2,4,1};
		System.out.println(searchEle(arr,9,arr.length-1));
	}

}
