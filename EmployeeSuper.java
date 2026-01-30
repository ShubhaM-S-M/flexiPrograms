class Employee
{
	int id;
	String name;
	float sal;
	Employee(int id, String name, float sal)
	{
		this.id = id; //parameter = class variable
		this.name = name;
		this.sal = sal;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+sal);
	}
}
class Manager extends Employee
{
	String branch;
	Manager(int id, String name, float sal, String branch)
	{
		super(id, name, sal);	//calls Employee constructor
		this.branch = branch;
	}
	void display()
	{
		super.display();
		System.out.println(branch);
	}
}
class EmployeeSuper
{
	public static void main(String[] args)
	{
		Manager m= new Manager(515, "Shubham", 10000, "CS");
		m.display();
	}
}