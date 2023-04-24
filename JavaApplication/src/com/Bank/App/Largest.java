package com.Bank.App;

public class Largest
{

	public static void main(String[] args)
	{
		int n=054321;
		int a,b,c,d,e;
		int f=0;
		while(n>0)
		{
			a=n%10;
			System.out.println(a);
			n=n/10;
			b=n%10;
			System.out.println(b);
			n/=10;
			c=n%10;
			System.out.println(c);
			n/=10;
			d=n%10;
			System.out.println(d);
			n/=10;
			e=n%10;
			System.out.println(e);
			n/=10;
		
			
		}

	}

}
