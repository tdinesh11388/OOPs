package com.java.test1;
import java.util.*;

public class Prm {
	public static int prime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(i<=1)continue;
			int r=prime(i);
			if(r==0)
			{
				count++;
				if(count%2!=0)System.out.println(i);
			}
		}

	}

}
