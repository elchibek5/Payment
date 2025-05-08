package vehicle;

public class Train extends TransportVehicle{
    public Train(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.printf(name + " is accelerating on tracks at " + speed + " km/h");
    }
}
