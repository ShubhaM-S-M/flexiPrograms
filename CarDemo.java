class Car
{
    void start()
    {
        System.out.println("I am a Car");
    }

    void fuelType()
    {
        System.out.println("Uses fuel");
    }
}

class BMW extends Car
{
    void start()
    {
        System.out.println("I am BMW");
    }

    void fuelType()
    {
        System.out.println("BMW uses petrol");
    }
}

class Audi extends Car
{
    void start()
    {
        System.out.println("I am Audi");
    }

    void fuelType()
    {
        System.out.println("Audi uses diesel");
    }
}

class Tesla extends Car
{
    void start()
    {
        System.out.println("I am Tesla");
    }

    void fuelType()
    {
        System.out.println("Tesla uses electricity");
    }
}

class Toyota extends Car
{
    void start()
    {
        System.out.println("I am Toyota");
    }

    void fuelType()
    {
        System.out.println("Toyota uses petrol");
    }
}

public class CarDemo
{
    public static void main(String[] args)
    {
        Car c1 = new BMW();
        Car c2 = new Audi();
        Car c3 = new Tesla();
        Car c4 = new Toyota();

        c1.start();
        c1.fuelType();

        c2.start();
        c2.fuelType();

        c3.start();
        c3.fuelType();

        c4.start();
        c4.fuelType();
    }
}
