package SingleTon;

class A
{
	static int count;
	private A()
	{
		count++;
	}
	public static A getInstance()
	{
		return new A();
	}
}
public class Test
{
	public static void main(String[] args)
	{
		A a1=A.getInstance();
		A a2=A.getInstance();
		A a3=A.getInstance();
		System.out.println(a1==a2);
		System.out.println(A.count);
	}

}
