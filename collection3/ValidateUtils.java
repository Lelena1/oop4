package collection3;

public class ValidateUtils {
    public static String validateString(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "no information" : value;
    }
}
