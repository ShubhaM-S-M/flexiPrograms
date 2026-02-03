class thisConstructor2
{
	thisConstructor2()
	{
		this("Called by constructor");
	}
	thisConstructor2(String msg)
	{
		System.out.println(msg);
			
	}
	thisConstructor2(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		thisConstructor2 tc1 = new thisConstructor2();		thisConstructor2 tc2 = new thisConstructor2("Hello called by obj");
	}
}
