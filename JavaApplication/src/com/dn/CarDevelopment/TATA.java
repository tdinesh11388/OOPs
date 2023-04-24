package com.dn.CarDevelopment;

public class TATA extends Car
{
	@Override 
	public void start()
	{
		System.out.println("key start");
	}
	@Override
	public void accelerate()
	{
		System.out.println("half cluch accele");
	}
	@Override
	public void stop()
	{
		System.out.println("stop car");
	}
	public void accessBluetooth()
	{
		System.out.println("JBL bluetooth");
	}
}
