public class DriverD extends Driver<Bus> {

    public DriverD(String fullName, Bus car) {
        super(fullName, false, 0, car);
    }

    public DriverD(String fullName, Boolean hasLicense, int experience, Bus car) {
        super(fullName, true, experience, car);
    }
}
