package com.practice;

class M
{
	public void m1()
	{
		System.out.println("class of M");
	}
}
class N
{
	M m;
	public N(M m)
	{
		this.m=m;
		System.out.println("class N of constructor");
		m.m1();
	}
	public void m2()
	{
		System.out.println("class of N");
		m.m1();
	}
}
public class Aggrigation
{
	public static void main(String[] args)
	{
		N n=new N(new M());
		n.m2();
	}

}
