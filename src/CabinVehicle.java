public class CabinVehicle extends Vehicle{
    public CabinVehicle(VehicleImplementation travel) {
        super(travel);
    }

    @Override
    public void Drive() {
        System.out.println("I am driving a Cabin Vehicle");
    }
    public void Book(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void Ride() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
