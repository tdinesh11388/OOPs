package NumberPatterns;

import java.util.Scanner;

public class Number212
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter number");
		int x=scn.nextInt();
		//int y=scn.nextInt();
		int st=1;
		int sp=x-1;
		int num=1;
		for(int i=1;i<=x;i++)
		{
			num=i;
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print(num);
				if(k<=st/2)num--;
				else num++;
			}
			System.out.println();
			sp--;
			st+=2;
			
		}
		
	}

}
