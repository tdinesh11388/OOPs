package Inheritance;
class Bank
{
	int rateOfIntrest()
	{
		return 2;
	}
}
class SBI1 extends Bank
{
	int rateOfIntrest()
	{
		return 5;
	}
}
class BOI extends SBI1
{
	int rateOfIntrest()
	{
		return 7;
	}
}
public class Hierarchical
{
	public static void main(String[] args)
	{
		Bank b=new Bank();
		System.out.println(b.rateOfIntrest());
		SBI1 s=new SBI1();
		System.out.println(s.rateOfIntrest());
		BOI b1=new BOI();
		System.out.println(b1.rateOfIntrest());
		BOI b2=new BOI();
		System.out.println(b2.rateOfIntrest());
	}
}
