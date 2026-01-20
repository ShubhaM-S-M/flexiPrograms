public class test2
{
	static int a=0;
	public void display()
	{
		System.out.println(a);
	}
	public static void display1()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		test2 t= new test2();
		t.display();
		
		test2.display1();
		System.out.println(a);
		System.out.println(args[3]);
	}
}