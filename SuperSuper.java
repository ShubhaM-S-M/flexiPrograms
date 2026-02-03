class SuperError
{
	SuperError()
	{
		System.out.println("Super Error");
	}
}
class Error
{
	Error()
	{
		System.out.println("Error");
	}
}
class SuperSuper
{
	SuperSuper()
	{
		super.super();
	}
	public static void main(String args[])
	{
		SuperSuper ss = new SuperSuper();
	}
}