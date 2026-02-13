interface SmartDevice
{
    void connectToWiFi();
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice
{
    public void connectToWiFi()
    {
        System.out.println("Smart Light Connected to WiFi");
    }

    public void turnOn()
    {
        System.out.println("Smart Light Turned On");
    }

    public void turnOff()
    {
        System.out.println("Smart Light Turned Off");
    }
}

class Main5d
{
    public static void main(String args[])
    {
        SmartLight s = new SmartLight();
        s.connectToWiFi();
        s.turnOn();
        s.turnOff();
    }
}