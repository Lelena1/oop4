public class DriverB<T extends Car> extends Driver {

    public DriverB(String fullName) {
        super(fullName, true, 0);
    }

    public DriverB(String fullName, Boolean hasLicense, int experience) {
        super(fullName, hasLicense, experience);
    }

    @Override
    public String toStart() {
        return "The driver of the car started moving";
    }

    @Override
    public String toStop() {
        return "The driver of the car stopped";
    }

    @Override
    public String toRefuel() {
        return "The driver refuels the car";
    }

    public String participateInTheRace(T car) {
        return "The driver  " + getFullName() + "is driving the truck  " + car.getBrand() + " " + car.getModel() +
                " and will participate in the race.";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
