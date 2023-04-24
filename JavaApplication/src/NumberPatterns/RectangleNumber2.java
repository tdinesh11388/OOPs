package NumberPatterns;

import java.util.Scanner;

public class RectangleNumber2
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
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				num++;
			}
			System.out.println();
		}


	}

}
