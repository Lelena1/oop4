import java.util.List;
import java.util.Objects;

public class Bus extends Transport implements Competing {

    private static final String ACT_REFUEL = "Заправить топливом";
    private static final String ACT_CHANGE_TIRES = "Сменить шины";
    private static final String ACT_CHANGE_DRIVER = "Сменить водителя";
    private static final String ACT_CHECK_TECHNICAL_CONDITION = "Проверить техническое состояние автобуса";
    public static final String[] ALL_PIT_STOP_ACTIONS = {ACT_REFUEL, ACT_CHANGE_TIRES, ACT_CHANGE_DRIVER,
            ACT_CHECK_TECHNICAL_CONDITION};
    public double bestLapTime;
    public int maxSpeed;
    private Capacity capacity;
    private List<Transport>buses;

    public List<Transport> getBuses() {
        return buses;
    }

    public void setBuses(List<Transport> buses) {
        this.buses = buses;
    }

    public Bus() {
        this("no information", "no information", 0.0, 0, 0, null);
    }

    public Bus(String brand, String model, double engineVolume, double bestLapTime, int maxSpeed, Capacity capacity) {
        super(brand, model, engineVolume);
        this.bestLapTime = ValidateUtils.validateDoubleNum(bestLapTime);
        this.maxSpeed = ValidateUtils.validateNum(maxSpeed);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void startMoving() {
        System.out.println("The bus is starting to move");
    }

    @Override
    public void finish() {
        System.out.println("The bus is finishing its moving");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по грузовику недостаточно");
        } else {
            String from = capacity.getFrom() == null ? "" : "от " + capacity.getFrom() + " ";
            String to = capacity.getTo() == null ? "" : "до " + capacity.getTo();
            System.out.println("Вместимость автобуса: " + from + to + " чел.");
        }
    }

    public void showCharacteristics() {
        System.out.println(toString());
    }

    @Override
    public boolean diagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается");
        return true;
    }

    @Override
    public void fixTransport() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " отремонтирован");
    }


    @Override
    public String[] getAllPitStopActions() {
        return ALL_PIT_STOP_ACTIONS;
    }

    @Override
    public void doPitStop(String action) {
        System.out.println("Выполняю действие в процессе пит-стопа автобуса: " + action);
        switch (action) {
            case ACT_REFUEL:
                System.out.println("Открыть бак");
                System.out.println("Заправить машину");
                System.out.println("Закрыть бак");
                break;
            case ACT_CHECK_TECHNICAL_CONDITION:
                System.out.println("Проверить надежность основных креплений");
                System.out.println("Подкрутить болты");
                break;
            case ACT_CHANGE_TIRES:
                System.out.println("Открутить болты");
                System.out.println("Заменить колесо");
                System.out.println("Закрутить колесо");
                break;
            case ACT_CHANGE_DRIVER:
                System.out.println("Провести медосмотр водителя");
                System.out.println("При возниновении проблем заменить водителя");
                break;
            default:
                System.out.println("Нет такого действия");
        }
    }

    @Override
    public void showBestLapTime() {
        System.out.println("The best lap time for a bus is " + bestLapTime);
    }

    @Override
    public void showMaxSpeed() {
        System.out.println("The maximum speed of the bus is " + maxSpeed);
    }

    public double getBestLapTime() {
        return bestLapTime;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return Double.compare(bus.bestLapTime, bestLapTime) == 0 && maxSpeed == bus.maxSpeed;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), bestLapTime, maxSpeed);
    }


    @Override
    public String toString() {
        return "Автобус " + getBrand() + ", модель " + getModel() + ", " +
                ", объем двигателя - " + getEngineVolume() + ", лучшее время круга: " + bestLapTime +
                " мин., максимальная скорость: " + maxSpeed + " км/ч.";
    }
}