package NumberPatterns;

import java.util.Scanner;

public class SnackPattern
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		for(int i=1;i<=num;i++)
		{
			int x=1;
			if(i%2==1) {
				 x=((i-1)*num)+1;
			}
			else {
				x=num*2;
			}
			for(int j=1;j<=num;j++)
			{
				System.out.print(x+"\t");
				x++;
			}
			System.out.println();
		}

	}

}
