package com.java.test3;
public class SBI
{
	int balance=30000;
	public void display()
	{
		System.out.println(balance);
	}
	public void withdraw(int amount)
	{
		if(amount>balance) System.out.println("in sufcient balance");
	}
}
 class BankTranscation
{
	public static void main(String[]args)
	{
		SBI s1=new SBI();
		s1.withdraw(30001);
	}
}
