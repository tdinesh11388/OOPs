import java.util.Scanner;

public class NaturalNumber 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int a=scn.nextInt();
		for(int i=1;i<=a;i++)
		{
			System.out.println(i*(i-1)/2);//natural numbers
		}
		
		
	}

}
