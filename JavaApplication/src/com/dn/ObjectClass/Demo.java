package com.dn.ObjectClass;

class Demo1
{
	int stdId;
	String stdName;
	String stdCourse;
	
	Demo1(int stdId,String stdName,String stdCourse)
	{
		this.stdId=stdId;
		this.stdName=stdName;
		this.stdCourse=stdCourse;
	}
	@Override
	public String toString()
	{
		return "Demo1 [stdId=" + stdId + ", stdName=" + stdName + ", stdCourse=" + stdCourse + "]";
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
		Demo1 d=new Demo1(101,"Dinesh","MCA");
		Demo1 d1=new Demo1(102,"Virat","MCA");
		System.out.println(d);
		System.out.println(d1.getClass().getSimpleName());
		System.out.println(d1);
	}

}
