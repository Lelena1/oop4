import java.util.Objects;

public class Truck extends Transport implements Competing {

    public static final String ACT_REFUEL = "Заправить топливом";
    public static final String ACT_CHECK_TECHNICAL_CONDITION = "Проверить техническое состояние машины";
    public static final String ACT_REPAIR = "Сделать быстрый ремонт";
    public static final String[] ALL_PIT_STOP_ACTIONS = {ACT_REFUEL, ACT_CHECK_TECHNICAL_CONDITION, ACT_REPAIR};
    private final double bestLapTime;
    private final int maxSpeed;

    public Truck() {
        this("no information", "no information", 0.0, 0.0,
                0);
    }

    public Truck(String brand, String model, double engineVolume, double bestLapTime, int maxSpeed) {
        super(brand, model, engineVolume);
        this.bestLapTime = ValidateUtils.validateDoubleNum(bestLapTime);
        this.maxSpeed = ValidateUtils.validateNum(maxSpeed);
    }

    @Override
    public void startMoving() {
        System.out.println("Truck is starting");
    }

    @Override
    public void finish() {
        System.out.println("Truck is finish");
    }

    public void showCharacteristics() {
        System.out.println(toString());
    }


    @Override
    public String[] getAllPitStopActions() {
        return ALL_PIT_STOP_ACTIONS;
    }

    @Override
    public void doPitStop(String action) {
        System.out.println("Выполняю действие в процессе пит-стопа грузовика: " + action);
        switch (action) {
            case ACT_REFUEL:
                System.out.println("Открыть бак");
                System.out.println("Заправить машину");
                System.out.println("Закрыть бак");
                break;
            case ACT_CHECK_TECHNICAL_CONDITION:
                System.out.println("Проверить надежность основных креплений");
                System.out.println("Выявить проблемы");
                break;
            case ACT_REPAIR:
                System.out.println("Быстро устранить неполадки");
                break;
            default:
                System.out.println("Нет такого действия");
        }
    }

    @Override
    public void showBestLapTime() {
        System.out.println("The best lap time for a truck is " + bestLapTime);
    }

    @Override
    public void showMaxSpeed() {
        System.out.println("The maximum speed of the car is " + maxSpeed);
    }

    public double getBestLapTime() {
        return bestLapTime;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.bestLapTime, bestLapTime) == 0 && maxSpeed == truck.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bestLapTime, maxSpeed);
    }

    @Override
    public String toString() {
        return "Грузовик " + getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() +
                " литра, лучшее время круга: " + bestLapTime + " мин., максимальная скорость: " + maxSpeed +
                " км/ч.";
    }
}
