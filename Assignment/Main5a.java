interface RemoteControl
{
    void turnOn();
    void turnOff();
    void increaseVolume();
    void decreaseVolume();
}

class TV implements RemoteControl
{
    public void turnOn()
    {
        System.out.println("TV Turned On");
    }

    public void turnOff()
    {
        System.out.println("TV Turned Off");
    }

    public void increaseVolume()
    {
        System.out.println("TV Volume Increased");
    }

    public void decreaseVolume()
    {
        System.out.println("TV Volume Decreased");
    }
}

class Main5a
{
    public static void main(String args[])
    {
        TV t = new TV();
        t.turnOn();
        t.increaseVolume();
        t.decreaseVolume();
        t.turnOff();
    }
}