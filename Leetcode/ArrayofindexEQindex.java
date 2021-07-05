package com.arr;

public class ArrayofindexEQindex {
	
	
	public static int[] fix(int[] arr,int n)
	
	{
		
		for(int i=0;i<n;i++)
		{
			
		for(int j=0;j<n;j++)
		{
			if(arr[j]==i)
				arr[i]=i;
			else
				arr[i]=-1;
		}
			
		}
		return arr;
		
		
	}
	public static void main()
	{
	
		 int A[] = {-1, -1, 6, 1, 9,3, 2, -1, 4,-1};
		 int n=A.length;
                  
     // Function calling
     System.out.println((fix(A,n)));


	
	}
	}
