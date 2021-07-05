package com.arr;

class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        return increasing(A) ;//|| decreasing(A);
    }

    public boolean increasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i+1]) 
            	{
            	System.out.println("inside if");
            	return false;
            	
            	}
         	System.out.println("increment of FOR");
            	}
        System.out.println("check return");
        return true;
        
    }

    public boolean decreasing(int[] A) {
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] < A[i+1])
            	{
            	return false;
            	}
         	System.out.println("DECREMENT of FOR");
        }
        return true;
    }
    
    
    
    public static void main(String[] args)
    {
    	
    	MonotonicArray ma=new MonotonicArray();
    	  int arr[] = { 1, 2, 5,1 };
    	System.out.println(ma.isMonotonic(arr));
    }
    
    
}