class StaticMeth
{
	static int count=0;
	public static void disp()
	{
		count++;
		System.out.println("I have been called "+count+" times");
	}
	public static void main(String[] args)
	{
		StaticMeth.disp();
		StaticMeth.disp();
		StaticMeth.disp();
	}
}