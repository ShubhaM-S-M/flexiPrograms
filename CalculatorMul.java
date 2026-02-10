class CalculatorMul
{
	int muln(int a, int b)
	{
		return a * b;
	}
	double muln(double a, double b)
	{
		return a * b;
	}
	int muln(int a, int b, int c)
	{
		return a * b * c;
	}
	public static void main(String[] args)
	{
		CalculatorMul c = new CalculatorMul();
		System.out.println(c.muln(5, 6));
		System.out.println(c.muln(5.1, 6.2));
		System.out.println(c.muln(5, 6, 7));
	}
}