package com.java.Test;
import java.util.*;
public class Practice
{
	public static void main(String[] args) 
	{ 
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter nubmer");
		int n=scn.nextInt();
		int count=0;
		int res=0;
		int a=0;
		int result=0;
		/*while(n>0)
		{
			a=n%10;count++;
			if(count<=3)
			{
				result=result+a;
			}
			res=res*10+a;
			n=n/10;
		}
		System.out.println(res);
		System.out.println(result);
		/*while(res>0)
		{
			a=res%10;count++;
			if(count>3)
			{
				result=a+result;
			}
			res=res/10;
		}
		System.out.println(result); */
		while(n>0)
		{
			res=res*10+n%10;
			n=n/10;
		}
		System.out.println(res);
	}
}
