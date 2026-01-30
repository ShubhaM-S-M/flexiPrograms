import java.util.Scanner;
class Circle
{
	final float pi= 3.14f;
	float area;
	float rad;
	void calcArea()
	{
		Scanner sc = new Scanner(System.in);
		rad = sc.nextFloat();
		area = pi*rad*rad;
		System.out.println("Area ="+area );
	}
	public static void main(String[] args)
	{
		Circle c= new Circle();
		c.calcArea();
	}
}