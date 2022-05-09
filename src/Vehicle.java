abstract public class Vehicle
{
    int wheels;

    public Vehicle(int wheels)
    {
        this.wheels = wheels;
    }

    public int getWheels()
    {
        return wheels;
    }

    abstract public void sound();
}
