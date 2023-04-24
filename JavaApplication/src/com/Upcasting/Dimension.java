package com.Upcasting;
import com.Super.*;
class Circle extends Shape
{
	@Override
	public void shapeOfDiagram()
	{
		System.out.println("there is no edges in circle");
	}
	public void m2()
	{
		System.out.println("Circle of m2()");
	}
}
class Rectangle extends Shape
{
	@Override
	public void shapeOfDiagram()
	{
		System.out.println("4 edges in rectangle");
	}
	public void m2()
	{
		System.out.println("Rectangle of m2");
	}
}
class Triangle extends Shape
{
	@Override
	public void shapeOfDiagram()
	{
		System.out.println("3 edges in Triangle");
	}
	public void m2()
	{
		System.out.println("Triangle of m2");
	}
}
public class Dimension
{
	public static void main(String[] args)
	{
		Shape s=new Circle();
		s.shapeOfDiagram();
		Shape s1=new Rectangle();
		s1.shapeOfDiagram();
		Shape s2=new Triangle();
		s2.shapeOfDiagram();
		
		Circle c=(Circle)s;
		c.m2();
		
		
		
	}

}
