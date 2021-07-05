package com.arr;

public class KeySegment {
	
	
	public static void main(String[] args)
    {
       
        int arr[] ={ 5, 8, 7, 12, 14, 3, 9} ;
       
        int searchIp=23;
        int segmentLen=5; 
        int i=0;
        int status=0;
        int count=1;
        //for(i=0;i<3;i++)
        while(i<segmentLen && i<arr.length)
        {
        	
           if(arr[i]==searchIp)
           {
        	   System.out.println("first segment has key");
        	   status=1;     	 
        	   System.out.println("======="+i);
        	   count++;
        	   i=status*segmentLen;
        	   segmentLen=segmentLen*count;
        	   
        	}
           else {
           i++;
           }
         
        	
        }
       
       
           
    }	

}
