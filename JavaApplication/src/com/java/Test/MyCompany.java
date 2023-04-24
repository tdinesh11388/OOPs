package com.java.Test;
import java.util.*;
public class MyCompany 
{

	public static void main(String[] args) 
	{
		System.out.println("welcome to my comapny");
		System.out.println("selection Menu");
		for(;;)
		{
			System.out.println("1.factorial\n"
					+"2.length\n"
					+"3.power\n"
					+"4.Armstrong\n"
					+"5.Strong\n"
					+"6.Range Armstrong\n"
					+"7.Range Strong\n"
					+"8.perfect Number\n"
					+"9.Range of perfect Number\n"
					+ "10.prime number\n"
					+"11.Range of prime\n"
					+"12.Neon Number\n"
					+"13.Range of Neon Number\n"
					+"14.composite number\n"
					+"15.range of compsoite number\n");
			Scanner scn=new Scanner(System.in);
			System.out.println("choose items");
			int choice=scn.nextInt();
			
			if(choice==1)
			{
				System.out.println("factorial Number");
				System.out.println("Enter Number");
				int num=scn.nextInt();
				if(num<=0)System.out.println("Negative Number");
				else {
					System.out.println(Method.factorial(num));
				}
			}
			if(choice==2)
			{
				System.out.println("length Number");
				System.out.println("Enter Number");
				int num=scn.nextInt();
				if(num<=0) System.out.println("Negative Number");
				else {
					System.out.println(Method.length(num));
				}
			}
			if(choice==3)
			{
				System.out.println("Power Number");
				System.out.println("Enter base Number");
				int base=scn.nextInt();
				System.out.println("Enter exponent Number");
				int exp=scn.nextInt();
				if(base<=0)System.out.println("Negative number");
				else {
					System.out.print("The power is:"+Method.power(base, exp));
				}
				
			}
			if(choice==4)
			{
				System.out.println("Armstrong Number");
				System.out.println("Enter Number");
				int num=scn.nextInt();
				if(num<=0) System.out.println("negative Number");
				else {
					int res=Method.Arm(num);
					if(res==num)System.out.println("Armstrong Number");
					else System.out.println("Not a Armstrong");
				}
			}
			if(choice==5)
			{
				System.out.println("Strong Number");
				System.out.println("enter number");
				int num=scn.nextInt();
				if(num<=0) System.out.println("negative Number");
				else {
					int res=Method.Strong(num);
					if(res==num) System.out.println("Strong Number");
					else System.out.println("not a Strong Number");
				}
			}
			if(choice==6)
			{
				System.out.println("Range of ArmStrong");
				System.out.println("Enter Number");
				int num=scn.nextInt();
				for(int i=1;i<=num;i++)
				{
					if(i==Method.Arm(i))System.out.println(i);
				}
			}
			if(choice==7)
			{
				System.out.println("Range of Strong Number");
				System.out.println("Enter Number");
				int num=scn.nextInt();
				for(int i=1;i<=num;i++)
				{
					if(i==Method.Strong(i))System.out.println(i);
				}
				
			}
			if(choice==8)
			{
				System.out.println("Perfect Number");
				System.out.println("Enter Number");
				int num=scn.nextInt();
				if(num<=1) System.out.println("negative Number");
				else {
					int res=Method.perfect(num);
					if(res==num) System.out.println("perfect Number");
					else System.out.println("Not a perfect Number");
				}
			}
			if(choice==9)
			{
				System.out.println("Range of perfect Number");
				System.out.println("Enter Number");
				int num=scn.nextInt();
				for(int i=1;i<num;i++)
				{
					int res=Method.perfect(i);
					if(res==i) System.out.println(i);
				}
			}
			if(choice==10)
			{
				System.out.println("prime number..");
				System.out.println("Enter number");
				int num=scn.nextInt();
				int res=Method.prime(num);
				if(res==0) System.out.println("prime number");
				else System.out.println("not a prime number");
			}
			if(choice==11)
			{
				System.out.println("prime number Range");
				System.out.println("Enter number");
				int num=scn.nextInt();
				if(num<=1)System.out.println("not a prime number");
				int res=0;
				for(int i=2;i<num;i++)
				{
					 res=Method.prime(i);
					 if(res==0)System.out.println(i);
				}
			}
			if(choice==12)
			{
				System.out.println("Neon Number");
				System.out.println("Enter Number");
				int num=scn.nextInt();
				if(num<=1)System.out.println("negative number");
				else {
					int n=Method.neon(num);
					if(n==num)System.out.println("Neon number");
					else System.out.println("not a neon number");
				}
			}
			if(choice==13)
			{
				System.out.println("Range of Neon Number");
				System.out.println("Enter nubmer");
				int num=scn.nextInt();
				if(num<=1)System.out.println("negative number");
				else {
					for(int i=1;i<=num;i++)
					{
						int res=Method.neon(i);
						if(res==i)System.out.println(i);
					}
				}
			}
			if(choice==14)
			{
				System.out.println("Composite number");
				System.out.println("enter number");
				int num=scn.nextInt();
				if(num<=1)System.out.println("negative number");
				else {
					int res=Method.composite(num);
					if(res>=2)System.out.println("comosite number");
					else System.out.println("not a composite ");
				}
			}
			if(choice==15)
			{
				System.out.println("range of compsoite number");
				System.out.println("enter number");
				int num=scn.nextInt();
				for(int i=2;i<=num;i++)
				{
					int res=Method.composite(i);
					if(res>=2)System.out.println(i);
				}
			}
			else {
				System.out.println("sorry user its a invalid choice...!");
			}
			System.out.println("Do you wnat to continue?Y/y");
			char ch=scn.next().charAt(0);
			if(ch=='Y'||ch=='y') continue;
			else {
				System.out.println("Thank you for using my application");
				System.out.println("Try again next time");
				System.out.println("Happy Day");
				break;
			}
		}

	}

}
