package com.Super;
class A1
{
	 int j=5;
	A1()
	{
		int z=8;
		int j=45;
		System.out.println("lkjhgf");
		System.out.println(j);
	}
	public void display()
	{
		System.out.println(j);
	}
}
class B1 extends A1
{
	B1(int i)
	{
		//super(10);
		System.out.println("hello");
		System.out.println("m");
		System.out.println(i);
		
		System.out.println(super.j);
	}
}
class C1 extends B1
{
	C1()
	{
		super(45);
		System.out.println("C1 method");
		super.display();
	}
}
public class SuperCall
{
	public static void main(String[] args)
	{
		C1 c=new C1();
		
	}

}
