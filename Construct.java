public class Construct
{	
	int age;
	int prn;
	String name;
	String sec;
	Construct()
	{
		age=10;
		prn=1;
		name="Invalid";
		sec="SY";
		
	}
	public void disp()
	{
		System.out.println("age = "+age+"\nname = "+name+"\nsec = "+sec+"\nprn = "+prn);
		
	}
	public static void main(String[] args)
	{
		Construct c = new Construct();
		c.disp();
	}
}
