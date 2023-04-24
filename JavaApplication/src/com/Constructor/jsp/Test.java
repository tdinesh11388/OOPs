package com.Constructor.jsp;

class A
{
	int i;
	public A(int i)
	{
		this.i=i;                       //local var
		
	}
}
public class Test 
{
	public static void main(String[] args) 
	{
		
		A a1=new A(12);
		A a2=new A(45);
		A a3=new A(7);
		System.out.println(a3.i);
		System.out.println(a1.i);
		System.out.println(a2.i);
	}

}
