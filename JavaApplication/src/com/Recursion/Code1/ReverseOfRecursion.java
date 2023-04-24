package com.Recursion.Code1;
import java.util.*;
public class ReverseOfRecursion 
{
	static int rev=0;
	public static int display(int n)
	{
		if(n==0)return 0;
		else {
			rev=rev*10+n%10;
		}		
		display(n/10);
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer");
		int n=scn.nextInt();
		int r=display(n);
		if(r==n)System.out.println("palindrome");
		else System.out.println("Not a palindrome");
		
		
	}

}
