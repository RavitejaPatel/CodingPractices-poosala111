package com.arr;

import java.util.Arrays;

class Sum1D  {
    int sum=0;
    public int[] runningSum(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            nums[i]=sum;
            
        }//for
        return nums;
    }
    

     
    public static void main(String[] args)
    {
    	
    	Sum1D s=new Sum1D();
    	  int arr[] = { 1, 2, 5,1 };
    	  System.out.println(Arrays.toString(arr));
    	System.out.println(Arrays.toString(s.runningSum(arr)));
        
        
    }
    
    
}//solution