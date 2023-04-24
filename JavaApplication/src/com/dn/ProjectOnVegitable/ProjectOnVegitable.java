package com.dn.ProjectOnVegitable;

import java.util.Scanner;

class Vegitable
{
	public void WashVeg()
	{
		System.out.println(" wash vegitable on hot water");
	}
}
class Carrot extends Vegitable
{
	public void prepareCarrotHalwa()
	{
		System.out.println("Carrot halwa prepare for eat");
	}
}
class Beans extends Vegitable
{
	public void prepareBeansCurry()
	{
		System.out.println("Beans curry for lunch");
	}
}
class Potato extends Vegitable
{
	public void prepareFrenchFries()
	{
		System.out.println("French fries is famous snacks");
	}
}
class Tomato extends Vegitable
{
	public void prepareTomatoCurry()
	{
		System.out.println("prepare Tomato curry for Dinner");
	}
}
class ShopKeeper
{
	public Vegitable shop(String VegName)
	{
		if(VegName.equalsIgnoreCase("Carrot")) return new Carrot();
		if(VegName.equalsIgnoreCase("Potato")) return new Potato();
		if(VegName.equalsIgnoreCase("Tomato")) return new Tomato();
		if(VegName.equalsIgnoreCase("Beans")) return new Beans();
		System.out.println(VegName +" this item is not available");
		return new Vegitable();
	}
}
public class ProjectOnVegitable
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Vegitable:");
		String VegName=scn.nextLine();
		ShopKeeper s=new ShopKeeper();
		Vegitable veg=s.shop(VegName);
		veg.WashVeg();
		if(veg instanceof Carrot)
		{
			Carrot c=(Carrot)veg;
			c.prepareCarrotHalwa();
		}
		if(veg instanceof Potato)
			((Potato)veg).prepareFrenchFries();
		if(veg instanceof Tomato)
			((Tomato)veg).prepareTomatoCurry();
		if(veg instanceof Beans)
			((Beans)veg).prepareBeansCurry();
	}
}
