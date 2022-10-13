public class OpenrideVehicle extends Vehicle{

    public OpenrideVehicle(VehicleImplementation travel) {
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
        System.out.println("I am riding an Open Ride Vehicle");
    }
}
