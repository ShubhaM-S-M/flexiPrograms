class Animal
{
	void eat()
	{
		System.out.println("Animal eats");
	}
	void sleep()
	{
		System.out.println("Animal sleeps");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog barks");
	}
	
}
class GermanShephard extends Dog
{
	void name(String b)
	{
		System.out.println("Breed is "+b);
	}
}
class DogMultiLevel
{
	public static void main(String[] args)
	{
		GermanShephard gs= new GermanShephard();
		gs.eat();
		gs.sleep();
		gs.bark();
		gs.name("GS");
	}
}