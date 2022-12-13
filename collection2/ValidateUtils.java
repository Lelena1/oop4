package collection2;

public class ValidateUtils {
    public static String validateString(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        return value;
    }

    public static double validateDouble(double value) {

        if (value <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        return value;
    }
}
