package com.java.test3;

class Test
{
	int st_Id=101;
	String Name="dinesh";
	int age=22;
	String Gender="Male";
	String phone="9182755085";
	
	public void student()
	{
		System.out.println(st_Id);
		System.out.println(Name);
		System.out.println(age);
		System.out.println(Gender);
		System.out.println(phone);
	}
}
class Demo
{
	int st_Id=102;
	String Name="hemanth";
	int age=23;
	String Gender="Male";
	String phone="9182755085";
	
	public void student1()
	{
		System.out.println(st_Id);
		System.out.println(Name);
		System.out.println(age);
		System.out.println(Gender);
		System.out.println(phone);
	}
}

class A
{
	static String College_Name="Dravidian";
	static String college_Address="Kuppam";
	
	public static void Address()
	{
		System.out.println(College_Name);
		System.out.println(college_Address);
	}
}
public class Student
{
	public static void main(String[]args)
	{
		
		Demo s1=new Demo();
		s1.student1();
		A.Address();
		Test s=new Test();
		s.student();
		A.Address();
	}
}

