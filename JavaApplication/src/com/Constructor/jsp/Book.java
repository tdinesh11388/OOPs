package com.Constructor.jsp;

class B
{
	String color;
	String Author;
	int age;
	public B()
	{
		color="Yellow";
		Author="ChandraBabu";
		age=18;
	}
	public B(String color,String Author,int age)
	{
		this.color=color;
		this.Author=Author;
		this.age=age;
	}
	public void bookDisplay()
	{
		System.out.println(color);
		System.out.println(Author);
		System.out.println(age);
		System.out.println("*****************");
	}
}
public class Book 
{

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.bookDisplay();
		B b2=new B("Red","Dinesh",22);
		b2.bookDisplay();
	}

}
