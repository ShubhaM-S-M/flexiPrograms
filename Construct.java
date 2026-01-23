public class Construct
{	
	int age;
	Construct()
	{
		age=10;
	}
	public void disp()
	{
		System.out.println(age);
	}
	public static void main(String[] args)
	{
		Construct c = new Construct();
		c.disp();
	}
}
