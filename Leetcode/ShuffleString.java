


package com.arr;

public class ShuffleString {



	   public String restoreString(String s, int[] indices) {
	        char[] answer = new char[indices.length];
	        char[] s1=s.toCharArray();
	        for(int i=0;i<indices.length;i++){
	            answer[indices[i]]=s1[i];
	        }
	        return String.valueOf(answer);
	    }
		

	   public static void main(String[] args)
	   {
		   ShuffleString met=new ShuffleString();	   
     String str="codeleet";
     int[] indecesArr= {4,5,6,7,0,2,1,3};
      System.out.println(met.restoreString(str,indecesArr));	
	   }
}

	
	
/*
public class ShuffleString {

public String restoreString(String s,int[] indices) {
	int i=0;

	    
	 
	while(i<indices.length-1/2)
	{
		int temp=indices[i];
		indices[temp]=temp;
	
		indices[i]=i;
		
		System.out.println(s);
	s=s.replace(s.charAt(temp), s.charAt(i));
       
		 i++;
	}
	return s;
	
}	
	   public static void main(String[] args)
	   {
		   ShuffleString met=new ShuffleString();	   
        String str="codeleet";
        int[] indecesArr= {4,5,6,7,0,2,1,3};
        System.out.println(met.restoreString(str,indecesArr));	
	   }
}

*/
/*

public class ShuffleString {
	   public String restoreString(String s,int[] indices) {
		  
		   String str=" ";
		       for(int i=0;i<indices.length;i++)
		       {
		    	   if(indices[i]!=i)
		    	   {
		    		   indices[i]=i;
		    	   }
		    	  int temp=indices[i];
		    	  System.out.println("------------"+temp);
		    	  str=str+s.charAt(temp);
		       }
			   
			   return str;
	    }
	
	   
	   public static void main(String[] args)
	   {
		   ShuffleString met=new ShuffleString();	   
           String str="codeleet";
           int[] indecesArr= {4,5,6,7,0,2,1,3};
           
		  System.out.println(met.restoreString(str,indecesArr));		   
	   }
}






*/









/*


public class ShuffleString {
	   public String restoreString(String s,int[] indices) {
		   
		   String str=" ";
	       for(int i=0;i<indices.length;i++)
	       {
	    	   
	    	  int temp=indices[i];
	    	  System.out.println(temp);
	    	  
	    	  str=str+s.charAt(temp);
	       }
		   
		   return str;
	    }
	
	   
	   public static void main(String[] args)
	   {
		   ShuffleString met=new ShuffleString();	   
           String str="art";
           int[] indecesArr= {1,0,2};
           
		  System.out.println(met.restoreString(str,indecesArr));		   
	   }
}
*/