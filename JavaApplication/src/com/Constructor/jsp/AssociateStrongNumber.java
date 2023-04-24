package com.Constructor.jsp;

import java.util.Scanner;

class Factorial
{
	public int Factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
class Strong
{
	public int Strong(int n)
	{
		Factorial f1=new Factorial();
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			sum=sum+f1.Factorial(a);
			n=n/10;
		}
		return sum;
	}
}
public class AssociateStrongNumber
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter numbmer");
		int num=scn.nextInt();
		Strong s=new Strong();
		/*if(num<=1)System.out.println("No negative");
		else {
			Strong s=new Strong();
			int res=s.Strong(num);
			if(res==num)System.out.println("Strong");
			else System.out.println("Not a Strong");
		}*/
	   for(int i=1;i<=num;i++)
	   {
		   if(i==s.Strong(i))System.out.println(i);
	   }
	}

}
