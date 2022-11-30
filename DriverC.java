public class DriverC<T extends Truck> extends Driver {
    public DriverC(String fullName) {
        super(fullName, true, 0);
    }

    public DriverC(String fullName, Boolean hasLicense, int experience) {
        super(fullName, hasLicense, experience);
    }

    @Override
    public String toStart() {
        return "The driver of the truck started moving";
    }

    @Override
    public String toStop() {
        return "The driver of the truck stopped";
    }

    @Override
    public String toRefuel() {
        return "The driver refuels the truck";
    }

    public String participateInTheRace(T truck) {
        return "The driver  " + getFullName() + "is driving the truck  " + truck.getBrand() + " " + truck.getModel() +
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
