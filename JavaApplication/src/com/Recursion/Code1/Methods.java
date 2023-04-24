package com.Recursion.Code1;

public class Methods 
{
			  static int m1(int i) 
			  {
			    System.out.println("m1 Starts ");
			  System.out.println(i);
			  //System.out.println(j);
			    return 8;
			  }
			  static int m2(int i ,int j) 
			  {
			    System.out.println("m2 starts");
			    System.out.println(i);
			    System.out.println(j);
			    return 12;
			  }
			   int m3(int k) 
			   {
			    System.out.println("m3 starts");
			    System.out.println(k);
			    return 111;
			  }
			  public static void main(String[]args) 
			  {
			    int x;
			    int y;
			    
			    
			    Methods d1=new Methods();
			    x=d1.m3(10);        
			    System.out.println(d1.m3(2)+2);
			    d1.m3(x);            
			    System.out.println(x);
			    
			    
			  
			    m2(6,6);
			    int j=2+m1(4)+2+m2(5,5)+2;
			    System.out.println(j); 
			  
			  
			    
			    
			    
			  }

			

	

}
