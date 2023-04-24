package com.jsp.Demo;

interface AB
{
	public void m1();
}
public class Inter implements AB
{
	public void m1()
	{
		System.out.println("neihf");
	}
	public static void main(String[] args)
	{
		Inter i=new Inter();
		i.m1();
	}

}
