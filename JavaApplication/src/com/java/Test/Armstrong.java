package com.java.Test;

public class Armstrong {
	public static int lenth(int num)
	{
		int len=0;
		for(;num>0;num/=10)
		{
			len++;
		}
		return len;
	}
	public static int power(int base,int exp)
	{
		int res=1;
		for(int i=1;i<=exp;i++)
		{
			res=res*base;
		}
		return res;
	}
	public static int Arm(int num)
	{
		int lenNum=lenth(num);
		int res=0;
		for(;num>0;num/=10)
		{
			res=res+power(num%10,lenNum);
		}
		return res;
	}
	public static void main(String[]args)
	{
		int res=Arm(148);
		if(res==153)System.out.println("Armstrong");
		else System.out.println("Not a Armstrong");
	}
}
