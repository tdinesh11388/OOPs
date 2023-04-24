package Inheritance;

import java.util.Scanner;

class Factorial
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
class StrongNumber extends Factorial
{
	public int strong(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+factorial(rem);
			num/=10;
		}
		return sum;
	}
}
public class StrongNumberINInheritance 
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter nubmer");
		int n=scn.nextInt();
		StrongNumber s=new StrongNumber();
		if(n<=0)System.out.println("NO Zeros, Negatives");
		else {
			int result=s.strong(n);
			if(result==n)System.out.println("Strong nubmer");
			else System.out.println("Not a strong nubmer");
		}
	}

}
