package com.dn.BookMyShow;

import java.util.Scanner;

class Theater
{
	int seats =50;
	private static Theater t=null;
	private Theater()
	{
		
	}
	public static Theater getInstance()
	{
		if(t==null)t= new Theater();
		return t;
	}
	public void reserveSeats(int num)
	{
		if(num>=seats)
		{
			System.out.println("not available");
			System.out.println("Available only for "+ seats);
		}
		else {
			seats=seats-num;
			System.out.println("Reserved seats "+num);
			System.out.println("Availbale seats "+seats);
			System.out.println("Thank you for booking");
		}
	}
}
class BookingApp
{
	public void bookingTickets()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Tickets: ");
		int ticket=scn.nextInt();
		if(ticket>=12)
		{
			System.out.println("Once a user can book only 12 Tickets");
			System.out.println("Book lessThan 12 seats");
			System.out.println("Thank you !!!");
		}
		else{
			Theater theater=Theater.getInstance();
			theater.reserveSeats(ticket);
		}
		
	}
}
public class BookMyShow
{
	public static void main(String[] args)
	{
		BookingApp t1=new BookingApp();
		t1.bookingTickets();
		BookingApp t2=new BookingApp();
		t2.bookingTickets();
		BookingApp t3=new BookingApp();
		t3.bookingTickets();
	}
}
