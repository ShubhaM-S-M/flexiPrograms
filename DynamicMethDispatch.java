class parent
{
	void display()
	{
		System.out.println("I am parent");
	}
}
class child extends parent
{
	void display()
	{
		System.out.println("I am child");
	}
}
class DynamicMethDispatch
{
	public static void main(String[] args)
	{
		parent p = new child();
		p.display();
	}
}