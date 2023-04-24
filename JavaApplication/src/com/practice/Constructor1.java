package com.practice;
import java.util.*;
class Factorial
{
	int factorial(int num)
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
	int strong(int num)
	{
		Factorial f=new Factorial();
		int str=0;
		while(num>0)
		{
			str=str+f.factorial(num%10);
			num=num/10;
		}
		return str;
	}
}
public class Constructor1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer strong nubmer");
		int num=scn.nextInt();
		Strong s=new Strong();
		if(num<=0) {
			System.out.println("No Negative nubmers");
		}
		else {
			int r=s.strong(num);
			if(r==num)System.out.println(r);
		}
		
	}

}
