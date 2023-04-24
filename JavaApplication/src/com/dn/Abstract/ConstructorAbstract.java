package com.dn.Abstract;

abstract class CA
{
	CA()
	{
		System.out.println("Constructor Class");
	}
}
class CAA extends CA
{
	
}
public class ConstructorAbstract
{
	public static void main(String[] args)
	{
		CA a=new CAA();
		CAA a1=(CAA)a;
	}

}
