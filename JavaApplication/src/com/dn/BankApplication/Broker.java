package com.dn.BankApplication;

import java.util.Scanner;

public class Broker
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		Bank b=new BOI();
		double intrest=b.rateOfIntrest();
		double result=n*intrest;
		System.out.println("intrest for Home Loan="+result);
		double total=result+n;
		int r=(int)total;
		System.out.println("Total amount for intrest and loan="+r);
		
	}
}
