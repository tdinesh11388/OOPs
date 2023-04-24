package com.dn.equals;

import java.util.Objects;

class Rectangle
{
	int length;
	int breadth;
	public Rectangle(int length, int breadth)
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public String toString()
	{
		return "Area of Rectangle = [" + length * breadth + "]";
	}
	
	
	//equals method already overiden, its predifined
	// equals method used to compare,based on the content
	
		@Override
	public boolean equals(Object obj)     
	{
			if(!(obj instanceof Rectangle)) return false;
			
			return this.length==((Rectangle)obj).length && this.breadth==((Rectangle)obj).breadth;
			
			//			    or
			
			//Rectangle r=(Rectangle)obj;
			//return this.length==r.length && this.breadth==r.breadth;
	}
	
	
}
public class RectangleClass 
{

	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(10,20);
		Rectangle r2=new Rectangle(10,20);
		System.out.println(r1==r2);
		System.out.println(r1.equals(r2));
		
		System.out.println(r1);
	}

}
