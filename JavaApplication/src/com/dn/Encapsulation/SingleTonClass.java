package com.dn.Encapsulation;

class M
{
	static int i=23;
	static M t=null;
	static int count=0;
	private M()
	{
		count++;
		System.out.println(i);
	}
	public static M getInstance()
	{
		if(t==null)t=new M();
		return t;
	}
}
public class SingleTonClass
{
	public static void main(String[] args)
	{
		M m=M.getInstance();
		M m1=M.getInstance();
		M m2=M.getInstance();
		System.out.println(m==m1);
		System.out.println(m1==m2);
		System.out.println(m2==m);
		System.out.println(M.count);
	}

}
