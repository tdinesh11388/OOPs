package Inheritance;

class A
{
	public void m1()
	{
		System.out.println("Java");
	}
}
class B extends A
{
	public void m2()
	{
		System.out.println("Python");
	}
}
public class Inheritance 
{

	public static void main(String[] args)
	{
		B b1=new B();
		b1.m2();
		b1.m1();

	}

}
