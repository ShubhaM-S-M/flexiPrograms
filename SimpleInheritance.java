class Parent
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
public class SimpleInheritance
{
	public static void main(String[] args)
	{
		Child c= new Child();
		c.name();
		c.surname();
	}
}