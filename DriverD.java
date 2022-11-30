public class DriverD<T extends Bus> extends Driver {

    public DriverD(String fullName, Boolean hasLicense, int experience) {
        super(fullName, hasLicense, experience);
    }


    @Override
    public String toStart() {
        return "The driver of the bus started moving";
    }

    @Override
    public String toStop() {
        return "The driver of the bus stopped";
    }

    @Override
    public String toRefuel() {
        return "The driver refuels the bus";
    }

    public String participateInTheRace(T bus) {
        return "The driver  " + getFullName() + "is driving the bus  " + bus.getBrand() + " " + bus.getModel() +
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
