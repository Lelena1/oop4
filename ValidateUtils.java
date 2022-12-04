public class ValidateUtils {
    public static String validateString(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "no information" : value;
    }

    public static int validateNum(int value) {
        return value < 0 ? Math.abs(value) : value;
    }

    public static double validateDoubleNum(double value) {
        return value < 0 ? Math.abs(value) : value;
    }

}
