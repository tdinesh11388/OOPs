package com.Constructor.jsp;


class Emp
{
	int id;
	String name;
	int age;
	int salary;
	String Company="Dn Technologies";
	public Emp(int id,String name,int age,int salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Employee id="+id);
		System.out.println("emp name="+ name);
		System.out.println("emp age="+age);
		System.out.println("salary="+salary+"rs");
		System.out.println("Company name="+Company);
		System.out.println("**************************");
	}
}
public class Employee 
{

	public static void main(String[] args) 
	{
		Emp a1=new Emp(101,"Kumara",60,32);
		a1.display();
		Emp a2=new Emp(102,"Gagan",59,30);
		a2.display();
	}

}
