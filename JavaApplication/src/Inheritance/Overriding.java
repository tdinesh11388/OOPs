package Inheritance;
import java.util.*;
class OA
{
	void m1()
	{
		System.out.println("m1 method");
	}
}
class OB extends OA
{
	void m2()
	{
		System.out.println("m2 method");
	}
}
class OC extends OB
{
	void m3()
	{
		System.out.println("m3 method");
	}
}
public class Overriding 
{

	public static void main(String[] args)
	{
		OC c1=new OC();
		c1.m1();
		c1.m3();
		c1.m2();
	}

}
