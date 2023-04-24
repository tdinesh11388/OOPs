package com.dn.equals;

import java.util.Objects;

class A
{
	int i;
	public A(int i)
	{
		this.i=i; 
	}
	
	
	@Override
	public String toString() {
		return "A [i=" + i + "]";
	}


	@Override
	public boolean equals(Object obj) //(object)obj its reciving the object type,internally getting upcasting
	{
		
		if(!(obj instanceof A)) return false;
		return this.i==((A)obj).i;
		
		     //  or
		
		//A a=(A)obj;//downcasting
		//return this.i==a.i;
	}
	
}
class B
{
	
}
public class TestEqual
{

	public static void main(String[] args)
	{
		A a1=new A(10); // creating a object of A type -A is the class type
		A a2=new A(10);
		
		B b=new B();
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a1));
		
		System.out.println(a1.equals(b));
	}

}
