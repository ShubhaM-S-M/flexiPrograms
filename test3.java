public class test3
{
	public void display(int a)
	{
		a+=10;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		int a =10;
		test3 t= new test3();
		t.display(a);
		System.out.println(a);
	}
}