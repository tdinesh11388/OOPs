package com.java.test3;
import java.util.*;
class Demo1{
	Scanner scn=new Scanner(System.in);
	int id;
	int age;
	String Gender;
	String phone;
	static String Address;
	static String clg;
	
	
	public void m1()
	{
		System.out.println("Enter id");
		id=scn.nextInt();
		System.out.println(id);
		System.out.println("Enter age");
		age=scn.nextInt();
		System.out.println(age);
		System.out.println("Enter Gender");
		Gender=scn.next();
		System.out.println(Gender);
		System.out.println("Enter Phone Number");
		phone=scn.next();
		System.out.println(phone);
	}
	public static void m2()
	{
		clg="Dravidian university";
		System.out.println(clg);
		Address="Kuppam";
		System.out.println(Address);
	}
}
class student1 
{
	public static void main(String[] args) 
	{
		
		Demo1 a=new Demo1();
		a.m1();
		Demo1.m2();
	}
}
