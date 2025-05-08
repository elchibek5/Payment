package vehicle;

public class Bicycle extends TransportVehicle{
    public Bicycle (String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.printf(name + " pedaling at " + speed + "km/h");
    }
}
