package com.Bank.App;
import java.util.*;
class ICICI
{
	Scanner scn=new Scanner(System.in);
	int bal;
	int draw;
	public void addAmount()
	{
		System.out.println("Add Amount");
		bal =scn.nextInt();
		System.out.println("balance is"+ bal);
		System.out.println("if you want to with Draw press 1");
		System.out.println("if u want to add press 2");
		int num=scn.nextInt();
		if(num==1) 
		{
			System.out.println("Enter amount");
			withdraw();
		}
	}
	public void withdraw()
	{
		draw=scn.nextInt();
		if(draw>bal) {
			System.out.println("insuficient balance");
		}
		else 
		{
			bal=bal-draw;
			System.out.println("balance is "+ bal);
		}
	}
}
public class Bank1 
{

	public static void main(String[] args) 
	{
		ICICI a1=new ICICI();
		a1.addAmount();

	}

}
