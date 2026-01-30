class A
{
	void display()
	{
		System.out.println("This is A");
	}
}
class B extends A
{
	void display()
	{
		super.display();
		System.out.println("This is B");
	}
}
class methodOverriding
{
	public static void main(String[] args)
	{
		B b= new B();	
		b.display();
	}
}