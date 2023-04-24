package com.java.Test;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
	
		for(int i=a;i<=b;i++)
		{
			if(i<=1) continue;
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0) System.out.println(i);
		}

	}

}
