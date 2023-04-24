package com.dn.constructOverride;
 class A
{
	 int i;
	 int j;
	 int k;
	public A()
	{
		System.out.println("kjgf");
	}
	public A(int i)
	{
		this.i=i;
		System.out.println(i);
	}
	public A(int i,int j)
	{
		this(i);
		this.j=j;
		System.out.println(j);
	}
	public A(int i,int j,int k)
	{
		
		this(i,j);
		this.k=k;
		System.out.println(k);
	}
}
class B 
{
	int i;
	int j;
	public B(A a)
	{
		this.i=a.i;
		this.j=a.j;
		System.out.println(j);
		System.out.println("B ="+i);
	}
}
public class Test
{
	public static void main(String[] args)
	{
		A a=new A(10,20,40);
		B b=new B(a);
	}
}
