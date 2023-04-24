package com.dn.equals;

import java.util.Objects;

class Engine   //code Share:-  https://codeshare.io/
{
	String EngineName;
	int HP;
	int YOM;
	public Engine(String engineName, int hP, int yOM) 
	{
		super();
		EngineName = engineName;
		HP = hP;
		YOM = yOM;
	}
	@Override
	public String toString() {
		return "Engine [EngineName=" + EngineName + ", HP=" + HP + ", YOM=" + YOM + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Bike)) return false;
		Engine en=(Engine)obj;
		return this.EngineName==en.EngineName && this.HP==en.HP && this.YOM==en.YOM;
	}
	
	
	
}
class Bike
{
	Engine e;
	String BikeName;
	int price;
	public Bike(String bikeName, int price,Engine e)
	{
		
		super();
		this.e=e;
		BikeName = bikeName;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "Bike [e=" + e + ", BikeName=" + BikeName + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Bike))return false;
		Bike b=(Bike)obj;
		return this.BikeName==b.BikeName && this.price==b.price;
	}
	
	
	
}
public class BikeClass
{
	public static void main(String[] args)
	{
		Engine e=new Engine("Audi",1000,2015);
		Bike b1=new Bike("Apache",12000,e);
		Bike b2=new Bike("Apache",14500,e);
		
		System.out.println(b1.equals(b2));
		
	}

}
