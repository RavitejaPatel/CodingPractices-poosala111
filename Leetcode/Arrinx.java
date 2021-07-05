package com.arr;

import java.util.Arrays;
 
class Program
{
    public static void main(String[] args)
    {
        int[] arr = { -1, -1, 6, 1, 9, 3 };
        for (int i = 0; i < arr.length;)
        {
            if (arr[i] >= 0 && arr[i] != i)
            {
                int ele = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = ele;
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
 