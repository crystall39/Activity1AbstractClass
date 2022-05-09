import java.util.ArrayList;

public class Runner
{
    public static void main(String[] args)
    {
        Car car = new Car();
        Plane plane = new Plane(16);

        ArrayList<Vehicle> arr = new ArrayList<>();
        arr.add(car);
        arr.add(plane);

        for (Vehicle vehicle :arr)
        {
            System.out.println(vehicle.getWheels());
            vehicle.sound();
        }
    }
}
