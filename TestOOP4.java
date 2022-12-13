import java.util.HashSet;
import java.util.Set;

public class TestOOP4 {
    public static void main(String[] args) {

//        Mechanic<Transport> alex = new Mechanic<>("Александр Арбузов", "Мехавто");
// По ДЗ 3 Заданию 1 урока Колеекции-2 пытаемся добавить 2 механика anton1, anton2 по ремонту легковых авто
// - объекты разные, но наполнение одно и то же)
        Mechanic<Car> anton1 = new Mechanic<>("Антон Рублев", "Автозапчасти");
        Mechanic<Car> anton2 = new Mechanic<>("Антон Рублев", "Автозапчасти");

//        Mechanic<Truck> stas = new Mechanic<>("Стас Отверткин", "Ремавтопром");
//        Mechanic<Bus> slava = new Mechanic<>("Вячеслав Ремонтов", "Стройавтосервис");
//        Mechanic<Transport> igor = new Mechanic<>("Игорь Кузовикин", "Дельтаавторемстрой");


//        Sponsor tatneft = new Sponsor("Татнефть", 31_500.90);
//        Sponsor gazprom = new Sponsor("Газпром", 20_500.50);
//        Sponsor transgaz = new Sponsor("Трансгаз", 15_700.50);
//        Sponsor transsib = new Sponsor("Транссиб", 19_200.30);
//        Sponsor rosneft = new Sponsor("Роснефть", 55_100.50);
//По ДЗ 3 Заданию 1 урока Колеекции-2 пытаемся добавить 2 спонсора - объекты разные, но наполнение
// одно и то же)
        Sponsor bashneft1 = new Sponsor("Башнефть", 35_350.50);
        Sponsor bashneft2 = new Sponsor("Башнефть", 35_350.50);

//По ДЗ 3 Заданию 1 урока Колеекции-2 пытаемся добавить 2 авто lada - объекты разные, но наполнение
// одно и то же)
        Car lada1 = new Car("Lada", "Grande", 1.7, 23.5, 300, BodyType.SEDAN);
        Car lada2 = new Car("Lada", "Grande", 1.7, 23.5, 300, BodyType.SEDAN);

//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, 23.0, 320, BodyType.COUPE);
//        Car bmw = new Car("BMW", "Z8", 3.0, 22.6, 335, BodyType.HATCHBACK);
//        Car kia = new Car("KIA", "Sportage 4 generation", 2.4, 23.7, 295, BodyType.COMPARTMENT);

//По ДЗ 3 Заданию 1 урока Колеекции-2 пытаемся добавить 2 водителя boris1 и boris2 - объекты разные, но наполнение
// одно и то же - дубля нет)
        DriverB boris1 = new DriverB("Borisov Boris Borisovich", true, 5, lada1);
        DriverB boris2 = new DriverB("Borisov Boris Borisovich", true, 5, lada1);
//
//        DriverB klava = new DriverB("Kulikova Klava Michajlovna", true, 2, audi);
//        DriverB serg = new DriverB("Sergeev Sergej Sergeevich", true, 7, bmw);
//        DriverB anna = new DriverB("Alisheva Anna Grigorjevna", true, 15, kia);


//        lada.addDriver(boris);
//        lada.addMechanic(anton);
//        lada.addSponsor(gazprom);

//        lada.diagnostics();
//        lada.fixTransport();

//        audi.addDriver(klava);
//        audi.addMechanic(alex);
//        audi.addSponsor(tatneft, rosneft);
//
//        bmw.addDriver(serg);
//        bmw.addMechanic(igor, anton);
//        bmw.addSponsor(bashneft);
//
//        kia.addDriver(anna);
//        kia.addMechanic(alex, igor);
//        kia.addSponsor(tatneft, transsib, rosneft);

//        System.out.println();
//        lada.showCharacteristics();
//        audi.showCharacteristics();
//        bmw.showCharacteristics();
//        kia.showCharacteristics();

//        Bus liAZ = new Bus("LiAZ", "5256", 6.8, 36.7, 150, Capacity.LARGE);
//        Bus gaz = new Bus("GAZ", "4234", 2.9, 39.2, 127, Capacity.SMALL);
//        Bus paz = new Bus("PAZ", "4234", 4.7, 44.2, 106, Capacity.EXTRA_LARGE);
//        Bus autosan = new Bus("AUTOSAN", "A10-12T ORZEL", 8.27, 32.8, 180, Capacity.MEDIUM);
//
//        DriverD ivan = new DriverD("Ivanov Ivan Ivanovich", true, 7, liAZ);
//        DriverD semen = new DriverD("Semenov Semen Semenovich", true, 12, gaz);
//        DriverD petr = new DriverD("Petrov Petr Petrovich", true, 17, paz);
//        DriverD artem = new DriverD("Artemov Artem Artemovich", true, 10, autosan);

//        liAZ.addDriver(ivan);
//        liAZ.addMechanic(slava);
//        liAZ.addSponsor(bashneft);
//        liAZ.diagnostics();
//        liAZ.fixTransport();
//
//        gaz.addDriver(semen);
//        gaz.addMechanic(igor, slava);
//        gaz.addSponsor(tatneft, rosneft);
//
//        paz.addDriver(petr);
//        paz.addMechanic(igor, alex);
//        paz.addSponsor(gazprom, transsib);
//
//        autosan.addDriver(artem);
//        autosan.addMechanic(alex, slava);
//        autosan.addSponsor(gazprom, rosneft);
//
//        System.out.println();
//        lada.showCharacteristics();
//        audi.showCharacteristics();
//        bmw.showCharacteristics();
//        kia.showCharacteristics();
//
//        System.out.println();
//        liAZ.showCharacteristics();
//        gaz.showCharacteristics();
//        paz.showCharacteristics();
//        autosan.showCharacteristics();

//        Truck scania = new Truck("Scania", "R 420", 11.7, 40.0, 150, LoadCapacity.N1);
//        Truck renault = new Truck("Renault", "Magnum 460 DXI", 12.0, 38.9, 153, LoadCapacity.N2);
//        Truck volvo = new Truck("Volvo", "FMX", 10.8, 48.7, 144, LoadCapacity.N3);
//        Truck man = new Truck("Man", "TGS 33.480", 12.4, 38.4, 155, LoadCapacity.N3);
//
//        DriverC klim = new DriverC("Klimov Klim Klimovich", true, 4,scania);
//        DriverC lev = new DriverC("Lvov Lev Lvovich", true, 6, renault);
//        DriverC kim = new DriverC("Kimov Kim Kimovich", true, 3, volvo);
//        DriverC akim = new DriverC("Aklimov Aklim Aklimovich", true, 9, man);
//
//        scania.addDriver(klim);
//        scania.addMechanic(igor, stas);
//        scania.addSponsor(tatneft, bashneft);
//
//        renault.addDriver(lev);
//        renault.addMechanic(stas, alex);
//        renault.addSponsor(gazprom, tatneft, rosneft);
//
//        volvo.addDriver(kim);
//        volvo.addMechanic(alex, stas);
//        volvo.addSponsor(gazprom, transsib, transgaz);
//
//        man.addDriver(akim);
//        man.addMechanic(alex, igor);
//        man.addSponsor(bashneft, rosneft);
//        man.diagnostics();
//        man.fixTransport();

        System.out.println("Тестирование изменений по недопущению дублей в соответствии с ДЗ 3 заданием 1:");
        Set<Transport> transports = new HashSet<>();
        transports.add(lada1);
        transports.add(lada2);

        Set<DriverB> drivers = new HashSet<>();
        drivers.add(boris1);
        drivers.add(boris2);

        Set<Mechanic<?>> mechanics = new HashSet<>();
        mechanics.add(anton1);
        mechanics.add(anton2);

        Set<Sponsor> sponsors = new HashSet<>();
        sponsors.add(bashneft1);
        sponsors.add(bashneft2);


        System.out.println(transports);
        System.out.println(drivers);
        System.out.println(mechanics);
        System.out.println(sponsors);

//
//        System.out.println();
//        scania.showCharacteristics();
//        renault.showCharacteristics();
//        volvo.showCharacteristics();
//        man.showCharacteristics();

//        List<Transport> transports = List.of(
//                lada, audi, bmw, kia,
//                liAZ, gaz, paz, autosan,
//                scania, renault, volvo, man);
//
//
//        for (Transport transport: transports) {
//            printList(transport);
//        }

//        ServiceStation serviceStation = new ServiceStation();
//        System.out.println("-------------------------------");
//        serviceStation.addCar(lada);
//        serviceStation.diagnostics();
//        serviceStation.addCar(audi);
//        serviceStation.diagnostics();
//        serviceStation.addCar(bmw);
//        serviceStation.diagnostics();
//        serviceStation.addCar(kia);
//        serviceStation.diagnostics();
//        serviceStation.addTruck(scania);
//        serviceStation.diagnostics();
//        serviceStation.addTruck(renault);
//        serviceStation.diagnostics();
//        serviceStation.addTruck(volvo);
//        serviceStation.diagnostics();
//        serviceStation.addTruck(man);
//        serviceStation.diagnostics();
//        System.out.println("-------------------------------");


//        System.out.println();
//        checkCompeting(lada, liAZ, renault);
//
//        lada.startMoving();
//        audi.showBestLapTime();
//        bmw.showMaxSpeed();
//        kia.finish();
//        lada.getAllPitStopActions();
//        audi.doPitStop(Car.ACT_REFUEL);
//        System.out.println();
//
//        liAZ.startMoving();
//        gaz.showBestLapTime();
//        paz.showMaxSpeed();
//        autosan.finish();
//        gaz.doPitStop(Bus.ALL_PIT_STOP_ACTIONS[0]);
//        System.out.println();
//
//        man.startMoving();
//        renault.showBestLapTime();
//        volvo.showMaxSpeed();
//        scania.finish();
//        scania.doPitStop(Truck.ACT_CHECK_TECHNICAL_CONDITION);
//        System.out.println();
//
//        System.out.println(bmw);
//        DriverB driverB = new DriverB("Borisov Boris Borisovich", true, 5, lada);
//        System.out.println(driverB.participateInTheRace());
//        System.out.println(driverB);
//        driverB.toStart();
//        driverB.toStop();
//        driverB.toRefuel();
//
//        System.out.println();
//
//        System.out.println(scania);
//        DriverC driverC = new DriverC("Klimov Klim Klimovich", true, 12, scania);
//        System.out.println(driverC.participateInTheRace());
//        System.out.println(driverC);
//        driverC.toStart();
//        driverC.toStop();
//        driverC.toRefuel();
//        System.out.println();
//
//        System.out.println(paz);
//        DriverD driverD = new DriverD("Petrov Petr Petrovich", null, 3, paz);
//        System.out.println(driverD.participateInTheRace());
//        System.out.println(driverD);
//        driverD.toStart();
//        driverD.toStop();
//        driverD.toRefuel();
//        System.out.println();
//
//        lada.printType();
//        volvo.printType();
//        paz.printType();
//        System.out.println();
//
////        diagnostics(lada, audi, kia, bmw, liAZ, gaz, paz, autosan, scania, renault, volvo, man);
    }


    private static void printList(Transport transport) {
        System.out.println("Данные по транспортному средству: " + transport.getBrand() + " " + transport.getModel() + ":");
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println("Спонсоры: " + transport.getSponsors());
    }
//
//    public static void checkCompeting(Competing... transports) {
//        for (Competing transport : transports) {
//            for (String action : transport.getAllPitStopActions()) {
//                transport.doPitStop(action);
//            }
//            System.out.println();
//        }
//    }
//
//    private static void diagnostics(Transport... transports) {
//        for (Transport transport : transports) {
//            diagnosticsTransport(transport);
//        }
//    }
//
//    private static void diagnosticsTransport(Transport transport) {
//        try {
//            if (!transport.diagnostics()) {
//                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() +
//                        " не прошел диагностику");
//            }
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Проверка проведена для автомобиля " + transport.getBrand() + " " +
//                    transport.getModel());
//        }
}

