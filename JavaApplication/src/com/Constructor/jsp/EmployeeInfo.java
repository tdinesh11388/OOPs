package com.Constructor.jsp;

class Employee1
{
	int id;
	String name;
	int age;
	int salary;
	Employee1(int id,String name,int age,int salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	Employee1(int id,String name,Employee1 emp)
	{
		this.id=id;
		this.name=name;
		this.age=emp.age;
		salary=emp.salary;
	}
	public void display()
	{
		System.out.println("emp id= "+id);
		System.out.println("Emp Name= "+name);
		System.out.println("Emp age= "+age);
		System.out.println("salary= "+salary);
		System.out.println("                   ");
		System.out.println("___________-----______");

	}
}
public class EmployeeInfo
{

	public static void main(String[] args)
	{
		Employee1 e1=new Employee1(101,"suresh",23,40000);
		e1.display();
		Employee1 e2=new Employee1(102,"Manju",e1);
		e2.display();
		Employee1 e3=new Employee1(103,"Anil",22,400000);
		e3.display();
		Employee1 e4=new Employee1(104,"Shiva",e1);
		e4.display();
	
	}

}
