package com.dn.Interface;

@FunctionalInterface
interface FIT
{
	int j=57;
	int i=45;
	void m1();
	default void m2()
	{
		System.out.println(j);
	}
	static void m3()
	{
		System.out.println(i);
	}
}
@FunctionalInterface
interface FIT1 
{
	void m4();
}
class C implements FIT,FIT1
{
	@Override
	public void m1()
	{
		System.out.println(i);
	}
	public void m2()
	{
		System.out.println(i);
	}
	public void m4()
	{
		System.out.println(j);
	}
}
public class FunctionInterface
{
	public static void main(String[] args)
	{
		FIT f=new C();
		f.m1();
		f.m2();
		FIT.m3();
		FIT f1=(FIT)f;
		f.m2();
		((FIT1)f).m4();
	}

}
