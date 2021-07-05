package com.arr;


	// Java program to find column
	// with max sum in a matrix
	import java.util.*;

	public class ColMaxMatrix 
	{	// No of rows and column
	static final int N = 2;

	// structure for pair
	static class Pair
	{
		int first , second;
		
		Pair(int f, int s)
		{
			first = f;
			second = s;
		}
	}

	// Function to find the column
	// with max sum
	static Pair colMaxSum(int mat[][])
	{
		// Variable to store index of
		// column with maximum
		int idx = -1;

		// Variable to store max sum
		int maxSum = Integer.MIN_VALUE;
		System.out.println(maxSum+"=======");

		// Traverse matrix column wise
		for (int i = 0; i < N; i++)
		{
			int sum = 0;

			// calculate sum of column
			for (int j = 0; j < N; j++)
			{
				sum += mat[j][i];
			}

			// Update maxSum if it is
			// less than current sum
			if (sum > maxSum)
			{
				maxSum = sum;

				// store index
				idx = i;
			}
		}

		Pair res;

		res = new Pair(idx, maxSum);

		// return result
		return res;
	}

	// Driver code
	public static void main(String args[])
	{
		int mat[][] = { { 1, 5 },
						{ 5, 3}};

		Pair ans = colMaxSum(mat);

		System.out.println("Column " + (int)(ans.first + 1) +
							" has max sum " + ans.second);
	}
	}

	// This code is contributed
	// by Arnab Kundu
