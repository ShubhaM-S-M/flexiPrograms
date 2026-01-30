class Parent
{
	final void display()
	{
		System.out.println("Cannot be over ridden");
	}
}
class Child extends Parent
{
	void diplay()
	{
		System.out.println("How did u do this?");
	}
}
class FinalMeth
{
	public static void main(String[] args)
	{
		Child c = new Child();
		c.display();
	}
}
