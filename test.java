public class test
{
	int a;
	int b;
	float p;
	float q;
	test(int x, int y)
	{
		System.out.println("Int Parametrized");
		a=x;
		b=y;
	}
	test()
	{
		System.out.println("Default");
	}
	test(float x, float y)
	{
		System.out.println("Float Parametrized");
		p=x;
		q=y;
	}
	public void display()
	{
		test tp = new test(10,20);
		test tpf= new test(10.1f,21.2f);
		System.out.println(tp.a+" "+tp.b);
		System.out.println(tpf.p+" "+tpf.q);

	}
	public static void main(String[] args)
	{
		test td = new test();
		td.display();
	}
}