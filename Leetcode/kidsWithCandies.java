package com.arr;

import java.util.*;

public class kidsWithCandies {
	
	    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	    	
	        int greaterCandie = candies[0];
	        
	         // Traverse array elements from second and
	         // compare every element with current max 
	         for (int i = 1; i < candies.length; i++)
	             if (candies[i] > greaterCandie)
	            	 greaterCandie = candies[i];
	       
	    	// Creating a list
	    	List<Boolean> l1=new ArrayList<Boolean>();
	    	  
	    	
	    	
	    	
	    	for(int i=0;i<candies.length;i++ ) {
	    	
	    		if(candies[i]+extraCandies >= greaterCandie)
	    		l1.add(true);
	    		else
	    			l1.add(false);
	    	}
	    		return l1;
	    	     
	        
	    }
	
	    

	        public static void main(String[] args)
	        {
	            
	            Scanner sca=new Scanner(System.in); 
	            kidsWithCandies s=new kidsWithCandies();
	      	  int arr[] = {4,2,1,1,2 };
	      	  
	      	  System.out.println("enter no of candies");
	      	  int extraCandies=sca.nextInt();
	      	  
	      	  
	      	  System.out.println(s.kidsWithCandies(arr,extraCandies));
	      	  

}//main    
}//class
