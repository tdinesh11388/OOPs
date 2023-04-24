package Inheritance;

class GrandFather
{
	static int a=10;
	int z=40;
	void DoingCall()
	{
		int x=30;
		System.out.println(x);
		System.out.println("oiuytd");
	}
}
class Parent extends GrandFather
{
	int b=20;
	 void DoingCall()
	{
		System.out.println("789452784");
	}
}
class Child extends Parent
{
	int c=30;
	void DoingCall()
	{
		System.out.println("78952111111");
	}
}
class GrandChild extends Child
{
	void DoingCall()
	{
		System.out.println("9851255412");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(z);
		
	}
}
public class Call
{
	public static void main(String[] args) 
	{
		GrandChild c=new GrandChild();
		c.DoingCall();
		
	}

}
