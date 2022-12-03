import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;


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

    public abstract void startMoving();

    public abstract void finish();

    public abstract void printType();

    public void showCharacteristics() {
        System.out.println(toString());
    }

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
