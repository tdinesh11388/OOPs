package com.jsp.Demo;

class AA
{
	public void m1()
	{
		System.out.println("AA class");
	}
}
class BB extends AA
{
	@Override
	public void m1()
	{
		System.out.println("BB class");
	}
}
public class Over
{
	public static void main(String[] args)
	{
		BB b=new BB();
		b.m1();
	}

}
