package com.Upcasting;

class V
{
	int i=4;
	public void m1()
	{
		System.out.println("oiuy");
	}
	public void m3()
	{
		System.out.println("m3 of V");
	}
	public void m4()
	{
		System.out.println("m4 of V");
	}
}
class W extends V
{
	@Override
	public void m1()
	{
		System.out.println(i+"oiu");
	}
	public void m2()
	{
		System.out.println("W method");
	}
	public void m4()
	{
		System.out.println("m4 of W");
	}
}
public class Upcasting 
{
	public static void main(String[] args) 
	{
		V a1=new W();
		a1.m1();
		
		W w=(W)a1;
		w.m2();
		
		w.m3();
		a1.m3();
		a1.m4();
		w.m4();
	}

}
