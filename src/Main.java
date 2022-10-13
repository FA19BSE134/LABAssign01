public class Main {
    public static void main(String[] args) {
        //cabin Vehicle
        Vehicle CV = new CabinVehicle(new Travel());
        CV.Drive();
        //Open Ride Vehicle
        Vehicle ORV = new OpenrideVehicle(new Travel());
        ORV.Ride();
        //Car
        Vehicle Car = new Car(new Travel());
        Car.Drive();
        //Jeep
        Vehicle jeep = new Jeep(new Travel());
        jeep.Drive();
        //CargoTruck
        Vehicle Cargo = new CargoTruck(new Travel());
        Cargo.Book();
    }
}