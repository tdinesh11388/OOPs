package com.Super;

class Dog1
{
	Dog1()
	{
		System.out.println("Dog barging");
	}
}
class Cow1 extends Dog1
{
	Cow1()
	{
		System.out.println("Ambaaa");
	}
}
public class Animal
{
	public static void main(String[] args)
	{
		Cow1 c=new Cow1();

	}

}
