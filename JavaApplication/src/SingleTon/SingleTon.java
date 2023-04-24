package SingleTon;

class X
{
	private static X t=null;
	private X()
	{
		
	}
	public static X getInstance()
	{
		if(t==null)
		{
			t=new X();
		}
		return t;
	}
}
public class SingleTon
{
	public static void main(String[] args)
	{
		X x1=X.getInstance();
		X x2=X.getInstance();
		System.out.println(x1==x2);
	}

}
