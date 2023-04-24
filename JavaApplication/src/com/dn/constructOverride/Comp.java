package com.dn.constructOverride;
class Comp1
{
	public void m1()
	{
		System.out.println("kjhgfdcv");
	}
}
class Comp2
{
	Comp1 c;
	public Comp2(Comp1 c)
	{
		this.c=c;
		c.m1();
	}
	public void m2()
	{
		System.out.println("m2()kjhg");
	}
}
public class Comp
{
	public static void main(String[] args)
	{	
		Comp2 c=new Comp2(new Comp1());
		c.m2();
		
	}

}
