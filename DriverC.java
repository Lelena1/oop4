public class DriverC extends Driver<Truck> {
    public DriverC(String fullName, Truck car) {
        super(fullName, false, 0, car);
    }

    public DriverC(String fullName, Boolean hasLicense, int experience, Truck car) {
        super(fullName, true, experience, car);
    }
}
