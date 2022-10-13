public class Taxi extends Vehicle{

    public Taxi(VehicleImplementation travel) {
        super(travel);
    }

    @Override
    public void Drive() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Book() {
        System.out.println("I am booking a Taxi");
    }

    @Override
    public void Ride() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
