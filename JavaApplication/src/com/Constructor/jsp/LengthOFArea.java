package com.Constructor.jsp;

class L
{
	int length;
	int breadth;
	public L(int len)
	{
		length=len;
		breadth=len;
	}
	public L(int len,int brth)
	{
		length=len;
		breadth=brth;
		int r3=length*breadth;
		System.out.println(r3);
	}
	public int display()
	{
		int res=length*breadth;
		return res;
	}
}
public class LengthOFArea {

	public static void main(String[] args) {
		L l1=new L(2);
		int r=l1.display();
		System.out.println(r);
		L l2=new L(3,4);
		int r1=l2.display();
		System.out.println(r1);
				

	}

}
