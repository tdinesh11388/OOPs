package Inheritance;
import java.util.*;
class SBI
{
	private int balance=2000;
	private void  dataCount()
	{
		System.out.println(balance);
	}
	void checkBalance()
	{
		dataCount();
	}
	void Deposite(int amount)
	{
		balance=balance+amount;
		System.out.println("your balance is ="+balance);
	}
	void withdraw(int amount)
	{
		if(amount>=balance)System.out.println("sorry insuficient balance");
		else {
			balance=balance-amount;
			System.out.println("Sucessfuly Transcation your amount.....");
			System.out.print("Remaning balance is =");
			dataCount();
			System.out.println("Thank you!!");
		}
	}
}
public class ATM 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		//System.out.println("Enter Amount");
		//int amount=scn.nextInt();
		SBI s=new SBI();
		//s.Deposite(amount);
		System.out.println("Enter withdraw Amount");
		int drawAmount=scn.nextInt();
		s.withdraw(drawAmount);
	}
}
