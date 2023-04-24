package com.dn.CarDevelopment;

public class Driver
{
	public void drive(Car c)
	{
		c.start();
		c.accelerate();
		c.stop();
	}
	public void drive(TATA t)
	{
		t.start();
		t.accelerate();
		t.stop();
		t.accessBluetooth();
	}
}
