package com.java.test2;
import java.util.*;
public class DimandNumberPattern1 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int sp=n-1;
		int st=1;
		int num=1;
		for(int i=1;i<=n;i++)
		{
			 num=1;
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print(num);
				if(k<=st/2)
				{
					num++;
				}
				else {
					num--;
				}
				
			}
			System.out.println();
			if(i<=sp)
			{
				sp--;
				st+=2;
				
			}
			else {
				sp++;
				st-=2;
			}
			
		}

	}

}
