package Inheritance;
class AZ
{
	int i=90;
	
	public String toStirng()
	{
		return "i="+i;
	}
}
class BZ
{
	
}
public class ObjectClass
{
	public static void main(String[] args)
	{
		AZ a=new AZ();
		System.out.println(a.getClass());
		BZ b=new BZ();
		System.out.println(b.getClass());
		System.out.println(a.toStirng());
	}

}
