package com.dn.Abstract;
abstract class SM
{
	public static  void m1()
	{
		System.out.println("kjhgf");
	}
	public void m2()
	{
		System.out.println("poinfg");
	}
}
class SM1 extends SM
{
	
}
public abstract class StaticMethod
{
	public static void main(String[] args)
	{
		SM s=new SM1();
		s.m1();
		s.m2();
		System.out.println("poiuyt");
		
	}

}
