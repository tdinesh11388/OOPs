package com.practice;

import java.util.Scanner;

class Airtel
{
	String name;
	Airtel(String name)
	{
		this.name=name;
	}
	public void callImplementation()
	{
		System.out.println("cannot use internet in the making of call");
	}
}
class Jio
{
	String name;
	Jio(String jio)
	{
		this.name=name;
	}
	public void callImplementation()
	{
		System.out.println("we can use internet while making call");
	}
}
class Battery
{
	String name;
	Battery(String name)
	{
		this.name=name;
	}
}
class Phone
{
	Airtel airtel;
	Jio jio;
	Battery battery;
	String phone;
	Phone(String phone,Battery battery)
	{
		this.phone=phone;
		this.battery=battery;
	}
	public void call()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Airtel or Jio");
		int n=scn.nextInt();
		if(n==1)
		{
			airtel=new Airtel("airtel");
			airtel.callImplementation();
		}
		else if(n==2)
		{
			jio=new Jio("jio");
			jio.callImplementation();
		}
	}
}
public class Composition 
{
	public static void main(String[] args)
	{
		Phone p=new Phone("Mi",new Battery("lithium"));
		p.call();
	}

}
