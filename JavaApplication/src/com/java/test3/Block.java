package com.java.test3;

class Aaa
{
	static 
	{
		System.out.println("static of A");
	}
	static 
	{
		System.out.println("ststic of AA");
	}
}

public class Block 
{

	public static void main(String[] args) 
	{
		System.out.println("Block Of A");
		Aaa a1=new Aaa();

	}

}
