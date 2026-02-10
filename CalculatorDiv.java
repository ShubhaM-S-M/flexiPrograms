class CalculatorDiv
{
	int divn(int a, int b)
	{
		return a / b;
	}
	double divn(double a, double b)
	{
		return a / b;
	}
	public static void main(String[] args)
	{
		CalculatorDiv c = new CalculatorDiv();
		System.out.println(c.divn(60, 6));
		System.out.println(c.divn(12.48, 6.2));
	}
}