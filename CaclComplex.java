class Complex
{
	int real;
	int img;
	Complex(int r, int i)
	{
		real = r;
		img = i;
	}
	void display()
	{
		System.out.println(real+"."+img+"i");
	}
}
class CalcComplex 
{
	CalcComplex()
	{
	}
	Complex addComplex(Complex c1, Complex c2)
	{
		Complex c3= new Complex(0,0);
		c3.real=c1.real+c2.real;
		c3.img=c1.img+c2.img;
		return c3;
	}
	public static void main(String[] args)
	{
		CalcComplex cc = new CalcComplex();
		Complex c1 = new Complex(1,5);
		Complex c2 = new Complex(2,3);
		Complex c3 = cc.addComplex(c1, c2);
		c3.display();
	}
}