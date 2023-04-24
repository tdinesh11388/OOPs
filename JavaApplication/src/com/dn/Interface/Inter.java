package com.dn.Interface;

interface I
{
	void m1();
	void m2();
	void m3();
	int x=34;
	static int y=56;
}
interface II extends I
{
	void m3();
	void m2();
	void m4();
	default void m5()
	{
		System.out.println("m5 of II");
	}
	static void m6()
	{
		System.out.println("m6 of II");
	}
}
class In implements II
{
	@Override
	public void m1()
	{
		System.out.println("m1() implement by In");
	}
	@Override 
	public void m2()
	{
		System.out.println("m2() implement by IN");
	}
	@Override
	public void m3()
	{
		System.out.println("m3() implement by IN");
	}
	public void m4()
	{
		System.out.println("m4() implement by In");
	}
}
public class Inter
{
	public static void main(String[] args)
	{
		I i=new In();
		i.m2();
		i.m1();
		i.m3();
		System.out.println(I.x);
		System.out.println(I.y);
		//((In)i).m4();
		In n=(In)i;
		n.m4();
		n.m5();
		II i1=(II)i;
		i1.m5();
		II.m6();
	}

}
