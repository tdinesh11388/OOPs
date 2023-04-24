package com.dn.Encapsulation;

import java.util.Scanner;

class Student
{
	private String Name;
	private int Rollno;

	public void setName(String n)
	{
		this.Name=n;
	}
	public String getName()
	{
		return Name;
	}
	public void setRollno(int n)
	{
		if(n<=50)
		{
			this.Rollno=n;
		}
		else {
			System.out.println("Invalid Roll no.");
		}
	}
	public int getRollno()
	{
		return Rollno;
	}
}
public class GetterSetter
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter ROll.no");
		int n=scn.nextInt();
		Student s=new Student();
		s.setName("Dinesh");
		System.out.println(s.getName());
		
		s.setRollno(n);
		System.out.println(s.getRollno());
		
		

	}

}
