package com.practice;

public class RightShift 
{
	 public static void main(String[] args) {
		  
		  String s = "TRACXN";
		  int len = s.length();
		  char[] c = s.toCharArray();
		  
		  for(int i=0;i<len;i++) {
		   for(int j=0;j<=i;j++) {
		    System.out.print(c[j]);
		   }
		   System.out.println();
		  }
		  
		 }

		
}
