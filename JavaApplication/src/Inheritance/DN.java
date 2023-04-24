package Inheritance;
class C
{
	int i=34;
	public void m1()
	{
		System.out.println(i);
	}
}
class D extends C
{
	int k=89;
	public void m1()
	{
		System.out.println(k);
	}
}

public class DN
{
	public static void main(String[] args) 
	{
		D d=new D();
		d.m1();
	}
}
