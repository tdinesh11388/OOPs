package com.dn.equals;

import java.util.Objects;

class Student1 implements Cloneable
{

    
	int sid;
	String name;
	int age;
	public Student1(int sid, String name, int age)
	{
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	protected  Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
		
	
	
}

public class StudentCloningClass
{
	

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Student1 s=new Student1(102,"Vk",20);
		System.out.println(s);
		
		Student1 s1=(Student1)s.clone();
		System.out.println(s1);
		
		Student1 s2=(Student1)s.clone();
		System.out.println(s2);
		
	}

}
