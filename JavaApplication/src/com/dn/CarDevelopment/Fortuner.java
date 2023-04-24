package com.dn.CarDevelopment;

public class Fortuner extends Car
{
	@Override
	public void start()
	{
		System.out.println("switch start");
	}
	@Override
	public void accelerate()
	{
		System.out.println("switch accelerate");
	}
	@Override
	public void stop()
	{
		System.out.println("switch stop");
	}
	
}
