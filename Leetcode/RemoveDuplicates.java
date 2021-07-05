package com.arr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class RemoveDuplicates {
	
	public int[] removeDuplicates(int[] nums) {

	    int index=1;
	    
	    for(int i=0;i<nums.length-1;i++){
	        
	        if(nums[i]!=nums[i+1]){
	            
	            nums[index++]=nums[i+1];
	            
	        }
	    }
	    return nums;
	    
	}


public static void main(String[] args)
{
    int[] arr=new int[8];
    Scanner s=new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
    	arr[i]=s.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
	
	System.out.println(arr[i]);
}

    System.out.println("-----------------------");
    RemoveDuplicates rd=new RemoveDuplicates();
int[] arrFinal=rd.removeDuplicates(arr);
for (int i = 0; i < arrFinal.length; i++) {
	
	System.out.println(arrFinal[i]);
}
}
}//class






/*
public class RemoveDuplicates {
	
	
	public static int removeDuplicates(ArrayList<Integer> arr)
	{
		
		
		
		int count=0;
		int size;
		System.out.println(arr.get(2));
		
		//assert k == expectedNums.length;
		for (int i = 0; i < arr.size()-1; i++) {
			//System.out.println(arr.get(i));
		  //  assert nums[i] == expectedNums[i];
			for(int j = i+1; j < arr.size(); j++)
			{
				//System.out.println(arr.get(j));
				if(arr.get(i)==arr.get(j))
				{
					arr.add(j, null);
					count++;
				}
			}
		}
		
		return arr.size()-count;
	}
	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(0);
		al.add(0);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(3);
		al.add(4);
		//[0,0,1,1,1,2,2,3,3,4]
		Collections.sort(al);
	System.out.println(al.toString());
	System.out.println(removeDuplicates(al));
	
	
	
	
	}
	
	
}
	
	*/
	
	/*
	
	public static void main(String[] args)
    {
        int[] arr=new int[4];
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
        	arr[i]=s.nextInt();
        }
        
	
        System.out.println(arr.);
	for (int i = 0; i < arr.length; i++) {
		
		System.out.println(arr[i]);
	}
	
	System.out.println(removeDuplicates(arr));
	
	
    }
    }//class


*/