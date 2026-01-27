class Vehicle
{
	void engine()
	{
		System.out.println("I have engine");
	}
	void brand(String b)
	{
		System.out.println("I am "+b);
	}
	void wheel(int num)
	{
		System.out.println("I have "+num+" wheels");
	}
	void use()
	{
		System.out.println("I am used for travelling");
	}
}
class Car extends Vehicle
{
	void use()
	{
		System.out.println("I am used by families");
	}
}
class Scooter extends Vehicle
{
	void use()
	{
		System.out.println("I am used for quick travel");
	}
}
class Truck extends Vehicle
{
	void use()
	{
		System.out.println("I am used for carrying good over long distance");
	}
}
class VehicleInherit
{
	public static void main(String[] args)
	{
		Car c= new Car();
		c.engine();
		c.brand("Ford");
		c.wheel(4);
		c.use();	
		Scooter s = new Scooter();
		s.engine();
		s.brand("Activa");
		s.wheel(2);
		s.use();	
		Truck t= new Truck();
		t.engine();
		t.brand("Mahindra");
		t.wheel(8);
		t.use();
	}
}