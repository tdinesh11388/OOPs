package com.dn.equals;

import java.util.Objects;

class AA
{
	int i;
	int j;
	public AA(int i, int j) 
	{
		super();
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		return "AA [i=" + i + ", j=" + j + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof AA))return false;
		 AA a=(AA)obj;
		 return (this.i==a.i && this.j==a.j);
	}
	
}
public class ObjClass 
{
	public static void main(String[] args)
	{
		AA a1=new AA(10,20);
		AA a2=new AA(10,20);
		System.out.println(a1.equals(a2));
	}

}
