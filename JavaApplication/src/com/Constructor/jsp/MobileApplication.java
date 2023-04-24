package com.Constructor.jsp;

import java.util.Scanner;

class Jio
{
	String simName;
	public Jio(String simName)
	{
		this.simName=simName;
	}
	public void CallImplementation()
	{
		System.out.println("you can use internet while calling"+simName);
	}
	
}
class Airtel
{
	String simName;
	public Airtel(String simName)
	{
		this.simName=simName;
	}
	public void CallImplementation()
	{
		System.out.println("you cannot use internet while calling "+simName);
	}
}
class Battery
{
	String batteryName;
	public Battery(String batteryName)
	{
		this.batteryName=batteryName;
	}
}
class Phone
{
	String phoneName;
	Airtel airtel;
	Jio jio;
	Battery battery;
	public Phone(String phoneName, Battery battery)
	{
		this.phoneName=phoneName;
		this.battery=battery;
	}
	public void Call()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Airtel or Jio");
		int input=scn.nextInt();
		if(input==1)
		{
			jio =new Jio("jio");
			jio.CallImplementation();
		}
		else if(input==2)
		{
			airtel =new Airtel("Airtel");
			airtel.CallImplementation();
		}
	}
}

public class MobileApplication
{

	public static void main(String[] args)
	{
		Battery battery=new Battery("Lithium-ion");
		Phone phone=new Phone("MI",battery);
		phone.Call();
	}

}
