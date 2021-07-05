package com.arr;
import java.util.Arrays;
import java.util.Scanner;

import com.arr.ColMaxMatrix.Pair;


class MaximumWealth {

	 public int maximumWealth(int[][] accounts) {
		 
		 int maxSum = Integer.MIN_VALUE;
		 int N=2;
		 
		 for(int[] account : accounts)
			{
				int sum = 0;

				// calculate sum of column
				for (int ele : account)
				{
					sum += ele;
				}

				// Update maxSum if it is
				// less than current sum
				if (sum > maxSum)
				{
					maxSum = sum;

				}
			}
		 return maxSum;
	        
	 }
	
	 public static void main(String[] args)
	    {
		System.out.println("Please enter the rows in the matrix");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Please enter the columns in the matrix");
		int column = sc.nextInt();
    int[][] accounts = new int[row][column];
		
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter first[%d][%d] integer", r, c));
				accounts[r][c] = sc.nextInt();
			}
			}//outer for
		MaximumWealth s=new MaximumWealth();
		int max=s.maximumWealth(accounts);
		System.out.println(max);
		}
	
}//solution1




/*
class Solution1 {

	 public int maximumWealth(int[][] accounts) {
		 
		 int maxSum = Integer.MIN_VALUE;
		 int N=2;
		 
		 for (int i = 0; i < N; i++)
			{
				int sum = 0;

				// calculate sum of column
				for (int j = 0; j < N; j++)
				{
					sum += accounts[i][j];
				}

				// Update maxSum if it is
				// less than current sum
				if (sum > maxSum)
				{
					maxSum = sum;

				}
			}
		 return maxSum;
	        
	 }
	
	 public static void main(String[] args)
	    {
		System.out.println("Please enter the rows in the matrix");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Please enter the columns in the matrix");
		int column = sc.nextInt();
     int[][] accounts = new int[row][column];
		
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter first[%d][%d] integer", r, c));
				accounts[r][c] = sc.nextInt();
			}
			}//outer for
		Solution1 s=new Solution1();
		int max=s.maximumWealth(accounts);
		System.out.println(max);
		}
	
}//solution1



*/

/*
class Solution1 {

	
	    public int maximumWealth(int[][] accounts) {
	        
	        int rowLen=accounts.length;
	        System.out.println(rowLen);
	        int[] salaries= new int[rowLen];
	       int sum=0;
	        for(int r=0;r<rowLen;r++)
	        {
	        	for(int c=0;c<=rowLen;c++)
	        	{
	        		sum=sum+accounts[r][c];
	        	}
		        salaries[r]=sum;
		        sum=0;
	        }
	        Arrays.sort(salaries);
	        return salaries[rowLen-1];
	       
	    }
	
	     
	    public static void main(String[] args)
	    {
		System.out.println("Please enter the rows in the matrix");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Please enter the columns in the matrix");
		int column = sc.nextInt();
        int[][] accounts = new int[row][column];
		
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter first[%d][%d] integer", r, c));
				accounts[r][c] = sc.nextInt();
			}
			}//outer for
		Solution1 s=new Solution1();
		int max=s.maximumWealth(accounts);
		System.out.println(max);
		}
}




*/

/*
class Solution1 {
    public static int[] shuffle(int[] nums, int n) {
    	int[] result=new int[2*n];
        for(int i=0;i<2*n;i++)
        {
         if(i%2==0)
        	 result[i]=nums[i/2];
         else
        	 result[i]=nums[n+i/2];        	
        }
        return result;
        }
public static void main(String[] args) {
    int[] input = {2,5,1,3,4,7};
    int n = 3;
        System.out.print(Arrays.toString(shuffle(input, n)));
}
        }
*/