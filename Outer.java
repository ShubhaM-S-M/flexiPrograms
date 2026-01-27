import java.util.Scanner;
class Outer
{
	class Inner
	{
		void disp()
		{
			System.out.println("This is inner");
		}
	}
	public static void main(String[] args)
	{
		Outer.Inner oi = new Outer(). new Inner();
		oi.disp();
	}
}