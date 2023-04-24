package com.dn.ObjectClass;

class Test
{
	int length;
	int breadth;
	
	public Test(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}

	//@Override
	//public String toString()
	//{
		//return "Test [ Area of Rectangele = " + length *breadth +"]";
	//}
	
	
	
	
}
public class Rectangle
{
	public static void main(String[] args)
	{
		Test t=new Test(2,4);
		Test t1=new Test(7,8);
		Test t2=new Test(7,6);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t);
	}
}
