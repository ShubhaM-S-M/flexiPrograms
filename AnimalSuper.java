class Animal
{
	void eat()
	{
		System.out.println("This is eat");
	}
}
class Tiger extends Animal
{
	
	void eat()
	{
		super.eat();
		System.out.println("I eat meat");
	}
}
class Cat extends Tiger
{
	void eat()
	{
		super.eat();
		System.out.println("I eat cat food");
	}
}
class AnimalSuper
{
	public static void main(String[] args)
	{
		Cat c = new Cat();
		c.eat();
	}
}