package Inheritance;

import java.util.Scanner;

class Length
{
	public int length(int num)
	{
		int len=0;
		while(num>0)
		{
			len++;
			num/=10;
			
		}
		return len;
	}
}
class Power extends Length
{
	public int power(int base,int exp)
	{
		int sum=1;
		for(int i=1;i<=exp;i++)
		{
			 sum=sum*base;
		}
		return sum;
	}
}

class Arm extends Power
{
	public int Arm(int num)
	{
		int res=0;
		int exp=length(num);
		while(num>0)
		{
			int a=num%10;
			res=res+power(a,exp);
			num/=10;
		}
		return res;
	}
}
public class ArmStrongNumber
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter number");
		int n=scn.nextInt();
		Arm a=new Arm();
		for(int i=1;i<=n;i++)
		{
			if(i<=0)System.out.println("No negatives");
			else {
				int result=a.Arm(i);
				if(result==i)System.out.println(i);
			}
		}
		

	}

}
