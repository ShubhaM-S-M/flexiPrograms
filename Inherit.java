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
	void breed(String b)
	{
		System.out.println("Breed is "+b);
	}
}
class Inherit
{
	public static void main(String[] args)
	{
		Dog d= new Dog();
		d.eat();
		d.sleep();
		d.bark();
		d.breed("Pug");
	}
}