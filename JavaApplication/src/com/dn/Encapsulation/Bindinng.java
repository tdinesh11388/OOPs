package com.dn.Encapsulation;

class Early
{
	public void m1()
	{
		System.out.println("Early binding");
	}
}
class Late extends Early
{
	
	public  void m1()
	{
		System.out.println("Late binding");
	}
}
public class Bindinng
{
	public static void main(String[] args)
	{
		Early e=new Late();
		e.m1();
	}

}
