package com.dn.ObjectClass;

class Obj
{
	int i;
	Obj(int i)
	{
		this.i=i;
	}
	@Override
	public boolean equals(Object obj) 
	{
		return super.equals(obj);
	}
	
}
public class Object1 
{

	public static void main(String[] args) 
	{
		Obj obj=new Obj(10);
		System.out.println(obj);
	}

}
