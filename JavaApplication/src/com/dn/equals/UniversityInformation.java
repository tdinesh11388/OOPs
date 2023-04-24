package com.dn.equals;

class Students
{
	String s_name;
	int s_id;
	String Course;
	public Students(String s_name, int s_id, String course) 
	{
		super();
		this.s_name = s_name;
		this.s_id = s_id;
		this.Course = course;
	}
	public void student()
	{
		System.out.println("//Student detailes\\");
		System.out.println(s_name);
		System.out.println(s_id);
		System.out.println(Course);
	}
	@Override
	public String toString()
	{
		return "Students [s_name=" + s_name + ", s_id=" + s_id + ", Course=" + Course + "]";
	}
	
	
}
class Colleges
{
	Students s;
	String College_Name;
	String College_Add;
	int College_Reg_No;
	public Colleges( String college_Name, String college_Add, int college_Reg_No,Students s) 
	{
		super();
		this.s = s;
		College_Name = college_Name;
		College_Add = college_Add;
		College_Reg_No = college_Reg_No;
	}
	public void college()
	{
		System.out.println("//College Names\\");
		System.out.println(College_Name);
		System.out.println(College_Add);
		System.out.println(College_Reg_No);
		System.out.println("****************");
		s.student();
	}
	
	
}
class University
{
	Colleges c;
	String University_Name;
	int University_reg_no;
	public University( String university_Name, int university_reg_no,Colleges c) 
	{
		super();
		this.c = c;
		University_Name = university_Name;
		University_reg_no = university_reg_no;
	}
	public void university()
	{
		System.out.println("//university\\");
		System.out.println(University_Name);
		System.out.println(University_reg_no);
		System.out.println("********************");
		c.college();
	}
	
}
public class UniversityInformation
{
	public static void main(String[] args)
	{
		University u=new University("SVU",789,new Colleges("sv arts college","balaji colony",456,new Students("Dinesh",110,"MPE")));
		u.university();
		University u1=new University("SVU",789,new Colleges("sgs","Gandhi Road",486,new Students("Virat",111,"Mpcs")));
		u1.university();
	}

}
