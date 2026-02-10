class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }

    void move()
    {
        System.out.println("Animal moves");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
    void move()
    {
        System.out.println("Dog runs");
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat meows");
    }
    void move()
    {
        System.out.println("Cat walks silently");
    }
}
class Bird extends Animal
{
    void sound()
    {
        System.out.println("Bird chirps");
    }
    void move()
    {
        System.out.println("Bird flies");
    }
}
public class AnimalDemo
{
    public static void main(String[] args)
    {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();

        a1.sound();
        a1.move();

        a2.sound();
        a2.move();

        a3.sound();
        a3.move();
    }
}
