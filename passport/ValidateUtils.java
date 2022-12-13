package passport;

import java.time.LocalDate;

public class ValidateUtils {
    public static String validateString(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "нет данных" : value;
    }

    public static LocalDate validateLocalDate(LocalDate value) {

        return value == null ? LocalDate.now().minusYears(14) : value;
    }
}
