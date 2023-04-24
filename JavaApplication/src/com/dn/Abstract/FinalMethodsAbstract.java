package com.dn.Abstract;

public abstract class FinalMethodsAbstract
{
	public final static void main(String[] args)
	{
		System.out.println("final method");
	}
	public final void m2()
	{
		System.out.println("OIUYF");
	}
	public final void m3()
	{
		
	}
}
class AAAA 
{
	public final void m1()
	{
		System.out.println("oiuyt");
	}
}
class BBBB extends AAAA
{
	public final void m1()
	{
		System.out.println("poiu");
	}
}
