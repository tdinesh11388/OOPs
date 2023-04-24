package com.java.test1;
import java.util.*;
public class fibinaciiRange {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter number x & y");
	int x=scn.nextInt();
	int y=scn.nextInt();
	int a=0,b=1,c;
	do {
		if(a>=x)System.out.println(a);
		c=a+b;
		a=b;
		b=c;
	}while(a<=y);
	

	}

}
