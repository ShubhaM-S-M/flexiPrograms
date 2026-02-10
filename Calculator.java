class Calculator
{
	int addn(int a, int b)
	{
		return a+b;
	}
	double addn(double a, double b)
	{
		return a+b;
	}
	int addn(int a, int b, int c)
	{
		return a+b+c;
	}
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		System.out.println(c.addn(5,6));
		System.out.println(c.addn(5.1 , 6.2));
		System.out.println(c.addn(5,6,7));		
	}
}