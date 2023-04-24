package com.Recursion.Code1;

public class Recursion 
{
	int even=0;
	int odd=0;
    void display(int n)
	{
		if(n>10) return;
		if(n%2==0)even+=n;
		else odd+=n;
		display(n+1);
	}

	public static void main(String[] args) 
	{
		Recursion r=new Recursion();
		r.display(1);
		int a=r.even;
		System.out.println(r.even);
		System.out.println(r.odd);
		int b=r.odd;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
