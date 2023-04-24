package com.Constructor.jsp;


class AFR
{
	int length;
	int breadth;
	public AFR()
	{
		length=12;
		breadth=18;
	}
	public AFR(int len)
	{
		length=len;
		breadth=18;
	}
	public AFR(int len,int brth)
	{
		length=len;
		breadth=brth;
	}
	public void display()
	{
		int result=length*breadth;
		System.out.println(result);
	}
}
public class AreaOfRect {

	public static void main(String[] args) {
		AFR a1=new AFR();
		a1.display();
		AFR a2=new AFR(8);
		a2.display();
		AFR a3=new AFR(6,8);
		a3.display();

	}

}
