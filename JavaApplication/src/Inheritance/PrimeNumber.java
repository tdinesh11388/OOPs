package Inheritance;

import java.util.Scanner;

class Prime
{
	public int prime(int num)
	{
		if(num<=1)return num;
		int res=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)res++;
		}
		return res;
	}
}
public class PrimeNumber extends Prime
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int num=scn.nextInt();
		PrimeNumber p=new PrimeNumber();
		int res=p.prime(n);
		int alt=0;
		for(int i=n;i<=num;i++)
		{
			int count=p.prime(i);
			if(count==0) {
				alt++;
			}
			if(alt%2==1) {
				System.out.println(i);
			
			}
		}
		
	}

}
