class Parent
{
	final void display()
	{
		System.out.println("Nuh uh");
	}
}
class Child extends Parent
{
	void diplay()
	{
		System.out.println("I am overriding this");
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