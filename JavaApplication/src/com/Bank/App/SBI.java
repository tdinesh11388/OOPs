package com.Bank.App;

class Bank
{	
	int balance=30000;
	public void display()
	{
		System.out.println(balance);
	}
	public void Deposite(int amntDeposit)
	{
			balance=balance+amntDeposit;
			System.out.println("your balance is"+ balance);
	}
	public void withdraw(int amountWithDraw)
	{
		if(amountWithDraw>=balance) System.out.println("insuficient balance");
		else {
			balance=balance-amountWithDraw;
			System.out.println("Balance= "+ balance);
		}
	}
}
public class SBI 
{
	public static void main(String[]args)
	{
		Bank b=new Bank();
		Bank Gpay=b;
		Bank PhonePe=b;
		Bank Amazonepay=b;
		Bank Paytm=b;
		
		Gpay.Deposite(2000);
		Gpay.display();
		Amazonepay.withdraw(9845);
	}

}
