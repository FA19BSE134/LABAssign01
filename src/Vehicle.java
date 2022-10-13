public abstract class Vehicle {
    protected VehicleImplementation travel;
    public Vehicle(VehicleImplementation travel){
        this.travel = travel;
    }
    public abstract void Drive();
    public abstract void Book();
    public  abstract void Ride();
}
