package com.arr;

import java.util.ArrayList;
import java.util.List;

class Solution
{
    //Function to return k largest elements from an array.
       public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
    	 List<Integer> numbers = new ArrayList<Integer>();
    	for (int i = 0; i < arr.length; i++) 
        {     
          for (int j = i+1; j < arr.length; j++)
          {     
             if(arr[i] < arr[j]) {    
                int temp = arr[i];    
                 arr[i] = arr[j];    
                 arr[j] = temp;    
             }   
          }
          
        }
    	numbers.add(arr[0]);
    	numbers.add(arr[1]);
    	System.out.println(numbers);
      
    
        return (ArrayList<Integer>) (numbers);
    }
    
    
    public static void main(String[] args)
    {
        int[] arr={1,23,12,9,30,2,50};
        int N=arr.length;
        int k=3;
        kLargest(arr,N,k);
    }//main
}