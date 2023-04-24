package Inheritance;

class AB
{
	int i;
	static int j;
	public void m1()
	{
		i=10;
		j=20;
		System.out.println(j);
		System.out.println(i);
		System.out.println("hello");
	}
}
class BC extends AB
{
	int j=100;
	public void m2()
	{
		System.out.println(j);
		System.out.println("m2 Method");
	}
}
class CD extends BC
{
	public void m3()
	{
		System.out.println("c method");
	}
}

public class Inheritance1
{

	public static void main(String[] args)
	{
		CD c=new CD();
		
		c.m3();
		c.m2();
		c.m1();
	}

}
