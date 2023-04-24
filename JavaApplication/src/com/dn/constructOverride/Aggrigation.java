package com.dn.constructOverride;

class Agg
{
	public void m1()
	{
		System.out.println("kjh");
	}
}
class Aggr
{
	Agg a;
	public void m2()
	{
		
		a=new Agg();
		a.m1();
		System.out.println("kjhg");
	}
}
public class Aggrigation 
{
	public static void main(String[] args)
	{
		Aggr a1=new Aggr();
		a1.m2();
	}

}
