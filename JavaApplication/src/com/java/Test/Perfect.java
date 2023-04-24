package com.java.Test;

public class Perfect {
	public static int perfect(int num)
	{
		int res=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0) res=res+i;
		}
		return res;
	}
	
	public static int prime(int num)
	{
		int count=0;
		if(num<=1)System.out.println("not a prime number");
		for(int i=2;i<num;i++)
		{
			if(num%i==0)count++;
		}
		return count;
	}
	public static int neon(int num)
	{
		int m=num*num;
		int res=0;
		while(m>=0)
		{
			res=res+m%10;
			m=m/10;
		}
		return res;
	}
	/*public static void main(String[]args)
	{
		int n=neon(9);
		if(n==9)System.out.println("neon number");
		else System.out.println("not a neon number");
		
	}*/
	public static void main(String[]args)
	{
		int num=9;
		int n=num*num;
		int res=0;
		while(n>0)
		{
			res=res+n%10;
			n=n/10;
		}
		if(res==num)System.out.println("neon number");
		else System.out.println("not a neon Number");
	}
}
