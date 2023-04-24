package com.dn.ObjectClass;

class Employee implements Cloneable
{
	int emp_Id;
	String name;
	public Employee(int emp_Id, String name)
	{
		super();
		this.emp_Id = emp_Id;
		this.name = name;
	}
	
	
	@Override
	public String toString()
	{
		return "Employee [emp_Id=" + emp_Id + ", name=" + name + "]";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class CloneObject
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employee e1=new Employee(101,"Dinesh");
		Employee e2=(Employee) e1.clone();
		Employee e3=(Employee) e1.clone();
		e2.name="Virat";
		e2.emp_Id=45;
		System.out.println(e2);
		System.out.println(e1);
		System.out.println(e3);
	}

}
