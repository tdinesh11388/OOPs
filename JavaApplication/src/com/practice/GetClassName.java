package com.practice;
import java.lang.*;
public class GetClassName
{
	public static void main(String[] args)
	{
		GetClassName c=new GetClassName();
		Class c1=c.getClass();
		System.out.println(c1.getSimpleName());
	}
}
