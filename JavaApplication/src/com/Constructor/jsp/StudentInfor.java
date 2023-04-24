package com.Constructor.jsp;

class Student
{
	int id;
	String name;
	int age;
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	Student(int id,String name,Student s)
	{
		this.id=id;
		this.name=name;
		age=s.age;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println("-----------------");
	}
}
public class StudentInfor 
{

	public static void main(String[] args) 
	{
		Student s1=new Student(1,"Dinesh",22);
		s1.display();
		Student s2=new Student(2,"Virat",23);
		s2.display();
		Student s3=new Student(3,"Ashok",s1);
		s3.display();
		Student s4=new Student(4,"CBN",s2);
		s4.display();
	}

}
