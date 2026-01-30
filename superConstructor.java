class Parent
{
	Parent()
	{
		System.out.println("Hello i am parent");
	}
}
class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Hello i am child");
	}
}
class superConstructor
{
	public static void main(String[] args)
	{
		Child c = new Child();
	}
}