public class Car extends Vehicle{
    public Car(VehicleImplementation travel) {
        super(travel);
    }

    @Override
    public void Drive() {
        System.out.println("I am driving a car");
    }

    @Override
    public void Book() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Ride() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
