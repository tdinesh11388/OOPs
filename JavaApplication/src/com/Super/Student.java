package com.Super;



class Person
{  
	int id;  
	String name;  
	Person(int id,String name)
	{  
		this.id=id;  
		this.name=name;  
	}  
}  
class Emp extends Person
{  
	float salary;  
	Emp(int id,String name,float salary)
	{  
		super(id,name); 
		this.salary=salary;
	}  
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}  
}  
public class Student
{

	public static void main(String[] args)
	{
		Emp s=new Emp(1,"dinesh",50000);
		s.display();
		Emp e=new Emp(2,"Teja",90000);
		e.display();

	}

}
