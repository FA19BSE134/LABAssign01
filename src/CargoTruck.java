public class CargoTruck extends Vehicle{


    public CargoTruck(VehicleImplementation travel) {
        super(travel);
    }

    @Override
    public void Drive() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Book() {
        System.out.println("I am booking is a Cargo Truck");
    }

    @Override
    public void Ride() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
