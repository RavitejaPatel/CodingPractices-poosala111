package com.arr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
    Map<Integer,Integer> s=new HashMap<>();
        int count=0;
        for(int x:nums)
        {
        	s.put(x,s.getOrDefault(x,0)+1);
            
             System.out.println(s.get(x)+" "+s.toString());
        }
        for(int x:s.values())
        {
           System.out.println("***********"+x);
        	count+=(((x)*(x-1))/2);
        	System.out.println("******************"+count);
        }
        return count;
}
    
    
    public static void main(String[] args)
    {
    	
    	NumIdenticalPairs s=new NumIdenticalPairs();
    	  int arr[] = { 1, 2, 2,1 };
    	  System.out.println(Arrays.toString(arr));
    	System.out.println(s.numIdenticalPairs(arr));
        
    }
}

/*
public class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums) 
    {
        int i , result = 0 ;
        int[] count = new int[101] ;
        for( i = 0 ; i < nums.length ; i++ )
        {
        	System.out.println("============"+count[nums[i]]);
            result += count[nums[i]]++ ;
            System.out.println("]]]]]]]]]]]"+count[nums[i]]);
            System.out.println(result);
        }
        return result ;
    }
    
    
    
    public static void main(String[] args)
    {
    	
    	NumIdenticalPairs s=new NumIdenticalPairs();
    	  int arr[] = { 1, 2, 5,1 };
    	  System.out.println(Arrays.toString(arr));
    	System.out.println(s.numIdenticalPairs(arr));
        
        
    }
}


*/
/*
public class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums) 
    {
        int i , result = 0 , key = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for( i = 0 ; i < nums.length ; i++ )
        {
        	System.out.println(map.containsKey(nums[i]));
            if( map.containsKey(nums[i]) )
            {
                key = map.get(nums[i]) ;
                result += key;
                map.put( nums[i] , key + 1 ) ;
            }
            else
            {
                map.put( nums[i] , 1 ) ;
            }
        }
        return result ;
    }
    
    
    public static void main(String[] args)
    {
    	
    	NumIdenticalPairs s=new NumIdenticalPairs();
    	  int arr[] = { 1, 2, 5,1 };
    	  System.out.println(Arrays.toString(arr));
    	System.out.println(s.numIdenticalPairs(arr));
        
        
    }
}

*/