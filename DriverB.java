public class DriverB extends Driver<Car> {

    public DriverB(String fullName, Car car) {
        this(fullName, false, 0, car);
    }

    public DriverB(String fullName, Boolean hasLicense, int experience, Car car) {
        super(fullName, true, experience, car);
    }
}