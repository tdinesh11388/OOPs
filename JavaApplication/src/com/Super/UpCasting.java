package com.Super;
class M
{
	public void m1()
	{
		System.out.println("M m1()");
	}
	void display()
	{
		System.out.println("M display");
	}
}
class N extends M
{
	public void m1()
	{
		System.out.println("N m1()");
	}
	public void m2()
	{
		System.out.println("N method");
	}

	
}
public class UpCasting 
{
	public static void main(String[] args)
	{
		M m=new N();
		m.m1();
		N n=(N) m;
		n.m1();
		n.m2();
		n.display();

				
	}

}
