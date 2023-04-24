package com.Constructor.jsp;

class Ac1 
{
	int temp;
	public Ac1() 
	{
		temp=22;
	}
	public Ac1(int temp)
	{
		this.temp=temp;
	}

}
public class Ac
{
	public static void main(String []args)
	{
		Ac1 a1=new Ac1();
		Ac1 a2=new Ac1();
		System.out.println(a1.temp);
		System.out.println(a2.temp);
		Ac1 a3=new Ac1(15);
		System.out.println(a3.temp);
	}
}



