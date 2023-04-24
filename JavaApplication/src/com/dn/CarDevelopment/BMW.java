package com.dn.CarDevelopment;

public class BMW extends Car
{
	@Override
	public void start()
	{
		System.out.println("Touch start");
	}

	@Override
	public void accelerate()
	{
		System.out.println("full cluch start");
	}
	@Override
	public void stop()
	{
		System.out.println("Immediate stop");
	}
}
