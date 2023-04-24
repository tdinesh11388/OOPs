package com.java.Test;
import java.util.*;
public class DTB 
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i=1;
		int bin=0;
		while(n>0)
		{
			bin=n%2*i+bin;
			i*=10;
			n=n/2;
		}
		System.out.println(bin);

	}

}
