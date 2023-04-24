package com.java.test3;

class Non
{
	int i=10;
	{
		System.out.println(i);
	}
	{
		System.out.println("Non Static of A");
	}
	
	{
		System.out.println("Non Stsic of B");
	}
	static
	{
		System.out.println("oiuytd");
	}
}
class Non1
{
	{
		System.out.println("Non1");
	}
}
public class NonStaticBlock 
{

	public static void main(String[] args) 
	{
		System.out.println("NonStstic Block");
		Non a=new Non();
		Non1 b=new Non1();
	}

}
