class CalculatorSub
{
	int subn(int a, int b)
	{
		return a-b;
	}
	double subn(double a, double b)
	{
		return a-b;
	}
	int subn(int a, int b, int c)
	{
		return a-b-c;
	}
	public static void main(String[] args)
	{
		CalculatorSub c = new CalculatorSub();
		System.out.println(c.subn(5,6));
		System.out.println(c.subn(5.1 , 6.2));
		System.out.println(c.subn(5,6,7));		
	}
}