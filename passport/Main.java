package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("CE 23456", "Сизова", "Нина", "Ивановна",
                LocalDate.now().minusYears(45)));
        passports.add(new Passport("CE 23456", "Сизова", "Алина", "Ивановна",
                LocalDate.now().minusYears(17)));
        passports.add(new Passport("CE 23456", "Симонов", "Аркадий", "Петрович",
                LocalDate.now().minusYears(63)));

        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);
        passportList.add(new Passport("VT 23189", "Михайлов", "Михаил", "Михайлович",
                LocalDate.now().minusYears(34)));
        System.out.println(passportList);
        System.out.println(passportList.get("VT 23189"));
        passportList.add(new Passport("CE 23456", "Сизова", "Алина", "Ивановна",
                LocalDate.now().minusYears(17)));
        System.out.println(passportList);
    }
}
