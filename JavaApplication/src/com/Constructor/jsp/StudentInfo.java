package com.Constructor.jsp;

class Std
{
	int sid;
	String sname;
	int sage;
	static String clg="SVU";
	
	public Std(int id,String name,int age)
	{
		sid=id;
		sname=name;
		sage=age;
	}
	public void display()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);
		System.out.println(clg);
		System.out.println("*****************************");
	}
}

public class StudentInfo 
{

	public static void main(String[] args) 
	{
		Std s1=new Std(101,"Dinesh",18);
		s1.display();
		Std s2=new Std(102,"Virat",33);
		s2.display();
	}

}
