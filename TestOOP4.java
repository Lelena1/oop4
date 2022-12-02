public class TestOOP4 {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Grande", 1.7, 23.5, 300);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, 23.0, 320);
        Car bmw = new Car("BMW", "Z8", 3.0, 22.6, 335);
        Car kia = new Car("KIA", "Sportage 4 generation", 2.4, 23.7, 295);

        System.out.println();
        lada.showCharacteristics();
        audi.showCharacteristics();
        bmw.showCharacteristics();
        kia.showCharacteristics();

        Bus liAZ = new Bus("LiAZ", "5256", 6.8, 36.7, 150);
        Bus gaz = new Bus("GAZ", "4234", 2.9, 39.2, 127);
        Bus paz = new Bus("PAZ", "4234", 4.7, 44.2, 106);
        Bus autosan = new Bus("AUTOSAN", "A10-12T ORZEL", 8.27, 32.8, 180);

        System.out.println();
        liAZ.showCharacteristics();
        gaz.showCharacteristics();
        paz.showCharacteristics();
        autosan.showCharacteristics();

        Truck scania = new Truck("Scania", "R 420", 11.7, 40.0, 150);
        Truck renault = new Truck("Renault", "Magnum 460 DXI", 12.0, 38.9, 153);
        Truck volvo = new Truck("Volvo", "FMX", 10.8, 48.7, 144);
        Truck man = new Truck("Man", "TGS 33.480", 12.4, 38.4, 155);

        System.out.println();
        scania.showCharacteristics();
        renault.showCharacteristics();
        volvo.showCharacteristics();
        man.showCharacteristics();

        System.out.println();
        checkCompeting(lada, liAZ, renault);

        lada.startMoving();
        audi.showBestLapTime();
        bmw.showMaxSpeed();
        kia.finish();
        lada.getAllPitStopActions();
        audi.doPitStop(Car.ACT_REFUEL);
        System.out.println();

        liAZ.startMoving();
        gaz.showBestLapTime();
        paz.showMaxSpeed();
        autosan.finish();
        gaz.doPitStop(Bus.ALL_PIT_STOP_ACTIONS[0]);
        System.out.println();

        man.startMoving();
        renault.showBestLapTime();
        volvo.showMaxSpeed();
        scania.finish();
        scania.doPitStop(Truck.ACT_CHECK_TECHNICAL_CONDITION);
        System.out.println();

        System.out.println(bmw);
        DriverB driverB = new DriverB("Borisov Boris Borisovich", true, 5, lada);
        System.out.println(driverB.participateInTheRace());
        System.out.println(driverB);
        driverB.toStart();
        driverB.toStop();
        driverB.toRefuel();

        System.out.println();

        System.out.println(scania);
        DriverC driverC = new DriverC ("Klimov Klim Klimovich", true, 12, scania);
        System.out.println(driverC.participateInTheRace());
        System.out.println(driverC);
        driverC.toStart();
        driverC.toStop();
        driverC.toRefuel();
        System.out.println();

        System.out.println(paz);
        DriverD driverD = new DriverD("Petrov Petr Petrovich", true, 3, paz);
        System.out.println(driverD.participateInTheRace());
        System.out.println(driverD);
        driverD.toStart();
        driverD.toStop();
        driverD.toRefuel();

    }

    public static void checkCompeting(Competing... transports) {
        for (Competing transport : transports) {
            for (String action : transport.getAllPitStopActions()) {
                transport.doPitStop(action);
            }
            System.out.println();
        }
    }
}
