package com.Bank.App;
import java.util.*;
class AP
{
	private int i=90;
	private void display()
	{
		System.out.println(i);
	}
	public void m1()
	{
		System.out.println(i);
	}
}
public class Private
{

	public static void main(String[] args) 
	{
		AP a1=new AP();
		a1.m1();
	}

}
