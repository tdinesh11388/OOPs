package Inheritance;

class OAO
{
	public int i=35;
	public void m1()
	{
		System.out.println(i);
	}
}

class Abb extends OAO {
	
	
	
	int j=10;
	@Override
	public void m1(){
		System.out.println(i);
		System.out.println(j);
	}
	public void m2()
	{
		System.out.println("lkjh");
	}
}
public class Ove
{
	

	public static void main(String[] args)
	{
	Abb a=new Abb();
		a.m1();

	}
	

}
