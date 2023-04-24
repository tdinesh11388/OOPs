import java.util.*;
public class Tudip
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int a=scn.nextInt();
		if(a%23==0 && a%41==0) 
		{
			System.out.println("Foo Bar");
		
		}
		else if(a%23==0)
		{
			System.out.println("foo");
		
		}
		else if(a%41==0)
		{
			System.out.println("Bar");
		
		}

	}

}
