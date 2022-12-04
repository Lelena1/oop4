import java.util.Objects;

public class Car extends Transport implements Competing {

    public static final String ACT_REFUEL = "Заправить топливом";
    public static final String ACT_CHANGE_TIRES = "Сменить шины";
    public static final String ACT_CHECK_TECHNICAL_CONDITION = "Проверить техническое состояние машины";
    public static final String[] ALL_PIT_STOP_ACTIONS = {ACT_REFUEL, ACT_CHANGE_TIRES,
            ACT_CHECK_TECHNICAL_CONDITION};
    private final double bestLapTime;
    private final int maxSpeed;
    private BodyType bodyType;


    public Car() {
        this("no information", "no information", 0.0, 0.0, 0, null);
    }

    public Car(String brand, String model, double engineVolume, double bestLapTime, int maxSpeed, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bestLapTime = ValidateUtils.validateDoubleNum(bestLapTime);
        this.maxSpeed = ValidateUtils.validateNum(maxSpeed);
        this.bodyType = bodyType;
    }


    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("The car started quickly");
    }

    @Override
    public void finish() {
        System.out.println("The car finished quickly");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по автомобилю недостаточно");
        } else {
            System.out.println("Тип кузова автомобиля: " + bodyType + ".");
        }
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
        System.out.println("Выполняю действие в процессе пит-стопа автомобиля: " + action);
        switch (action) {
            case ACT_REFUEL:
                System.out.println("Открыть бак");
                System.out.println("Заправить машину");
                System.out.println("Закрыть бак");
                break;
            case ACT_CHECK_TECHNICAL_CONDITION:
                System.out.println("Проверить надежность основных креплений");
                System.out.println("Исправить обнаруженные проблемы");
                break;
            case ACT_CHANGE_TIRES:
                System.out.println("Открутить болты");
                System.out.println("Заменить колесо");
                System.out.println("Закрутить колесо");
                break;
            default:
                System.out.println("Нет такого действия");
        }
    }

    @Override
    public void showBestLapTime() {
        System.out.println("The best lap time for a car is " + bestLapTime);
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
        Car car = (Car) o;
        return Double.compare(car.bestLapTime, bestLapTime) == 0 && maxSpeed == car.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bestLapTime, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() +
                " литра, лучшее время круга: " + bestLapTime + " мин., максимальная скорость: " + maxSpeed +
                " км/ч.";
    }
}




