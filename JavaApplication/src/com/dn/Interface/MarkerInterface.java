package com.dn.Interface;


class WashMan
{
	public void wash(Object obj)
	{
		if(obj instanceof serializable)
			System.out.println("water pushed with a force can wash "+ obj.getClass().getSimpleName());
		else
			System.out.println(obj.getClass().getSimpleName()+" Not washable");
	}
}
interface serializable
{
	
}

class Car implements serializable
{
	
}
class Bike implements serializable
{
	
}
class Bus implements serializable
{
	
}
class Mobile
{
	
}
class Tv
{
	
}
public class MarkerInterface
{
	public static void main(String[] args)
	{
		WashMan w=new WashMan();
		w.wash(new Tv());
		w.wash(new Bus());
		w.wash(new Bike());
		w.wash(new Mobile());
	}

}
