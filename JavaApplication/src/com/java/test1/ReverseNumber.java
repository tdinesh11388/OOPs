package com.java.test1;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=scn.nextInt();
		int rev=0;
		int n=num;
		while(num>0)
		{
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		if(rev==n) System.out.println("palindrome");
		else System.out.println("not a palindrome");

	}

}
