final class A
{
	void display()
	{
		System.out.println("I am final boss");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Dormamu! i have com to bargain");
	}
}
class finalClass
{
	public static void main(String[] args)
	{
		B b = new B();
	}
}