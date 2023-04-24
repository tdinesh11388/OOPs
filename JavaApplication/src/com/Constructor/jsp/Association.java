package com.Constructor.jsp;

class X
{
	public void m1()
	{
		System.out.println("M1 printed");
	}
}
class Z
{
	public void m2()
	{
		X a1=new X();
		a1.m1();
		System.out.println("After m1(),m2() is executed");
	}
}
public class Association 
{
	public static void main(String[] args) 
	{
		Z b1=new Z();
		b1.m2();

	}

}
