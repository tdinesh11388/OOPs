import java.util.Scanner;

public class LargestOfThreeNumber {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter num");
		/*int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int temp=(a>b)?a:b;
		int large=(temp>c)?temp:c;
		System.out.println(large);*/
		
		int num=scn.nextInt();
		/*int lg=0;
		while(num>0)
		{
			int a=num%10;
			if(a>lg)lg=a;
			num/=10;
		}
		System.out.println(lg);*/
		
		int sm=9;
		while(num>0)
		{
			int a=num%10;
			if(a<sm)sm=a;
			
			num/=10;
		}
		System.out.println(sm);
	}

}
