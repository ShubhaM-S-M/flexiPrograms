class SmartDevice
{
    int deviceId;
    String brand;

    SmartDevice(int deviceId, String brand)
    {
        this.deviceId = deviceId;
        this.brand = brand;
    }

    void turnOn()
    {
        System.out.println("Device Turned On");
    }

    void turnOff()
    {
        System.out.println("Device Turned Off");
    }
}

class SmartLight extends SmartDevice
{
    int brightnessLevel;

    SmartLight(int deviceId, String brand, int brightnessLevel)
    {
        super(deviceId, brand);
        this.brightnessLevel = brightnessLevel;
    }

    void adjustBrightness()
    {
        System.out.println("Brightness Level = " + brightnessLevel);
    }
}

class SmartThermostat extends SmartDevice
{
    int temperature;

    SmartThermostat(int deviceId, String brand, int temperature)
    {
        super(deviceId, brand);
        this.temperature = temperature;
    }

    void setTemperature()
    {
        System.out.println("Temperature Set To = " + temperature);
    }
}

class SmartCamera extends SmartDevice
{
    String resolution;

    SmartCamera(int deviceId, String brand, String resolution)
    {
        super(deviceId, brand);
        this.resolution = resolution;
    }

    void recordVideo()
    {
        System.out.println("Recording in " + resolution);
    }
}

class Main3b
{
    public static void main(String args[])
    {
        SmartLight l = new SmartLight(1, "Philips", 80);
        l.turnOn();
        l.adjustBrightness();
        l.turnOff();

        System.out.println();

        SmartThermostat t = new SmartThermostat(2, "Samsung", 25);
        t.turnOn();
        t.setTemperature();
        t.turnOff();

        System.out.println();

        SmartCamera c = new SmartCamera(3, "Sony", "1080p");
        c.turnOn();
        c.recordVideo();
        c.turnOff();
    }
}