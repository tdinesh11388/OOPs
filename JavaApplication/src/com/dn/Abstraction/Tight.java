package com.dn.Abstraction;

interface Demo
{
	public void m1();
}
interface Demo1
{
	public void m1();
}
class Demo3 implements Demo,Demo1
{
	@Override
	public void m1()
	{
		System.out.println("i");
	}
}
public class Tight
{
	public static void main(String[] args)
	{
		Demo3 d=new Demo3();
		d.m1();
	}

}
