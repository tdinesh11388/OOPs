package com.practice;

public class ElementPosition {

	public static void main(String[] args) {
		  int[] a = {'A','B','C','D'};
		  int[] b = {'P','Q','A','D'};
		  
		  System.out.println(a[0]);
		  int var=0;
		  int count =0;
		  for(int i=0;i<a.length;i++) {
		   for(int j=0;j<b.length;j++) {
		    if(a[i] == b[j]) {
		     count++;
		     var = j;
		    }
		   }
		   
		   if(count!=0) {
		    System.out.println((char)a[i]+"-"+var);
		   } 
		   else System.out.println((char)a[i]+"-"+"NA");
		   count =0;
		  }
		 }

}
