package com.arr;

import java.util.Scanner;

public class ReverseAlgoArray {
	
	
	static void leftRotate(int[] arr,int d)
	{
		if(d==0)
			return;
	
		
		int n=arr.length;
		
		d=d%n;
		
		arrRev(arr, 0, d-1);
		arrRev(arr, d, n-1);
		arrRev(arr, 0, n-1);
		
		
	}
	
	
	
	static void arrRev(int[] arr,int init,int end)
	{
		
		 int temp;
	        while (init < end) {
	            temp = arr[init];
	            arr[init] = arr[end];
	            arr[end] = temp;
	            init++;
	            end--;
	        }
		
	}
	
	 static void printArray(int arr[])
	    {
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i] + " ");
	    }
	
	
	public static void main(String[] args)
	{
		
		//System.out.println(4%7);
		  int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		  
		  int d=0;
		  
		leftRotate(arr,d);
		printArray(arr);
			
	
	}

}



/*Time Complexity : O(n)

https://youtu.be/QOpU9-l5T7Y?list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p


*/