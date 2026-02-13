interface Vehicle
{
    void start();
    void stop();
    void accelerate();
}

class Car implements Vehicle
{
    public void start()
    {
        System.out.println("Car Started");
    }

    public void stop()
    {
        System.out.println("Car Stopped");
    }

    public void accelerate()
    {
        System.out.println("Car Accelerating");
    }
}

class Main5c
{
    public static void main(String args[])
    {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.stop();
    }
}