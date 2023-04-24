package Inheritance;

class Ride
{
	 public int i=20;
	  void m1()
	{
		System.out.println(i);
	}
}
class Oride extends Ride
{
	@Override
	protected void m1()
	{
		System.out.println(i);
	}
}
public class Overrides extends Oride
{
	public static void main(String[] args)
	{
		Overrides o=new Overrides();
		o.m1();
	}

}
