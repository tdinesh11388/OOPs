import java.util.*;
public class Butterfly1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println("Enter Number");
		int stars=1;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			if(i<=n)stars++;
			else stars--;
		}
		System.out.println();
	}

}
