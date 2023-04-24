package com.Constructor.jsp;

class Call
{
	int id;
	int age;
	String name;
	Call(int id)
	{
		this.id=id;
	}
	Call(int id,int age)
	{
		this(id);
		this.age=age;
	}
	Call(int id,int age,String name)
	{
		this(id,age);
		this.name=name;
	}
	Call(int id,Call c,String name)
	{
		this.id=id;
		age=c.age;
		this.name=name;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(age);
		System.out.println(name);
		System.out.println("__--------------");
	}
}
public class This 
{

	public static void main(String[] args) 
	{
		Call c1=new Call(1,22,"Dn");
		c1.display();
		Call c2=new Call(2,c1,"mnhg");
		c2.display();
	}

}
