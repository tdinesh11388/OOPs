package com.Super;
class Animal
{
	String color="Black";
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal
{
	String color="White";
	void printColor()
	{
		System.out.println(color);
		System.out.println(super.color);
		super.eat();
	}
}
public class Test 
{

	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.printColor();
	}

}
