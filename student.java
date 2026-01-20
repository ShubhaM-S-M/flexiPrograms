import java.util.*;
public class student
{
	int rollno;
	String name;
	student()
	{
		System.out.println("Hello I am Student");
	}
	student(int rn)
	{
		System.out.println("Rollno Parameterised");
		rollno=rn;
	}	
	student(int rn, String nm)
	{
		System.out.println("Rollno and name parametrised");
		rollno=rn;
		name=nm;
	}
	public static void main(String[] args)
	{
		student s= new student();
		student s1= new student(515);
		System.out.println(s1.rollno);
		student s2= new student(515,"Shubham");
		System.out.println(s2.rollno+" "+s2.name);
	}
}