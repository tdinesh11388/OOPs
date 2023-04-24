package com.java.Test;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 System.out.println("Enter Number");
		 int num=scn.nextInt();
		 if(num<0) System.out.println("it is a negative Number");
		 else {
			 int fact=1;
			 for(int i=1;i<=num;i++)
			 {
				 fact=fact*i;
				 System.out.println(num+"!"+fact);
			 }
		 }
	}

}
