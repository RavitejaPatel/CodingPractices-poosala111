

package com.basicRecursive;

public class FibnaccioIterative{

	static int init;
	 static int preceeding=1; 
	 
	public static int fibnaccio(int n)
	{
		
		if(n<=2)
		
			 return 1 ;
		
			
		int f1,f2;
		f1=f2=1;
		for(int i=1;i<=n;i++)
		{
		
			int temp = f1+f2;
			System.out.println(f2+" ");
			f1=f2;
			f2=temp;
			
			
		}
		return f2;
		/*
		int i=1;
		 
		while(i<=n)
		{
			System.out.println(init);
			preceeding=preceeding+init;
			init=preceeding;
			
			i++;
		}
		*/
		
	}

	public static void main(String[] args)
	{

	System.out.println(fibnaccio(5));
	
	}
	
	
	}

