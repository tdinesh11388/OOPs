package com.Super;

class Animal1
{
	void drink()
	{
		System.out.println("all animals drink water");
	}
	void eat()
	{
	
	}
	void sound()
	{
		
	}
}
class Lion extends Animal1
{
	void eat()
	{
		System.out.println("meet");
	}
	void sound()
	{
		System.out.println("Roaring");
	}
	void hunt()
	{
		System.out.println("hunting");
	}
}
class Cow extends Animal1
{
	void sound()
	{
		System.out.println("ambaaa");
	}
	void eat()
	{
		System.out.println("grass");
	}
	void milk()
	{
		System.out.println("Cow gives Milk");
	}
}
public class Generalization
{
	public static void main(String[] args)
	{
		Animal1 a=new Cow();
		a.drink();
		a.eat();
		a.sound();
		System.out.println("**************");

		Cow c=(Cow)a;
		c.drink();
		c.eat();
		c.sound();
		c.milk();
		System.out.println("********************");
		
		Animal1 a1=new Lion();
		Lion l=(Lion) a1;
		l.eat();
		l.drink();
		l.hunt();
		l.sound();
	}

}
