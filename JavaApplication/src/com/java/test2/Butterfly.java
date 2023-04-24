package com.java.test2;
import java.util.*;
public class Butterfly 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number n");
		int n=scn.nextInt();
		int stars=1;
		int laststars=n*2-1;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if (j<=stars || j>=laststars  )
				System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
			if(i<n)
			{
				stars++;
				laststars--;
			}
			else {
				stars--;
				laststars++;
			}
			
		}

	}

}
