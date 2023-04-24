package com.dn.Abstraction;

class X
{
	public void dShow()
	{
		System.out.println("Dshow");
	}
}
interface AA 
{
	public void show();
}
interface BB
{
	public void show();
}
class CC extends X implements AA, BB
{
	public void show()
	{
		System.out.println("hi");
	}
	public void display()
	{
		System.out.println("m2() BB");
	}
}
public class TightCoupling
{
	public static void main(String[] args)
	{
		CC c=new CC();
		c.show();
		c.display();
		c.dShow();
		
		int i=34;
		{
			i=78;
			System.out.println(i);
		} 
		{
			System.out.println(i);
		}
		
	}

}
