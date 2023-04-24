package Inheritance;

class A1
{
	public int  foo()
	{
		return 8;
	}
	void print()
	{
		System.out.println("method m1");
	}
}
class B1 extends A1
{
	public int foo()
	{
		return 4;
	}
	void print()
	{
		System.out.println("Method m2");
	}
}
class C1 extends B1
{
	public int foo()
	{
		return 9;
	}
	
	void print()
	{
		System.out.println("Method m3");
	}
}
public class Covarient 
{

	public static void main(String[] args)
	{
		
		C1 c=new C1();
		c.print();
	}

}
