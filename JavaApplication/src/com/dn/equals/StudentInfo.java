package com.dn.equals;

import java.util.Objects;

class Student
{
	int stdId;
	String name;
	String Course;
	public Student(int stdId, String name, String course)
	{
		super();
		this.stdId = stdId;
		this.name = name;
		Course = course;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student)) return false;
		Student s=(Student)obj;
		return this.stdId==s.stdId && this.name==s.name && this.Course==s.Course;
		
		
		//Student s=(Student)obj;
		//return this.stdId==s.stdId && this.name==s.name && this.Course==s.Course;
	}
	
	
	
}
public class StudentInfo
{
	public static void main(String[] args)
	{
		Student s1=new Student(101,"Dinesh","mCA");
		Student s2=new Student(101,"Dinesh","MCA");
		System.out.println(s2==s1);
		System.out.println(s2.equals(s1));
		
		System.out.println(s1==s2); //false
		
		String s3="Java";
		String s4="Java";
		
		System.out.println(s3==s4); //true
		
		
	}

}
