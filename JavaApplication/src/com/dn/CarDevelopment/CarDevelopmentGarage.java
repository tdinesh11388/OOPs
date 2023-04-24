package com.dn.CarDevelopment;

public class CarDevelopmentGarage {

	public static void main(String[] args)
	{
		Driver d=new Driver();
		
		System.out.println("****************");
		d.drive(new BMW());
		System.out.println("***********");
		d.drive(new Fortuner());
	}

}
