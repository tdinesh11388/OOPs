package com.java.test3;


class Nn{
	int i;
	public void display()
	{
		System.out.println(i);
	}
}
public class Test2 
{

	public static void main(String[] args) 
	{
		Nn a1=new Nn();
		Nn a2=a1;
		a1.i=3;
		System.out.println(a1.i);
		

		
		

	}

}
