
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Transport {
    private final String brand;
    private final String model;

    private double engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>();

    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Transport() {
        this("no information", "no information", 0.0);
    }

    public Transport(String brand, String model, double engineVolume) {

        this.brand = ValidateUtils.validateString(brand);
        this.model = ValidateUtils.validateString(model);
        this.engineVolume = ValidateUtils.validateDoubleNum(engineVolume);
    }


    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = ValidateUtils.validateDoubleNum(engineVolume);
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void startMoving();

    public abstract void finish();

    public abstract void printType();

    public void showCharacteristics() {
        System.out.println(toString());
    }

    public abstract boolean diagnostics();

    public abstract void fixTransport();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
