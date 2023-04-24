package com.Bank.App;

class A
{
	int i;
	public void display()
	{
		System.out.println(i);
	}
}
public class Test 
{

	public static void main(String[] args) 
	{
		A a1=new A();
		a1.i=45;
		a1.display();
		a1=new A();
		a1.display();
		A a2=new A();
		

	}

}
