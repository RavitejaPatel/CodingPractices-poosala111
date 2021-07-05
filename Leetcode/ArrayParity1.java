package com.arr;

import java.util.Arrays;
import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;

class ArrayParity1 {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0 ; i < nums.length-1; i= i+2)
        {
            sum = sum+ Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }

    public static void main(String[] args)
    {
        
    	ArrayParity1 s=new ArrayParity1();
         Scanner sca=new Scanner(System.in);
         System.out.println("enter array size:");
         int size=sca.nextInt();
         int[] arr=new int[size];
         for(int i=0;i<size;i++)
         {
             arr[i]=sca.nextInt();
         }
        
        System.out.println(s.arrayPairSum(arr));
        
    }
    }

        
        
        
        