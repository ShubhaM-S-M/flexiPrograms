class GrandParent
{
	void disp()
	{
		System.out.println("I am grandparent");
	}	
}
class Parent extends GrandParent
{
	void surname()
	{
		System.out.println("Surname is Malesha");
	}
}
class Child extends Parent
{
	void name()
	{
		System.out.println("Name is Shubham");
	}
}
public class MultiLevelInheritance
{
	public static void main(String[] args)
	{
		Child c= new Child();
		c.disp();
		c.name();
		c.surname();
	}
}