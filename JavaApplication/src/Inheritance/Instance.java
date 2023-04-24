package Inheritance;
class Aaa extends Object
{
	
}
class Bbb extends Aaa
{
	
}
public class Instance
{

	public static void main(String[] args)
	{
		Object obj=new Object();
		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof Aaa);
		System.out.println(obj instanceof Bbb);
		System.out.println("**********************");
		
		Aaa a1=new Aaa();
		System.out.println(a1 instanceof Object);
		System.out.println(a1 instanceof Aaa);
		System.out.println(a1 instanceof Bbb);
		System.out.println("**********************");
		
		Bbb b1=new Bbb();
		System.out.println(b1 instanceof Object);
		System.out.println(b1 instanceof Aaa);
		System.out.println(b1 instanceof Bbb);
	}

}
