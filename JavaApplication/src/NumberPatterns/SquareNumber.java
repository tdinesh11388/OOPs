package NumberPatterns;

import java.util.Scanner;

public class SquareNumber
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int num=1;
		for(int i=1;i<=n;i++)
		{
			num=1;
			for(int j=1;j<=n;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}

}
