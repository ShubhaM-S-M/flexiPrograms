abstract class Shape
{
	abstract void area();
	void draw()
	{
		System.out.println("MUSTARDDDDDDDD!!");
	}
}
class Square extends Shape
{
	void area()
	{
		float s = 10f;
		float area = s*s;
		System.out.println("Area="+ area);
	}
	void display()
	{
		System.out.println("This is square");
	}
}
class AbstractClass
{
	public static void main(String[] args)
	{
		Square s = new Square();
		s.area();
		s.draw();
		s.display();
	}
}