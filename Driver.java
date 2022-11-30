import java.util.Objects;

public abstract class Driver {
    private final String fullName;
    private final Boolean hasLicense;
    private final int experience;

    public Driver(String fullName) {
        this(fullName, true, 0);
    }

    public Driver(String fullName, Boolean hasLicense, int experience) {
        this.fullName = ValidateUtils.validateString(fullName);
        this.hasLicense = ValidateUtils.validateBoolean(hasLicense);
        this.experience = ValidateUtils.validateNum(experience);
    }

    public abstract String toStart();

    public abstract String toStop();

    public abstract String toRefuel();

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
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", hasLicense=" + hasLicense +
                ", experience=" + experience +
                '}';
    }
}
