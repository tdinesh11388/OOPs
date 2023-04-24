package com.dn.Encapsulation;
class Test1
{
	private String name;
	
	private int id;
	
	public void setName(String n)
	{
		this.name=n;
	}
	public String  getName()
	{
		return name;
	}
	public void setId(int n)
	{
		this.id=n;
	}
	public int getId()
	{
		return id;
	}
}
public class GET
{
	public static void main(String[] args)
	{
		Test1 t=new Test1();
		t.setName("Dinesh");
		Test1 t1=new Test1();
		t1.setId(12);
		System.out.println(t.getName());
		System.out.println(t1.getId());
	}

}
