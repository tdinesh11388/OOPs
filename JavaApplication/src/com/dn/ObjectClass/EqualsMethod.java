package com.dn.ObjectClass;

import java.util.Objects;

class Employee1
{
	int emp_id;
	String name;
	public Employee1(int emp_id, String name)
	{
		super();
		this.emp_id = emp_id;
		this.name = name;
	}
	
	
	@Override
	public String toString() 
	{
		return "Employee1 [emp_id=" + emp_id + ", name=" + name + "]";
	}


	@Override
	public boolean equals(Object obj)
	{
		//if(!(obj instanceof Employee)) return false;
		Employee1 e=(Employee1)obj;
		return this.emp_id==e.emp_id && this.name==e.name;
	}
	
	
}
class Company
{
	Employee1 e;
	String Cname;
	int CregNo;
	public Company(String cname, int cregNo,Employee1 e)
	{
		super();
		this.e=e;
		Cname = cname;
		CregNo = cregNo;
	}
	
	
	@Override
	public String toString()
	{
		return "Company [e=" + e + ", Cname=" + Cname + ", CregNo=" + CregNo + "]";
	}


	@Override
	public boolean equals(Object obj)
	{
		//if(!(obj instanceof Company)) return false;
		Company c=(Company)obj;
		return Cname==c.Cname && CregNo==c.CregNo;
	}
	
	
}
public class EqualsMethod
{
	public static void main(String[] args)
	{
		Employee1 e=new Employee1(102,"Dinesh");
		Company c=new Company("infosys",2345,e);
		Company c1=new Company("infosys",2345,e);
		System.out.println(c.equals(c1));
		
		System.out.println(c);
		System.out.println(c1);
	}

	
}
