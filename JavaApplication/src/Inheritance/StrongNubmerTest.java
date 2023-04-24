package Inheritance;

import java.util.Scanner;

class Factorial1
{
	public int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
class Strong extends Factorial1
{
	
	public int strong(int num)
	{
		int res=0;
		while(num>0)
		{
			int a=num%10;
			res=res+factorial(a);
			num/=10;
		}
		return res;
	}
}
public class StrongNubmerTest 
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer");
		int a=scn.nextInt();
		Strong s=new Strong();
		for(int i=1;i<=a;i++)
		{
			if(s.strong(i)==i)System.out.println(i);
		}
	}

}
