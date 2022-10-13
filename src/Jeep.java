public class Jeep extends Car {
    public Jeep(VehicleImplementation travel) {
        super(travel);
    }

    @Override
    public void Drive() {
        System.out.println("The Car I am driving is a jeep");
    }
    public void Drive4W(){
        System.out.println("I am driving a jeep in D4W mode");
    }
}
