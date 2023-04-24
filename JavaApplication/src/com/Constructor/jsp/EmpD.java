package com.Constructor.jsp;

class EmpD1
{
	int id;
	String name;
	int age;
	public EmpD1(int id)
	{
		this.id=id;
	}
	public EmpD1(int id,String name)
	{
		this(id);
		this.name=name;
	}
	public EmpD1(int id,String name,int age)
	{
		this(id,name);
		this.age=age;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
public class EmpD
{

	public static void main(String[] args) 
	{
		EmpD1 a1=new EmpD1(1);
		a1.display();
	}

}
