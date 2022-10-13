public class Bike extends Vehicle{
    public Bike(VehicleImplementation travel) {
        super(travel);
    }

    @Override
    public void Drive() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Book() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Ride() {
        System.out.println("I am riding a Bike");
    }
}
