package com.dn.Encapsulation;

class AA
{
	static int count;
	 AA t=null;
	private AA()
	{
		count++;
	}
	public static AA getInstance()
	{
		return new AA();
	
	}
}
public class PrivateConstructor
{
	public static void main(String[] args) 
	{
		AA a1=AA.getInstance();
		AA a2=AA.getInstance();
		AA a3=AA.getInstance();
		System.out.println(AA.count);
		
	}

}
