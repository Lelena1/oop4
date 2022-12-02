import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private final String fullName;
    private final Boolean hasLicense;
    private final int experience;
    private final T car;

    public Driver(String fullName, T car) {
        this(fullName, false, 0, car);
    }

    public Driver(String fullName, Boolean hasLicense, int experience, T car) {
        this.fullName = ValidateUtils.validateString(fullName);
        this.hasLicense = ValidateUtils.validateBoolean(hasLicense);
        this.experience = ValidateUtils.validateNum(experience);
        this.car = car;
    }

    public void toStart() {
        System.out.printf("The driver %s started moving. ", this.fullName);
        this.car.startMoving();
    }

    public void toStop() {
        System.out.printf("The driver %s stopped. ", this.fullName);
        this.car.finish();
    }

    public void toRefuel() {
        System.out.printf("The driver %s refueled the vehicle.\n", this.fullName);
    }

    public String participateInTheRace() {
        return "The driver  " + this.fullName + " is driving the vehicle  " + this.car.getBrand() +
                " " + this.car.getModel() + " and will participate in the race.";
    }

    public String getFullName() {
        return fullName;
    }

    public Boolean getHasLicense() {
        return hasLicense;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(hasLicense, driver.hasLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, hasLicense, experience);
    }

    @Override
    public String toString() {
        return "Driver: " +
                "fullName: " + fullName +
                ", hasLicense: " + hasLicense +
                ", experience: " + experience +
                ".";
    }
}
